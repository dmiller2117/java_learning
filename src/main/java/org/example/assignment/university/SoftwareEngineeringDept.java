package org.example.assignment.university;

final class SoftwareEngineeringDept extends Department {

    void swEng() {
        System.out.println("Custom software engineering");
    }

    @Override
    public String toString() {
        return "Software Engineering";
    }
}