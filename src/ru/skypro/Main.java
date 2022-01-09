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
        float weightFirst = 78.2f;
        float weightSecond = 82.7f;
        float sum = weightFirst+weightSecond;
        float diff = weightSecond%weightFirst;
        System.out.println("Общий вес бойцов: "+sum+" kg");
        System.out.println("Разница: "+ diff + "kg");

    //task3
        byte weightBanana = 80;
        byte weightMilkPer100Ml = 105;
        byte weightIceCream = 100;
        byte weightEgg = 70;
        int totalWeight = 5 * weightBanana + 200 / 100 * weightMilkPer100Ml + 2 * weightIceCream + 4 * weightEgg;
        int totalWeightInKg = totalWeight / 1000;
        System.out.println("Итоговое значение в кг: " + totalWeightInKg);

    //task4
        byte targetInKg = 7;
        short minInDay = 250;
        short maxInDay = 500;
        int grInKg = 1000;
        int daysMax = targetInKg * grInKg / minInDay;
        int daysMin = targetInKg * grInKg/ maxInDay;
        //int daysAverage = targetInKg * grInKg / ((minInDay+maxInDay) / 2) + 1;
        /*формулировку "в среднем" трактую как среднее арифметическое между экстремумами (250 и 500) с округлением дней до целого в большую сторону*/
        int daysAverage = (daysMax + daysMin) / 2;

        System.out.println("будет худеть дней в режиме 250г/д: "+ daysMax);
        System.out.println("будет худеть дней в режиме 500г/д: "+ daysMin);
        System.out.println("будет худеть дней в режиме 250-500 г/д: "+ daysAverage);

    //task5
        int salaryMasha = 67_760;
        int salaryDen = 83_690;
        int salaryKris = 76_230;

        int salaryMashaAfter = salaryMasha + salaryMasha / 10;
        int salaryDenAfter = salaryDen + salaryDen / 10;
        int salaryKrisAfter = salaryKris + salaryKris / 10;

        int months = 12;
        int diffM = (salaryMashaAfter - salaryMasha) * months;
        int diffD = (salaryDenAfter - salaryDen) * months;
        int diffK = (salaryKrisAfter - salaryKris) * months;

        System.out.println("Маша теперь получает " +salaryMashaAfter + " рублей. Годовой доход вырос на " + diffM + " рублей");
        System.out.println("Денис теперь получает " +salaryDenAfter + " рублей. Годовой доход вырос на " + diffD + " рублей");
        System.out.println("Крис теперь получает " +salaryKrisAfter + " рублей. Годовой доход вырос на " + diffK + " рублей");

    }
}
