package edu.ntu.pzks.lr5.model;

public class Human {
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final Sex sex;

    public Human(String firstName, String lastName, String middleName, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.sex = sex;
    }
}
