package org.example;

import org.hibernate.Session;

public class Main {

    private static final Session sess = Config.buildSession().openSession();

    public static void main(String[] args) {
        //System.out.println("Hello world!");
    }
}