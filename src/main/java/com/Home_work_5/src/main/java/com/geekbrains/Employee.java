package com.geekbrains;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int money1;
    private int age;

    public Employee(String name, String position, String email, String phone, int money1, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.money1 = money1;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return(name+ "\n-"
                +position+ "\n-"
                +email+ "\n-"
                +phone+ "\n-"
                +money1+ "\n-"
                +age);
    }
}
