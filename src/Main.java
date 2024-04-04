public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int age = 25;
        if (age >= 18) {System.out.printf("Если возраст человека %s равен,то ты совершеннолетний.\n", age);
        } else {
            System.out.printf("Если возраст человека %s равен,то ты не достиг совершеннолетия, нужно немного подождать.\n"
                    , age);}
        //option 2
        int age2 = 13;
        if (age2 >= 18) {System.out.printf("Если возраст человека %s равен,то ты совершеннолетний.\n", age);
        } else {
            System.out.printf("Если возраст человека %s равен,то ты не достиг совершеннолетия, нужно немного подождать.\n"
                    , age2);}
        //Task 2
        System.out.println("Task 2");
        int outsideTemperature = 17;
        if (outsideTemperature <= 5) {
            System.out.printf("На улице %s градусов, нужно надеть шапку.\n", outsideTemperature);
        } else {
            System.out.printf("На улице %s градусов, можно идти без шапки.\n", outsideTemperature);
        }
        //option 2
        int outsideTemperature2 = 1;
        if (outsideTemperature2 <= 5) {
            System.out.printf("На улице %s градусов, нужно надеть шапку.\n", outsideTemperature2);
        } else {
            System.out.printf("На улице %s градусов, можно идти без шапки.\n", outsideTemperature2);
        }
        //Task 3
        System.out.println("Task 3");
        int driverSpeedInKm_As = 90;
        if (driverSpeedInKm_As >= 60) {
            System.out.printf("Если скорость %s км/ч, придется заплатить штраф.\n", driverSpeedInKm_As);
        } else {
            System.out.printf("Если скорость %s км/ч, можно ездить спокойно\n", driverSpeedInKm_As);
        }
        //option 2
        int driverSpeedInKm_As2 = 50;
        if (driverSpeedInKm_As2 >= 60) {
            System.out.printf("Если скорость %s км/ч, придется заплатить штраф.\n", driverSpeedInKm_As2);
        } else {
            System.out.printf("Если скорость %s км/ч, можно ездить спокойно.\n", driverSpeedInKm_As2);}
        //Task 4

    }
}