package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

//Рандомные аяты из последних 3джузов
class Main {
    static void generateSelectAyah() throws Exception {
        List<String> list = new ArrayList<>();
        BufferedReader b = new BufferedReader(new FileReader("D:/quran.txt"));

        boolean propustit = true;
        while (b.ready()) {
            if (propustit) {
                for (int i = 0; i <= 5105; i++) {
                    b.readLine();
                }
                propustit = false;
            }
            list.add(b.readLine());
        }
        b.close();

        do {
            for (int j = 0; j <= 10; j++) {
                System.out.println(list.get(new Random().nextInt(list.size())));
            }
        } while (new Scanner(System.in).nextInt() == 1);
    }

    public static void main(String[] ar) throws Exception {
        generateSelectAyah();
    }
}