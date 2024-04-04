public class Main {
    public static void main(String[] args) {
        System.out.println("\nTask 1");
        int age = 25;
        if (age >= 18) {System.out.println("Если возраст человека %s равен,то ты совершеннолетний"+ age);
        } else {
            System.out.println("ты не достиг совершеннолетия, нужно немного подождать)");}
        int age2 = 12;
        if (age2 >= 18) {System.out.println("ты совершеннолетний");
        } else {
            System.out.println("ты не достиг совершеннолетия, нужно немного подождать)");}

        System.out.println("\nTask 2");
        int outsideTemperature = 17;
        if (outsideTemperature <= 5) {
            System.out.println("На улице %s градусов"+ outsideTemperature );
        }
    }
}