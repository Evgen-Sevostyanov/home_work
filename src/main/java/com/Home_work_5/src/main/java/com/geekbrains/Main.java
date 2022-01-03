package com.geekbrains;

public class Main {
    public static void main(String[] args) {
        Employee[] Corp = new Employee[5];
        Corp[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",150000,23);
        Corp[1] = new Employee("Petrov Petr", "Creator", "petrov@mailbox.com", "892312314",150000,30);
        Corp[2] = new Employee("Sidorov Sidr", "Water pot", "sidorov@mailbox.com", "892312315",110000,61);
        Corp[3] = new Employee("Alekseev Aleksei", "EnvelopeLicker", "Alekseev@mailbox.com", "892312316",15000,54);
        Corp[4] = new Employee("Sevostyanov Evgeniy", "Director", "SEA_@mailbox.com", "892312317",3220000,27);
        for (Employee employee : Corp)
            if (employee.getAge()>40) {
                System.out.println(employee);
            }
    }
}
