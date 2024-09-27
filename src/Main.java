public class Main {
    public static void main(String[] args) {

        // Task #1
        System.out.println("Задача №1");
        // можно оставить решение с процентами? а то копить очень долго)))))
        int investment = 15000;
        int savings = 0;
        int month = 0;
        while (savings < 2_459_000) {
            savings = savings + savings / 100;
            savings = savings + investment;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей.");
        }

        // Task #2
        System.out.println("Задача №2");
        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (number = 10; number >= 1; number--) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Task #3
        System.out.println("Задача №3");
        int population = 12_000_000;
        int year = 1;
        int mortality = 8;
        int birth = 17;
        float populationGrowth = (float) (birth - mortality) / 1000;
        while (year <= 10) {
            System.out.println("Год " + year + ", численность населения составляет " + population);
            population = (int) (population + population * populationGrowth);
            year++;
        }

        // Task #4
        System.out.println("Задача №4");
        int monthlyPay = 15000;
        float monthlyPercent = 0.07f;
        int goal = 15000;
        month = 1;
        while (goal <= 12_000_000) {
            System.out.println("Месяц " + month + ", сумма накоплений составляет " + goal);
            goal = (int) (goal + goal * monthlyPercent);
            goal = goal + monthlyPay;
            month++;
        }

        // Task #5
        System.out.println("Задача №5");
        goal = 15000;
        month = 1;
        while (goal <= 12_000_000) {
            goal = (int) (goal + goal * monthlyPercent);
            goal = goal + monthlyPay;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений составляет " + goal);
            }
        }

        // Task #6
        System.out.println("Задача №6");
        goal = 15000;
        month = 1;
        while (month <= 117) {
            goal = (int) (goal + goal * monthlyPercent);
            goal = goal + monthlyPay;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений составляет " + goal);
            }
        }

        // Task #7
        System.out.println("Задача №7");
        int daysInMonth = 31;
        int friday = 1;
        while (friday < daysInMonth) {
                System.out.println("Сегодня пятница, " + friday + "-ое число. Необходимо подготовить отчет.");
                friday += 7;
        }
        // Task #8
        System.out.println("Задача №8");
        int currentYear = 2024;
        int yearOfAppearance = 0;
        int lastAppearance = currentYear - 200;
        int nextAppearance = currentYear + 100;
        while (yearOfAppearance >= 0) {
            yearOfAppearance += 79;
            if (yearOfAppearance > lastAppearance && yearOfAppearance < nextAppearance) {
                System.out.println(yearOfAppearance);
            }
        }
    }
}