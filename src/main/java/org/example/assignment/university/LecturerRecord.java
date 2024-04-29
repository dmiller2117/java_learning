package org.example.assignment.university;

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
                    case "Phd":
                        hasPhd = true;
                        break;
                    default:
                        break;
                }
        }
        return hasPhd;
    }

    void whichFaculty() {
        var msg = "Faculty of: %s";
        switch (faculty) {
            case EngineeringFaculty ef -> {
                System.out.printf(msg, ef);
                ef.engineering();
            }
            case HumanitiesFaculty hf -> {
                System.out.printf(msg, hf);
                hf.humanities();
            }
            case BusinessFaculty bf -> {
                System.out.printf(msg, bf);
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