package Homework2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader; 

/*
Дана строка (получение через обычный текстовый файл!!!)

"фамилия":"Иванов","оценка":"5","предмет":"Математика"
"фамилия":"Петрова","оценка":"4","предмет":"Информатика"

Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
.
 */
public class Task2 {
    public static void main(String[] args) {
        String[] build = new String[] {"Студент "," получил "," по предмету ",};
        String file_name = "Homework2/marks.txt";
        File file = new File(file_name);
        StringBuilder sb = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] info = toArray(line);
                for(int i = 0; i < build.length; i++)
                    sb.append(build[i]).append(info[i]);
                sb.append(".\n");
            }
            System.out.println(sb.toString());
            br.close();
        }
        catch (Exception e){
            System.out.println("Что-то пошло не так");
        }

    }

    public static String[] toArray(String str){
            String line1 = str.replace("\"", "");
            line1 = line1.replace(",", ":");
            String[] arr = line1.split(":");
            String[] info = new String[arr.length/2];
            int j = 0;
            for(int i = 1; i <= arr.length; i += 2){
                info[j] = arr[i];
                j++;
            }
            return info;
        }
    
}
