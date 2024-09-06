package org.example.assignment.java21.university;

public record LecturerRecord(String name, Integer age, Faculty faculty, Department dept) {

    public LecturerRecord {
        if (name.isBlank() || age < 0) {
            throw new IllegalArgumentException("""
                    Illegal argument passed:
                      "name": %s,
                      "age": %s
                    """.formatted(name, age));
        }
    }

    boolean hasPhd() {
        boolean hasPhd = false;
        String prefix = name.substring(0, 2);
        switch (prefix) {
            case "Dr":
                hasPhd = true;
                break;
            default:
                String postFix = name.substring(name.length() - 3);
                switch (postFix) {
                    case "PhD":
                        hasPhd = true;
                        break;
                    default:
                        break;
                }
        }
        return hasPhd;
    }

    void whichFaculty() {
        var msg = "Faculty of: ";
        switch (faculty) {
            case EngineeringFaculty ef -> {
                System.out.println(msg + ef);
                ef.engineering();
            }
            case HumanitiesFaculty hf -> {
                System.out.println(msg + hf);
                hf.humanities();
            }
            case BusinessFaculty bf -> {
                System.out.println(msg + bf);
                bf.business();
            }
            default -> throw new IllegalArgumentException(faculty.toString());
        }
    }

    void whichDept() {
        var msg = "Department of: ";
        switch (dept) {
            case ComputerEngineeringDept c -> {
                System.out.println(msg + c);
                c.compEng();
            }
            case SoftwareEngineeringDept s -> {
                System.out.println(msg + s);
                s.swEng();
            }
            case SocialCareDept s -> {
                System.out.println(msg + s);
                s.socialCare();
            }
            case AccountingDept a -> {
                System.out.println(msg + a);
                a.accounting();
            }
            default -> throw new IllegalArgumentException(dept.toString());
        }
    }
}