public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int accumulationOfMoney = 15000; //сумма, которую нужно отложить//
        int firstAccumulation = 0; //"счет"//
        int month = 1;
        while (firstAccumulation <= 2459000) {
            firstAccumulation += accumulationOfMoney;   //счет + сумма//
            firstAccumulation += firstAccumulation / 100; //счет + процент 1% по вкладу//
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна "
                    + firstAccumulation + " рублей.");
        }

        System.out.println("\nTask 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (number = 10; number > 0; number--) {
            System.out.print(number + " ");
        }

        System.out.println("\nTask 3");
        int birthRate = 17;
        int mortalityRate = 8;
        int numberOfPopulation = 12_000_000;
        int currentYear = 2024;
        for (int year = currentYear; year < currentYear + 10; year++) {
            numberOfPopulation += numberOfPopulation * birthRate / 1000 - numberOfPopulation * mortalityRate / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + numberOfPopulation);
        }

        System.out.println("\nTask 4");
        int account = 15000; //"счет"//
        int months = 0;
        double percent = 7D / 100;
        int desireSum = 12_000_000;
        while (account <= desireSum) {
            account = (int) (account * (1 + percent));
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений равна "
                    + account + " рублей.");
        }

        System.out.println("\nTask 5");
        account = 15000; //"счет"//
        month = 0;
        while (account < desireSum) {
            account = (int) (account * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна "
                        + account + " рублей.");
            }
        }

        System.out.println("\nTask 6");
        int initialAmount2 = 15000; //сумма, которую нужно отложить//
        account = 0; //"счет"//
        int monthsAll = 108;
        months = 1;
        for (; months <= monthsAll; months++) {
            account += initialAmount2;  //счет + ежемесячная сумма зачисления//
            account += account / 100 * 7; //процент 7% по вкладу//
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма накоплений равна "
                        + account + " рублей.");
            }
        }

        System.out.println("\nTask 7");
        int friday = 2;
        do {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        } while (friday <= 31);

        System.out.println("\nTask 8");
        int yearsBefore = 2024 - 200;
        int yearsAfter = 2024 + 100;
        //kometa = 79//
        for (int start = 0; start < yearsAfter; start += 79) {
            if (start > yearsBefore && start < yearsAfter) {
                System.out.println(start);
            }
        }
    }
}