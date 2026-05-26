import cv2.dnn
import numpy as np


def main():
    net = cv2.dnn.readNet("coco/model.pbtxt", "coco/weights.pb")
    file = open("coco/labels.txt", "r")
    labels = file.read().split("\n")

    cap = cv2.VideoCapture(0)
    threshold = 0.4

    while True:
        _, img = cap.read()
        h, w = img.shape[:2]
        blob = cv2.dnn.blobFromImage(img, mean=(127.5, 127.5 ,127.5), scalefactor=1/127.5, size=(320, 320), swapRB=True, crop=False)

        net.setInput(blob)
        detection = net.forward()

        for roi in detection[0, 0, :, :]:
            confidence = roi[2]
            if confidence > threshold:
                label = labels[int(roi[1])-1]
                box = (roi[3:] * np.array([w, h, w, h])).astype(np.uint16)
                cv2.rectangle(img, (box[0], box[1]), (box[2], box[3]), (255, 0, 0), 2)
                img = cv2.putText(img, label , (box[0], box[1]), cv2.FONT_HERSHEY_SIMPLEX, 1, (255, 0, 0), 2)

        cv2.imshow("", img)
        if cv2.waitKey(1) == ord('q'):
            break


if __name__ == '__main__':
    main()