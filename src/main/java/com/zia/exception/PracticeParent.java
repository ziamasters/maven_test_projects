package com.zia.exception;

public class PracticeParent {
    public String name;
    public double age;
    public String profession;
    public String address;

    public PracticeParent(String name, double age, String profession, String address) {
        this.name = name;
        this.age = age;
        profession = profession;
        address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setProfession(String profession) {
        profession = profession;
    }

    public void setAddress(String address) {
        address = address;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

    public String getAddress() {
        return address;
    }
    public void getAddressDetails(){
        System.out.println("Parent address is "+address);
        System.out.println();

    }
}




