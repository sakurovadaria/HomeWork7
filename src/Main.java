public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int accumulationOfMoney = 15000; //сумма, которую нужно отложить//
        int firstAccumulation = 0; //"счет"//
        int month = 1;
        while (firstAccumulation <= 2459000) {
            firstAccumulation = firstAccumulation + accumulationOfMoney;   //процент по вкладу + сумма//
            firstAccumulation = firstAccumulation + firstAccumulation / 100; //процент 1% по вкладу//
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
        int year = 1;
        while (year < 10) {
            numberOfPopulation = numberOfPopulation + birthRate - mortalityRate;
            year++;
            System.out.println("Год " + year + ", численность населения составляет " + numberOfPopulation);
        }
    }
}