public class Main {
    public static void main(String[] args) {

        System.out.println("task1");        int[] expenses = new int[5];
        expenses[0] = 23;
        expenses[1] = 56;
        expenses[2] = 678;
        expenses[3] = 432;
        expenses[4] = 436;
        int sum = 0;
        for (int i = 0; i < expenses.length; i++) {
            sum += expenses[i];
        }
        System.out.println("Сумма трат в месяц составила " + sum + " рублей");

        System.out.println("task2");
        int[] expenses2 = new int[5];
        expenses2[0] = 23;
        expenses2[1] = 56;
        expenses2[2] = 678;
        expenses2[3] = 432;
        expenses2[4] = 436;
        int min = expenses2[0];
        int max = expenses2[0];
        for (int i : expenses2) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей");

        System.out.println("task3");
        int[] expenses3 = new int[5];
        expenses3[0] = 23;
        expenses3[1] = 56;
        expenses3[2] = 678;
        expenses3[3] = 432;
        expenses3[4] = 436;
        int sum1 = 0;
        for (int i = 0; i < expenses3.length; i++) {
            sum1 += expenses3[i];
        }
        double average = 0;
        average = sum1 / expenses3.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        System.out.println("task4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}