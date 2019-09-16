public class MyListTest {
    public static void main(String[] args) {
        MyList<String> listString = new MyList<>();
        listString.add("e");
        listString.add("x");
        listString.add(0,"a");
        listString.add(1,"b");
        listString.add(2,"c");
        listString.add(2,"d");

        //listString.clear();

        //listString.remove(3);
        //System.out.println(listString.remove(3));

        System.out.println(listString.contains("f"));

        System.out.println(listString.indexOf("5"));

        for (int i = 0; i < listString.size(); i++) {
            System.out.println(listString.get(i));
        }

        //System.out.println(listString.toString());

        System.out.println(listString.size());

    }
}
