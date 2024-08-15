public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int accumulationOfMoney = 15000; //сумма, которую нужно отложить//
        int firstAccumulation = 0; //"счет"//
        int month = 1;
        while (firstAccumulation <= 2459000) {
            if (month == 1) {
                firstAccumulation = firstAccumulation + accumulationOfMoney;   //счет + сумма//
                System.out.println("Месяц " + month + ", сумма накоплений равна "
                        + firstAccumulation + " рублей.");
            }
            firstAccumulation = firstAccumulation + accumulationOfMoney;   //счет + сумма//
            firstAccumulation = firstAccumulation + firstAccumulation / 100; //счет + процент 1% по вкладу//
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна "
                    + firstAccumulation + " рублей.");
        }

        System.out.println("\nTask 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\nTask 3");
        int birthRate = 1000 * 17;
        int mortalityRate = 1000 * 8;
        int numberOfPopulation = 12_000_000;
        for (int year = 1; year <= 10; year++) {
            if (year == 1) {
                System.out.println("Год " + year + ", численность населения составляет " + numberOfPopulation);
            }
            numberOfPopulation = numberOfPopulation + birthRate - mortalityRate;
            System.out.println("Год " + year + ", численность населения составляет " + numberOfPopulation);
        }

        System.out.println("\nTask 4");
        int initialAmount = 15000; //сумма, которую нужно отложить//
        int account = 0; //"счет"//
        for (int months = 1; account < 12_000_000; months++) {
            if (months == 1) {
                account = account + initialAmount;   //счет + ежемесячная сумма зачисления//
                System.out.println("Месяц " + months + ", сумма накоплений равна "
                        + account + " рублей.");
            }
            account = account + initialAmount;  //счет + ежемесячная сумма зачисления//
            account = account + account / 100 * 7; //процент 7% по вкладу//
            System.out.println("Месяц " + months + ", сумма накоплений равна "
                    + account + " рублей.");
        }

        System.out.println("\nTask 5");
        int initialAmount1 = 15000; //сумма, которую нужно отложить//
        int account1 = 0; //"счет"//
        int months = 1;
        for (; account1 < 12_000_000; months++) {
            account1 = account1 + initialAmount1;  //счет + ежемесячная сумма зачисления//
            account1 = account1 + account1 / 100 * 7; //процент 7% по вкладу//
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма накоплений равна "
                        + account1 + " рублей.");
            }
        }

        System.out.println("\nTask 6");
        int initialAmount2 = 15000; //сумма, которую нужно отложить//
        int account2 = 0; //"счет"//
        int monthsAll = 108;
        int months2 = 1;
        for (; months2 <= 108; months2++) {
            account2 = account2 + initialAmount2;  //счет + ежемесячная сумма зачисления//
            account2 = account2 + account2 / 100 * 7; //процент 7% по вкладу//
            if (months2 % 6 == 0) {
                System.out.println("Месяц " + months2 + ", сумма накоплений равна "
                        + account2 + " рублей.");
            }
        }

        System.out.println("\nTask 7");
        int friday = 2;
        do {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + 7;
        } while (friday <= 31);

        System.out.println("\nTask 8");
        int yearsBefore = 2024 - 200;
        int yearsAfter = 2024 + 100;
        //kometa = 79//
        for (int start = 0; start < yearsAfter; start = start + 79) {
            if (start > yearsBefore && start < yearsAfter) {
                System.out.println(start);
            }
        }
    }
}