public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание");

        System.out.println("Задание 1");

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание 2");

        int clientOS1 = 0;
        int clientDeviceYear = 2017;
        if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if  (clientOS1 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание 3");

        int year = 1904;
        if (((year % 4 == 0) || (year % 400 == 0)) && (year % 100 != 0) && (year > 1584) ){
            System.out.println(year + " год является високосным");
        } else if (year < 1584) {
            System.out.println(year + " не входит в список разрешенных");
            } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance > 20 && deliveryDistance <60) {
            System.out.println("Потребуется дней: " + (deliveryDay+1));
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (deliveryDay+2));
        } else {
            System.out.println("Доставки нет");
        }

        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }




    }
}