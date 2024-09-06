import java.util.ArrayList;
import java.util.SequencedCollection;

import org.example.assignment.java21.university.EngineeringFaculty;
import org.example.assignment.java21.university.LecturerRecord;
import org.example.assignment.java21.university.SoftwareEngineeringDept;

void main(String[] args) {
    System.out.println( "Hello to Java 21 University" );
    seqColl();
}

private void seqColl() {

    SequencedCollection<LecturerRecord> lecturerRecords = getLecturerRecords();

    System.out.println( "output the collection :: " );
    System.out.println( lecturerRecords );
    System.out.println();
    System.out.println( "retrieve the first element in the collection ::" );
    System.out.println( lecturerRecords.getFirst() );
    System.out.println();
    System.out.println( "retrieve the last element in the collection" );
    System.out.println( lecturerRecords.getLast() );
    System.out.println();
    System.out.println( "remove the last element from the collection" );
    System.out.println( lecturerRecords.removeLast() );
    System.out.println();
    System.out.println( "output the collection again" );
    System.out.println( lecturerRecords );
    System.out.println();
    System.out.println( "using an enhanced-for loop, process the collection from the beginning to the end" );
    for ( LecturerRecord lecturerRecord : lecturerRecords ) {
        System.out.println( lecturerRecord );
    }
    System.out.println();
    System.out.println( "using an enhanced-for loop, process the collection from the end to the beginning" );
    for ( LecturerRecord lecturerRecord : lecturerRecords.reversed() ) {
        System.out.println( lecturerRecord );
    }
    System.out.println();


}

private static SequencedCollection<LecturerRecord> getLecturerRecords() {
    SequencedCollection<LecturerRecord> lecturerRecords = new ArrayList<>();
    EngineeringFaculty engineeringFaculty = new EngineeringFaculty();
    SoftwareEngineeringDept softwareEngineeringDept = new SoftwareEngineeringDept();

    LecturerRecord janeBloggs = new LecturerRecord(
        "Jane Bloggs",
        24,
        engineeringFaculty,
        softwareEngineeringDept
    );
    LecturerRecord drAnneBloggs = new LecturerRecord(
        "DR Anne Bloggs",
        35,
        engineeringFaculty,
        softwareEngineeringDept
    );
    LecturerRecord joeBloggs = new LecturerRecord(
        "Joe Bloggs Phd",
        54,
        engineeringFaculty,
        softwareEngineeringDept
    );

    lecturerRecords.addFirst( janeBloggs );
    lecturerRecords.addFirst( drAnneBloggs );
    lecturerRecords.addLast( joeBloggs );
    return lecturerRecords;
}