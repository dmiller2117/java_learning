package org.example.assignment.java21.university;

public final class EngineeringFaculty extends Faculty {

    void engineering() {
        System.out.println("We teach computer science, civil engineering etc…");
    }

    @Override
    public String toString() {
        return "Engineering";
    }
}