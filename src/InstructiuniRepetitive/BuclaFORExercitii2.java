package InstructiuniRepetitive;

import java.util.Scanner;

public class BuclaFORExercitii2 {

    public static void main(String[] args) {

//        1. Scrieti un program care cere utilizatorului sa introduca un numar de la consola; Daca numarul este par
//        acesta va fi printat de 10 ori; Daca nu, de 20;

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Introduceti numar:");
        int nr = sc1.nextInt();
        if (nr % 2 == 0) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(nr + "x" + i);
            }
        } else {
            for (int i = 1; i <= 20; i++) {
                System.out.println(nr + "x" + i);
            }
        }

//        2. Programul cere utilizatorului sa introduca un String text, apoi sa introduca un int x;
//        Textul va fi printat de la consola de x ori;

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introdu un text:");
        String text = sc2.nextLine();
        System.out.println("Introdu un numar:");
        int x = sc2.nextInt();
        for (int i = 1; i <= x; i++) {
            System.out.println(text + "x" + i);
        }

//        3. Programul cere utilizatorului sa introduca un String text, apoi sa introduca un numar;
//        Daca numarul este mai mic decat 5 textul se va printa de 10 ori pe linii diferite;
//        Daca nu de 10 ori pe acelasi rand cu spatiu intre;

        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Introducti textul dumneavoastra:");
        String text2 = sc3.nextLine();
        System.out.println("Introduceti un numar:");
        int numar = sc4.nextInt();
        if (numar < 5) {
            for (int i = 0; i < 10; i++) {
                System.out.println(text2);
            }
        } else {
            for (int i = 0; i < 10; i++) {
                System.out.print(text2 + " ");
            }
        }

//        4. Scrie un program care calculeaza si printeaza suma tuturor numerelor de la 0 la 50:

        int suma = 0;
        for (int i = 1; i <= 50; i++) {
            suma += i;
        }
        System.out.println("Suma tuturor numerelor de la 1 la 50 este " + suma);

//        5. Scrie un program care calculeaza suma numerelor impare cuprinse intre zero si 100

        int suma2 = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                suma2 = suma2 + i;
            }
        }
        System.out.println("suma numerelor impare cuprinse intre zero si 100 este " + suma2);

//        6. Scrie un program care calculeaza media aritmetica a tuturor numerelor de la 10 la 100:

        int suma3 = 0;
        int numere = 0;
        for (int i = 10; i <= 100; i++) {
            suma3 = suma3 + i;
            numere = numere + 1;
        }
        int medie = suma3 / numere;
        System.out.println("media aritmetica a tuturor numerelor de la 10 la 100 este " + medie);

//        7. Scrie un program care calculeaza suma si produsul numerelor cuprinse intre -5 si 5

        int suma4 = 0;
        int produs = 1;
        for (int i = -5; i <= 5; i++) {
            suma4 = suma4 + i;
            produs = produs * i;
        }
        System.out.println("Suma numerelor cuprinse intre -5 si 5 este " + suma4);
        System.out.println("Produsul numerelor cuprinse intre -5 si 5 este " + produs);

//        8. Programul va cere userului sa introduca un numar de la tastatura;
//        Daca este pozitiv se calculeaza produsul numerelor pare de la 1 la acel numar;
//        Daca este negativ se calculeaza suma numerelor impare de la zero la acel numar;

        Scanner sc5 = new Scanner(System.in);
        System.out.println("Introduceti un numar:");
        int numar1 = sc5.nextInt();
        if (numar1 >= 0) {
            int produs1 = 1;
            for (int i = 1; i <= numar1; i++) {
                if (i % 2 == 0) {
                    produs1 = produs1 * i;
                }
            }
            System.out.println("Produsul numerelor pare de la 1 la " + numar1 + " este " + produs1);
        } else {
            int suma1 = 0;
            for (int i = 0; i >= numar1; i--) {
                if (i % 2 != 0) {
                    suma1 = suma1 + i;
                }
            }
            System.out.println("suma numerelor impare de la zero la " + numar1 + " este " + suma1);
        }
    }
}
