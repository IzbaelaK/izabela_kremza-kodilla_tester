package com.kodilla.abstracts.homework;

public class Application {
        public static void main(String[] args) {
            
                int a = 5;
                int b = 6;
                int c = 7;
                int h = 4;
                System.out.println("Pole powierzchni kwadratu wynosi: " + (a * a));
                System.out.println("Obwód kwadratu wynosi: " + (4 * a));
                System.out.println("Pole powierzchni trójkąta wynosi: " + (0.5 * a * h));
                System.out.println("Obwód trójkąta wynosi: " + (a + b + c));
                System.out.println("Pole powierzchni równoległoboku wynosi: " + (a * h));
                System.out.println("Obwód równoległoboku wynosi: " + ((2 * a) + (2 * b)));

        }
}