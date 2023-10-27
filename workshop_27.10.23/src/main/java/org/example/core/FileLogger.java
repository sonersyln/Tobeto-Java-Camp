package org.example.core;
public class FileLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("File Log: " + message + " (Dosyaya loglandı.)");
    }
}
