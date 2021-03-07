package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Singleton.getSingleton().addInfo("Elon Musk");
        Singleton.getSingleton().addInfo("Bill Gates");
        Singleton.getSingleton().addInfo("Steve Jobs");
        Singleton.getSingleton().printFile();
    }
}
