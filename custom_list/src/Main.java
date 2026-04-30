public class Main {
    public static void main(String[] args) {
        CustomList<String> list = new CustomList<>();
        list.addLast("ala");
        list.addLast("ma");
        list.addLast("kota");
        System.out.println(list.getLast());
    }
}
