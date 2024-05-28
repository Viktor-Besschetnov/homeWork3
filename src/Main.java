public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание");

        System.out.println("Задание 1");

        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершенолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + age +" он не достиг совершеннолетия, нужно немного подождать");
        }


        System.out.println("Задание 2");

        int temperature = 17;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        System.out.println("Задание 3");

        int speed = 59;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        }

        System.out.println("Задача 4");

        int age1 = 21;
        if (age1 > 2 && age1 < 6) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в детский сад");
        }
        if (age1 > 7 && age1 < 17) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в школу");
        }
        if (age1 >=18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в университет");
        }

        System.out.println("Задание 5");

        int age2 = 32;
        if (age2 <5){
            System.out.println("Если возраст ребенка равен " + age2 + " то ему нельзя кататься на аттракционе");
        }
        if (age2 > 5 && age2 < 15){
            System.out.println("Если возраст ребенка равен " + age2 + " то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (age2 > 14){
            System.out.println("Если возраст ребенка равен " + age2 + " то он может кататься без сопровождения взрослого");
        }

        System.out.println("Задание 6");

        int carCapacity = 102;
        //вместимость вагона
        int seating = 60;
        //стоячие места
        int standingPlaces = carCapacity - seating;
        //сидячие места
        int yourNumber = 103;
        // вводим сюда твой номер

        if (yourNumber >= seating && yourNumber <= carCapacity) {
            System.out.println("У тебя стоячие место");
        }
        if (yourNumber <= seating){
            System.out.println("У тебя сидячее место");
        }
        if (yourNumber > carCapacity){
            System.out.println("Мест в вагоне нет");
        }



        System.out.println("Задание 7");

        int one = 1;
        int two = 12;
        int three = 11;

        if (one > two && one > three) {
            System.out.println("one больше two и three");}
        else if (two > one && two > three) {
                System.out.println("two больше one и three");
            }

        else {
            System.out.println("three больше one и two");
        }







    }
}