package org.example.assignment.university;

public class University {
    public static void main(String[] args) {
       //new LecturerRecord(" ", 22, new EngineeringFaculty(), new SoftwareEngineeringDept());
       //new LecturerRecord("Joe Bloggs", -3, new EngineeringFaculty(), new SoftwareEngineeringDept());

        LecturerRecord jane = new LecturerRecord("Jane Bloggs", 24, new EngineeringFaculty(), new SoftwareEngineeringDept());
        System.out.println(jane);
        System.out.println("Name is " + jane.name());
        System.out.println("Age is " + jane.age());
        System.out.println("Faculty is " + jane.faculty());
        System.out.println();
        jane.whichFaculty();
        System.out.println("Department is " + jane.dept());
        jane.whichDept();

    }
}