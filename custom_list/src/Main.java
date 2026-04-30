import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new CustomList<>();
        list.add("ala");
        list.add("ma");
        list.add("kota");

        list.addFirst("Mała");

//        System.out.println(list.get(1));
//        System.out.println(list.size());

        /*
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
         */

        // BARDZO BARDZO BARDZO BARDZO BARDZO BARDZO NIEOPTYMALNIE
        for(int i=0; i < list.size(); i++)
            System.out.println(list.get(i));

        for (String s : list) System.out.println(s);

    }
}
