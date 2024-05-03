package org.example.assignment.university;

public class University {
    public static void main(String[] args) {
       //new LecturerRecord(" ", 22, new EngineeringFaculty(), new SoftwareEngineeringDept());
       //new LecturerRecord("Joe Bloggs", -3, new EngineeringFaculty(), new SoftwareEngineeringDept());

        LecturerRecord janeBloggs = new LecturerRecord("Jane Bloggs", 24, new EngineeringFaculty(), new SoftwareEngineeringDept());
        System.out.println(janeBloggs);
        System.out.println("Name is " + janeBloggs.name());
        System.out.println("Age is " + janeBloggs.age());
        System.out.println("Faculty is " + janeBloggs.faculty());
        System.out.println("Department is " + janeBloggs.dept());
        System.out.println();
        janeBloggs.whichFaculty();
        janeBloggs.whichDept();
        System.out.println("Has PhD: " + janeBloggs.hasPhd());

        System.out.println();
        LecturerRecord drAnneBloggs = new LecturerRecord("Dr Anne Bloggs", 35, new BusinessFaculty(), new AccountingDept());
        System.out.println(drAnneBloggs);
        String phdMsg = drAnneBloggs.hasPhd() ? "Anne has a PhD" : "Anne has not a PhD";
        System.out.println(phdMsg);

        System.out.println();
        LecturerRecord joeBloggs = new LecturerRecord("Joe Bloggs PhD", 54, new HumanitiesFaculty(), new SocialCareDept());
        System.out.println(joeBloggs);
        phdMsg = joeBloggs.hasPhd() ? "Joe has a PhD" : "Joe has not a PhD";
        System.out.println(phdMsg);

    }
}