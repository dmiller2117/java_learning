package org.example.assignment.university;

final class EngineeringFaculty extends Faculty {

    void engineering() {
        System.out.println("We teach computer science, civil engineering etc…");
    }

    @Override
    public String toString() {
        return "Engineering";
    }
}