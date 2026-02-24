
package org.example;

class tema {

    //E1.
    public static void mainTest(String[] args) {
        int varsta = 36;
        double inaltime = 1.78;
        boolean prezentaCurs = true;
        System.out.println("Varsta studentului este:" + varsta);
        System.out.println("Inaltimea studentului este:" + inaltime + " metri");

        if (prezentaCurs) {
            System.out.println("Studentul a fost prezent la curs");
        } else {
            System.out.println("Studentul nu a frost prezent la curs");
        }

//E2.
        int a = 18;
        int b = 26;
        double c = 47;

        int suma = a + b;

        double media = (a + b + c) / 3;

        System.out.println("Suma numelor int e:" + suma);
        System.out.println("Media numerelor int e:" + media);
//E3.
        int varstaPersoana = 14;
        if (varstaPersoana >= 18) {
            System.out.print("Acces permis");
        } else {
            System.out.print("Acces interzis");
        }
        System.out.println();
//E4.
        int sumaNumerelor = 0;
        for (int i = 20; i <= 50; i++) {
            sumaNumerelor = sumaNumerelor + i;
        }
        System.out.println("Suma de la 20 la 50 =" + sumaNumerelor);
//E5.
        int x = 10;
        while (x >= 1) {
            System.out.println(x);
            x--;
        }
//E6.
        System.out.println("Invat Java!");
    }

    //E7.
    public static int inmulteste(int a, int b) {
        int produs = a * b;
        return produs;
    }

    //E8.
    static int sumaNumerelor() {
        int suma = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0)
                suma = suma + i;
        }
        return suma;
    }

    public static void main(String[] args) {
        int rezultat = sumaNumerelor();
        System.out.println("Suma numerelor pare de la 1 la 50 este: " + rezultat);

    }
    //E9.
    public static int mediaIntregi(int a, int b, int c) {
        return (a + b + c) / 3;
    }
    //E10.
    static void numereCuprinse (int start, int end) {
        for (int i = start; i <= end; i ++) {
            System.out.println(i);
        }
    }
}

