public class Main {
    public static void main(String[] args) {
        System.out.println("\nTask 1");
        int age = 25;
        if (age >= 18) {System.out.printf("Если возраст человека равен %s ,то ты совершеннолетний.\n", age);
        } else {
            System.out.printf("Если возраст человека равен %s ,то ты не достиг совершеннолетия, нужно немного подождать.\n"
                    , age);}
        //Task 2
        System.out.println("\nTask 2");
        int outsideTemperature = 17;
        if (outsideTemperature < 5) {
            System.out.printf("На улице %s градусов, нужно надеть шапку.\n", outsideTemperature);
        } else {
            System.out.printf("На улице %s градусов, можно идти без шапки.\n", outsideTemperature);
        }
        //Task 3
        System.out.println("\nTask 3");
        int driverSpeedInKm_As = 90;
        if (driverSpeedInKm_As >= 60) {
            System.out.printf("Если скорость %s км/ч, придется заплатить штраф.\n", driverSpeedInKm_As);
        } else {
            System.out.printf("Если скорость %s км/ч, можно ездить спокойно.\n", driverSpeedInKm_As);
        }
        //Task 4
        System.out.println("\nTask 4");
        if (age > 2 && age <= 6) {
            System.out.printf("Если человек %s лет, то ему нужно ходить в садик.\n", age);
        } else if (age > 6 && age <=17) {
            System.out.printf("Если человек %s лет, то ему нужно ходить в школу.\n", age);
        } else if (age >= 18 && age <=24) {
            System.out.printf("Если человек %s лет, то ему нужно ходить в институт.\n", age);
        } else if (age > 24) {
            System.out.printf("Если человек %s лет, то ему нужно ходить на работу.\n", age);
        }
        //Task 5
        System.out.println("\nTask 5");
        int personYears = 13;
        if (personYears < 5) {
            System.out.printf("Если возраст ребенка равен %s лет, то он не может кататься на аттракционе.\n", personYears);
        } else if (personYears >= 5 && personYears <14) {
            System.out.printf("Если возраст ребенка равен %s лет, то он может кататься только в сопровождении взрослого.\n " +
                            "Но если взрослого нет, то кататься нельзя.\n", personYears);
        } else if (personYears >= 14) {
            System.out.printf("Если возраст ребенка равен %s лет, то он может кататься без сопровождения взрослого.\n",
                    personYears);
        }
        //Task 6
        System.out.println("\nTask 6");
        int nowInTheCarriage = 10;
        if (nowInTheCarriage <= 60) {
            System.out.println("Полная или частичная посадка сидячих мест");
        } else if (nowInTheCarriage <= 102){
            System.out.println("Полная посадка сидячих мест и нужно стоять");
        } else {
            System.out.println("Вагон уже полностью забит");
        }
        //Task 7
        System.out.println("\nTask 7");
        int one = 9;
        int two = 7;
        int three = 8;
        if (one > two && one > three) {
            System.out.println("Самое больше первое");
        } else if (two > one && two > three){
            System.out.println("Самое больше второе");
        } else if (three > one && three > two) {
            System.out.println("Самое больше третье");
        } else {
            System.out.println("Есть равные числа");
        }
    }
}