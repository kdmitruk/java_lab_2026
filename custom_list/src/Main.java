public class Main {
    public static void main(String[] args) {
        CustomList<String> list = new CustomList<>();
        list.addLast("ala");
        list.addLast("ma");
        list.addLast("kota");

        list.addFirst("Mała");

        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
    }
}
