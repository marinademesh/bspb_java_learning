package ru.bspb.file_lesson8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;


public class Main {

    private static String s;

    public static void main(String[] args) throws IOException, FileNotFoundException {
        File dir = new File("c:\\Homework");
        ArrayList<String> namefile = new ArrayList<>();
        namefile.addAll(Arrays.asList(dir.list()));//создали массив имен файлов
        // System.out.println(namefile);-посмотреть все имена файлов в папке

        for (int i = 0; i < namefile.toArray().length; i++) {
            Path file = Path.of("c:/Homework/" + namefile.get(i));
            ArrayList<LogEntry> logEntries = new ArrayList<>();
            List<String> lines = (Files.readAllLines(file)); //записали строки в лист
            //    System.out.println(Files.readAllLines(file)); посмотреть что мы считали из всех файлов строки
            for (String line :
                    lines) {
                String timestamp = line.substring(0, 24);
                int k = line.indexOf(' ', 27);
               //  System.out.println (timestamp);
                String level = line.substring(26, k);
               // System.out.println (level);
                String message = line.substring(k).trim();
              //  System.out.println (message);

              //  String [] words = {timestamp,level,message};
               // System.out.println (words[0]);
              //  logEntries.add(new LogEntry(words[0],words[1],words[2]));
                logEntries.add(new LogEntry(timestamp,level,message));
            }

            System.out.println(logEntries);

            //    List<LogEntry> sortlogEntries = logEntries.stream()
            //            .filter(logEntry ->logEntry.getLevel()=="WARN")
            //   .collect(Collectors.toList());

            //** Для красивого вывода
            //    ArrayList<LogEntry> result = new ArrayList<>();
            //     result.addAll(sortlogEntries);
            //   Iterator<LogEntry> iterator1 = result.iterator();
            //   while (iterator1.hasNext()) {
            //       LogEntry bmp = iterator1.next();
            //        System.out.println(bmp);
            //     }
            //      }


        }
    }
}





