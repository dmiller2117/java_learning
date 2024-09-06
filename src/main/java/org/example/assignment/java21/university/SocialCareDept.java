package org.example.assignment.java21.university;

final class SocialCareDept extends Department {

    void socialCare() {
        System.out.println("Custom social care");
    }

    @Override
    public String toString() {
        return "Social Care";
    }
}