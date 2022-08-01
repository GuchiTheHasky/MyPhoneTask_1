package MyPhone;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NokiaPhone nokia = new NokiaPhone("Nokia", "3300", 512, 64);
        SamsungPhone samsung = new SamsungPhone("Samsung", "A51", 7956, 1500);
        System.out.println("Hi, i am " + nokia.getPhoneInfo() + " and " + nokia.getMessage());
        System.out.println("So what, i am " + samsung.getPhoneInfo() + " and " + samsung.getMessage() + samsung.getPhoto() + samsung.getMemoryInfo());


    }
}
