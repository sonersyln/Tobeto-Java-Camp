package org.example.core;
public class MailLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Mail Log: " + message + " (mail ile loglandı.)");
    }
}
