public class Main {
    public static void main(String[] args) {

        System.out.println( "Задача 1");
        for (int i = 0; i < 10; i ++ ) {
            System.out.println("Итерация цикла " + i );
        }

        System.out.println( " Задача 2");
        for (int i = 10; i > 0; i --) {
            System.out.println("Итерация цикла " + i);
        }

        System.out.println( "Задача 3");
        for (int i = 0; i < 17; i=i+2) {
            System.out.println("Четные числа " + i);
        }

        System.out.println( " Задача 4");
        for ( int i = 10; i > -10; i --) {
            System.out.println(i );
        }

        System.out.println("Задача 5");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        System.out.println("Задача 8");
        int jar = 29000;
        int total = 0;
        for ( int i = 0; i <= 12; i++) {
            total = total + jar;
            System.out.println(" Месяц " + i + " сумма накопления равна " + total + " рублей");
        }

        System.out.println("Задача 9");
        int money = 29000;
        int total1 = 0;
        for ( int i = 0; i <= 12; i++) {
            total1 = total1 + total1/100;
            total1 = total1 + money;
            System.out.println(" Месяц " + i + " сумма накопления равна " + total1 + " рублей");
        }

        System.out.println("Задача 10");
        int multiplicationTable = 2;
        int total2 = 0;
        for ( int i = 2; i <= 10; i ++) {
            total2 = multiplicationTable * i;
            System.out.println( multiplicationTable + " * " + i + " = " + total2);
        }


    }
}