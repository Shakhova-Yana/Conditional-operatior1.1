public class Main {
    public static void main(String[] args) {
        System.out.println("\nTask 1");
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
        System.out.println("\nTask 2");
        int outsideTemperature = 17;
        if (outsideTemperature <= 5) {
            System.out.printf("На улице %s градусов, нужно надеть шапку", outsideTemperature);
        } else {
            System.out.printf("На улице %s градусов, можно идти без шапки", outsideTemperature);
        }
    }
}