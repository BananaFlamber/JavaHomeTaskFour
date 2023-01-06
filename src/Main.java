import java.util.*;

public class Main {
    public static void main(String[] args) {
        String notion = new String();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите пожалуйста строку вида ['Необходимый текст для записи~число']\n" +
                " -> где 'число' является номером записи в справочнике\n" +
                " -> а символ '~' - является разделителем.");
        do {
            notion = in.nextLine();
            notionCheck(notion);
            String[] parts = notionSplit(notion);

            System.out.println(Arrays.toString(parts));

            Map<Integer, String> notionMap = new HashMap<Integer, String>();
            Integer key = Integer.valueOf(parts[1]);

            notionMap.put(key, parts[0]);

            System.out.println(notionMap);
        }
        while (notion.contains("print"));
        {
            String[] parts = notionSplit(notion);

            System.out.println(Arrays.toString(parts));
            String result = new String();
            if (!notionMap.contains(parts[1])) {
                throw new IllegalArgumentException("Такого элемента не существует!");
            } else {
                result = notionMap.get(parts[1]);
                System.out.println(result);
            }
        }
    }

    public static String[] notionSplit(String notion) {
        String[] parts = new String[2];
        return parts = notion.split("~");
    }

    public static void notionCheck(String notion) {
        if (!notion.contains("~")) {
            throw new IllegalArgumentException("Ваша строка не содержит символ-разделитель '~'!");
        }
    }
}


///   Вторая задача
//
//    public static void main(String[] args) {
//
//        int[] listMas = {1,2,3,4,5,6,7,8};
//        LinkedList<Integer> linkList = new LinkedList<>();
//
//        for (Integer temp : listMas) {
//            linkList.add(temp);
//        }
//
//        int temp = 0;
//        while (temp != linkList.size() - 1) {
//            linkList.add(linkList.size()-temp, linkList.getFirst());
//            linkList.removeFirst();
//            temp++;
//        }
//
//
//        System.out.println("linkList = " + linkList);
//
//
//    }
//}
///