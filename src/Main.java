public class Main {
    public static void main(String[] args) {
        System.out.println("\nTask 1");
        int age = 25;
        if (age > 18) {System.out.printf("Если возраст человека равен %s ,то ты совершеннолетний.\n", age);
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
            System.out.printf("Если скорость %s км/ч, можно ездить спокойно\n", driverSpeedInKm_As);
        }
        //Task 4
        System.out.println("\nTask 4");
        if (age > 2 && age <= 6) {
            System.out.printf("Если человек %s лет, то ему нужно ходить в садик\n", age);
        } else if (age > 6 && age <=17) {
            System.out.printf("Если человек %s лет, то ему нужно ходить в школу\n", age);
        } else if (age > 18 && age <=24) {
            System.out.printf("Если человек %s лет, то ему нужно ходить в институт\n", age);
        } else if (age > 24) {
            System.out.printf("Если человек %s лет, то ему нужно ходить на работу\n", age);
        }
    }
}