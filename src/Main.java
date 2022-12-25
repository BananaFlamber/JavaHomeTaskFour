import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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