package org.example.assignment.java21.university;

public final class HumanitiesFaculty extends Faculty {

    void humanities() {
        System.out.println("We teach social care, European studies etc…");
    }

    @Override
    public String toString() {
        return "Humanities";
    }
}