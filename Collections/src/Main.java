import javax.sound.midi.Soundbank;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, String[]> studentList = new HashMap<>();
        String[] student1a = {"Ali Çimen", "Suzan Baştürk", "Mehmet Çalış"};
        String[] student1b = {"Ertan Yıldız", "Osman Yılmaz", "Tacettin Nohut"};
        String[] student1c = {"Yeşim Sorar", "Coşan Nehir", "Ender Duran"};
        String[] student1d = {"Furkan Kısacık", "Ayhan Ayyıldız", "Sezai Karakoç"};
        String[] student1e = {"Aynur Ay", "Abdullah Kaya", "Ahmet Kural"};
        String[] student1f = {"Halil Sezai", "Ayhan Işık", "Canan Karatay"};
        studentList.put("1A", student1a);
        studentList.put("1B", student1b);
        studentList.put("1C", student1c);
        studentList.put("1D", student1d);
        studentList.put("1E", student1e);
        studentList.put("1F", student1f);



        System.out.println("------------1.Method------------");

        // Loop and Conditions
        for (String key : studentList.keySet()) {
            System.out.print("<= " + key + " =>");
            for (String studentWithClass : studentList.get(key)) {
                if (studentWithClass.split(" ")[0].endsWith("an")) {
                    System.out.print(studentWithClass);
                }
                System.out.println();
            }
        }

        System.out.println("------------2.Method------------");
        // Stream Api
        for (String key : studentList.keySet()) {
            String[] students = studentList.get(key);
            System.out.println(key + "--" + Arrays.stream(students).filter(x -> x.split(" ")[0].endsWith("an")).toList());
        }


        System.out.println("------------3.Method------------");

        // Loop and conditions with assignment. Values are 3 sized Arrays, there will be null values if it doesn't match with pattern
        HashMap<String, String[]> filteredHashMap = new HashMap<>();

        for (String key : studentList.keySet()) {
            // System.out.println(key);
            int index = 0;
            String[] filteredStudents = new String[3];
            for (String studentWithClass : studentList.get(key)) {
                // System.out.println(studentWithClass);
                if (studentWithClass.split(" ")[0].endsWith("an")) {
                    filteredStudents[index] = studentWithClass;
                    index++;
                }
                filteredHashMap.put(key, filteredStudents);
            }
        }
        // Printing
        for (String key : filteredHashMap.keySet()) {
            String[] students = filteredHashMap.get(key);
            System.out.println(key + "--" + Arrays.stream(students).toList());
        }
    }
}