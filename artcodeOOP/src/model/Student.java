package model;

public class Student {

    private String name;
    private Birthday birthday;
    private Contact contact;
    private Address address;
    private double paidMoney;
    private int tasks;

    public Student(String name, Birthday birthday, Contact contact,
                   Address address, double paidMoney, int tasks) {

        this.name = name;
        this.birthday = birthday;
        this.contact = contact;
        this.address = address;
        this.paidMoney = paidMoney;
        this.tasks = tasks;

    }

    public String convertStudent() {

        return String.format("name %s, birthday %s, %s, %s, phone %s, email %s, " +
                "city %s, street %s, house %s, paidMoney %.2f, tasks %d",
                name, birthday.getYear(), birthday.getMonth(), birthday.getDay(), contact.getPhone(), contact.getEmail(),
                address.getCity(), address.getStreet(), address.getHouse(), paidMoney, tasks);

    }

    public String getName() {
        return name;
    }

    public Birthday getBirthday() {
        return birthday;
    }

    public Contact getContact() {
        return contact;
    }

    public Address getAddress() {
        return address;
    }

    public double getPaidMoney() {
        return paidMoney;
    }

    public int getTasks() {
        return tasks;
    }
}
