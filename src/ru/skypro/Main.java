package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here

    //task_1
        byte aByte = -125;
        short bShort = 32001;
        int cInt = -2000000001;
        long dLong = 8123123123123123123L;
        float eFloat = -3.14f;
        double fDouble = 0.1234567;
        char gChar = '$';
        boolean hBoolean = false;

    //task2
        float w1 = 78.2f;
        float w2 = 82.7f;
        float sum = w1+w2;
        float diff = w2%w1;
        System.out.println("Общий вес бойцов: "+sum+" kg");
        System.out.println("Разница: "+ diff + "kg");

    //task3
        byte wBanana = 80;
        byte wMilkPer100Ml = 105;
        byte wPlombir = 100;
        byte wEgg = 70;
        int totalWeight = 5 * wBanana + 200/100 * wMilkPer100Ml + 2 * wPlombir + 4 * wEgg;
        var totalWeightInKg = totalWeight / 1000;
        System.out.println("Итоговое значение в кг: " + totalWeightInKg);

    //task4
        byte targetInKg = 7;
        short mode1 = 250;
        short mode2 = 500;
        int daysMode1 = targetInKg * 1000 / mode1;
        int daysMode2 = targetInKg * 1000 / mode2;
        int daysAverage = targetInKg * 1000 / ((mode1+mode2) / 2) + 1; /*формулировку "в среднем" трактую
        как среднее арифметическое между экстремумами (250 и 500) с округлением дней до целого в большую сторону*/

        System.out.println("будет худеть дней в режиме 250г/д: "+ daysMode1);
        System.out.println("будет худеть дней в режиме 500г/д: "+ daysMode2);
        System.out.println("будет худеть дней в режиме 250-500 г/д: "+ daysAverage);

    //task5
        int zpM = 67_760;
        int zpD = 83_690;
        int zpK = 76_230;

        var zpM2 = zpM * 1.1;
        float zpD2 = zpD * 1.1f;
        var zpK2 = zpK * 1.1;

        var diffM = (zpM2 - zpM) * 12;
        var diffD = (zpD2 - zpD) * 12;
        var diffK = (zpK2 - zpK) * 12;

        System.out.println("Маша теперь получает " +zpM2 + " рублей. Годовой доход вырос на " + diffM + " рублей");
        System.out.println("Денис теперь получает " +zpD2 + " рублей. Годовой доход вырос на " + diffD + " рублей");
        System.out.println("Крис теперь получает " +zpK2 + " рублей. Годовой доход вырос на " + diffK + " рублей");

    }
}
