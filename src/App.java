public class App {
    public static void main(String[] args) throws Exception {
        Smartphone phone1 = new Smartphone("Samsung", "Galaxy S21", 128, 40);
        Smartphone phone2 = new Smartphone("Apple", "iPhone 12", 64, 0);
        System.out.println(phone1);
        System.out.println(phone2);
        phone1.turnOn();
        phone2.turnOn();
        phone2.chargePhone(90);
        phone2.turnOn();
        phone1.chargePhone(20);
        phone1.turnOff();
        System.out.println(phone1);
        System.out.println(phone2);


    }
}
