package org.example.assignment.university;

final class AccountingDept extends Department {

    void accounting() {
        System.out.println("Custom accounting");
    }

    @Override
    public String toString() {
        return "Accounting";
    }
}