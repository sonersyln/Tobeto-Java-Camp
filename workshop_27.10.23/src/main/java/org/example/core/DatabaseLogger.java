package org.example.core;
public class DatabaseLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Database Log: " + message + " (Veri tabanına loglandı.)");
    }
}
