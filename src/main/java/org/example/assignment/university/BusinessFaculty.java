package org.example.assignment.university;

public final class BusinessFaculty extends Faculty {

    void business() {
        System.out.println("We teach accountancy, law, economics etc…");
    }

    @Override
    public String toString() {
        return "Business";
    }
}