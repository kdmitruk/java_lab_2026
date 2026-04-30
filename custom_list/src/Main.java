public class Main {
    public static void main(String[] args) {
        CustomList<String> list = new CustomList<>();
        list.addLast("ala");
        list.addLast("ma");
        list.addLast("kota");

        System.out.println(list.getLast());

        list.addFirst("Mała");

        System.out.println(list.getFirst());

        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
    }
}
