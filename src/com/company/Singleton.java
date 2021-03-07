package com.company;

public class Singleton {
    private static Singleton singleton;
    private static String fileExample = "Here's the names of famous people - \n\n";

    public static synchronized Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }

    private Singleton() {
    }

    public void addInfo(String info) {
        fileExample = fileExample + info + "\n";
    }

    public void printFile() {
        System.out.println(fileExample);
    }
}
