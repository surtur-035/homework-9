public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int[] monthlyExpenses = {15000, 20000, 40000, 33000, 25000};
        int allMonthlyExpenses = 0;
        for (int i = 0; i < monthlyExpenses.length; i++) {
            allMonthlyExpenses += monthlyExpenses[i];
        }
        System.out.println("Сумма трат за месяц составила " + allMonthlyExpenses + " рублей");

        System.out.println("Задача 2");
        int[] monthlyExpensesCopy = {15000, 20000, 40000, 33000, 25000};
        int max = monthlyExpensesCopy[0];
        int min = monthlyExpensesCopy[0];
        for (int i = 0; i < monthlyExpensesCopy.length; i++) {
            if (monthlyExpensesCopy[i] > max) {
                max = monthlyExpensesCopy[i];
            }
            if (monthlyExpensesCopy[i] < min) {
                min = monthlyExpensesCopy[i];
            }
        }
        System.out.println("Минимальная сумма трат за месяц составила " + min + " рублей. Максимальная сумма трат за месяц составила " + max + " рублей");

        System.out.println("Задача 3");
        int[] weeklyExpenses = {10001, 20000, 40030, 33000, 70000};
        double averageMonthlyExpenses = 0;
        for (int i = 0; i < monthlyExpenses.length; i++) {
            averageMonthlyExpenses += weeklyExpenses[i];
        }
        averageMonthlyExpenses = averageMonthlyExpenses / weeklyExpenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageMonthlyExpenses + " рублей");

        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}