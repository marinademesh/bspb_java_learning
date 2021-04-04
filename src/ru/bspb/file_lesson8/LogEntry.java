package ru.bspb.file_lesson8;

import ru.bspb.clients_lesson4.Person;

import java.util.List;
import java.util.stream.Collector;

public class LogEntry {
    private String timestamp;
    private String level;
    private String message;

    public LogEntry(String timestamp, String level, String message) {
        this.timestamp = timestamp;
        this.level = level;
        this.message = message;
    }


    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static void print(LogEntry[] logEntries) {
        for (int i = 0; i < logEntries.length; i++) {
            System.out.println(logEntries[i].toString());


        }
    }
}