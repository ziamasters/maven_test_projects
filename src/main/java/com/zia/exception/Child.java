package com.zia.exception;



public class Child extends PracticeParent {
    private long mobile;
    private double salary;

    public Child() {
        super("zia", 33.0, "java developer", "moinbagh");
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Child ch =new Child();

        ch.setSalary(100000.00);
        String name = ch.getName();
        String profession =ch.getProfession();
        double s1= ch.getSalary();
        System.out.println(s1+"is Child Salary");
        System.out.println(name+"is Child Name");
        System.out.println(profession+"is Child Profession");

    }
}

