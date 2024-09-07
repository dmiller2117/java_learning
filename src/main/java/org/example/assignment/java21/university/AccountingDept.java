package org.example.assignment.java21.university;

public final class AccountingDept extends Department {

    void accounting() {
        System.out.println( "Custom accounting" );
    }

    @Override
    public String toString() {
        return "Accounting";
    }
}