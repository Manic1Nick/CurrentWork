package utils;

import model.Address;
import model.Birthday;
import model.Contact;
import model.Student;

public class StudentUtils {

    public static Student generateStudent() {

        String name = generateName();
        Birthday birthday = generateDay();
        Contact contact = generateContact(name);
        Address address = generateAddress();

        double paidMoney = generatePaidMoney();
        int tasks = generateTasks();

        return new Student(name, birthday, contact, address, paidMoney, tasks);

    }

    private static int generateNum(int from, int to) {
        return from + (int)(Math.random() * (to - from));
    }

    private static String generateName() {

        String[] names = {"Andrey", "Oleg", "Ivan", "Serhii", "Bogdan", "Kolia", "Yura"};

        return names[(int)(Math.random() * names.length)];
    }

    private static Birthday generateDay() {
        return new Birthday((generateNum(1970, 1990)),(generateNum(0, 12)),(generateNum(0, 31)));
    }

    private static Contact generateContact(String name) {
        return new Contact(generatePhone(), generateEmail(name));
    }

    private static String generatePhone() {
        String phone = "+380";

        for (int i = 0; i < 9; i++) {
            phone += (int)(Math.random() * 10);
        }
        return phone;
    }

    private static String generateEmail(String name) {
        return name + "@gmail.com";
    }

    private static Address generateAddress() {
        return new Address("Kiev", "Starokievskaya", String.valueOf(generateNum(0,100)));
    }

    private static double generatePaidMoney() {
        return (generateNum(0, 4000));
    }

    private static int generateTasks() {
        return (generateNum(0, 100));
    }
}


