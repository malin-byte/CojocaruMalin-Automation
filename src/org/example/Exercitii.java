package org.example;

class ExercitiiString {
        public static void main(String []args) {
            String text = "Ana are 7 mere verzi";
            System.out.println("Lungimea este:" + text.length());

            String cuvant = "caine ciobanesc";
            System.out.println("Prima litera:" + cuvant.charAt(0));
            System.out.println("Ultima litera:" + cuvant.charAt(cuvant.length() - 1));

            String text1 = "Java";
            String text2 = "Python";
            boolean eq = text2.equals(text1);
            System.out.println("Textele sunt egale:" + eq);

            System.out.println("Contine cuvant:" + text.contains("mere"));

            String noulText = text.replace("Ana are 7 mere verzi", "Ana are 6 caise");
            System.out.println("Inlocuire spatii:" + noulText);

            String caise = text.replace("mere", "portocale");
            System.out.println(caise);

    }
}
