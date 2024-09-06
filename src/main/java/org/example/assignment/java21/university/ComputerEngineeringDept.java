package org.example.assignment.java21.university;

final class ComputerEngineeringDept extends Department {

    void compEng() {
        System.out.println("Custom computer engineering");
    }

    @Override
    public String toString() {
        return "Computer Engineering";
    }
}