import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.SequencedCollection;
import java.util.SequencedMap;
import java.util.SequencedSet;

import org.example.assignment.java21.university.AccountingDept;
import org.example.assignment.java21.university.BusinessFaculty;
import org.example.assignment.java21.university.EngineeringFaculty;
import org.example.assignment.java21.university.HumanitiesFaculty;
import org.example.assignment.java21.university.LecturerRecord;
import org.example.assignment.java21.university.SocialCareDept;
import org.example.assignment.java21.university.SoftwareEngineeringDept;

void main(String[] args) {
    System.out.println( "Hello to Java 21 University" );
    seqColl();
    seqSet();
    seqMap();
}


private void seqColl() {

    SequencedCollection<LecturerRecord> lecturerRecords = getLecturerRecordsCollection();
    System.out.println( "====== seqColl ======" );
    System.out.println( "output the collection" );
    System.out.println( lecturerRecords );
    System.out.println();
    System.out.println( "retrieve the first element in the collection" );
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
    System.out.println( "====== seqColl END ======" );
    System.out.println();

}

private void seqSet() {

    SequencedSet<LecturerRecord> lecturerRecordSequencedSet = getLecturerRecordSequencedSet();

    System.out.println( "====== seqSet ======" );
    System.out.println();
    System.out.println( "output the collection" );
    System.out.println( lecturerRecordSequencedSet );
    System.out.println();
    System.out.println( "retrieve the first element in the collection" );
    System.out.println( lecturerRecordSequencedSet.getFirst() );
    System.out.println();
    System.out.println( "retrieve the last element in the collection" );
    System.out.println( lecturerRecordSequencedSet.getLast() );
    System.out.println();
    System.out.println( "remove the first element from the collection" );
    System.out.println( lecturerRecordSequencedSet.removeFirst() );
    System.out.println();
    System.out.println( "output the collection again" );
    System.out.println( lecturerRecordSequencedSet );
    System.out.println();
    System.out.println( "using an enhanced-for loop, process the collection from the beginning to the end" );
    for ( LecturerRecord lecturerRecord : lecturerRecordSequencedSet ) {
        System.out.println( lecturerRecord );
    }
    System.out.println();
    System.out.println( "using an enhanced-for loop, process the collection from the end to the beginning" );
    for ( LecturerRecord lecturerRecord : lecturerRecordSequencedSet.reversed() ) {
        System.out.println( lecturerRecord );
    }
    System.out.println( "====== seqSet END ======" );
    System.out.println();

}


private void seqMap() {

    SequencedMap<LecturerRecord, String> lecturerRecordSequencedMap = getLecturerRecordStringSequencedMap();

    System.out.println( "====== seqMep ======" );
    System.out.println();
    System.out.println( "output the collection" );
    System.out.println( lecturerRecordSequencedMap );
    System.out.println();
    System.out.println( "retrieve the first element in the collection" );
    System.out.println( lecturerRecordSequencedMap.firstEntry() );
    System.out.println();
    System.out.println( "retrieve the last element in the collection" );
    System.out.println( lecturerRecordSequencedMap.lastEntry() );
    System.out.println();
    System.out.println( "remove (poll) the last entry from the collection" );
    System.out.println( lecturerRecordSequencedMap.pollLastEntry() );
    System.out.println();
    System.out.println( "output the collection again" );
    System.out.println( lecturerRecordSequencedMap );
    System.out.println();
    System.out.println( "using an enhanced-for loop, process the collection from the beginning to the end;\n" +
        "output both the keys and values." );
    for ( Map.Entry<LecturerRecord, String> mapEntry : lecturerRecordSequencedMap.entrySet() ) {
        System.out.println( mapEntry.getKey() + "; " + mapEntry.getValue() );
    }
    System.out.println();
    System.out.println( "using an enhanced-for loop, process the collection from the end to the beginning;\n" +
        "output both the keys and values." );
    for ( Map.Entry<LecturerRecord, String> mapEntry : lecturerRecordSequencedMap.reversed().entrySet() ) {
        System.out.println( mapEntry.getKey() + "; " + mapEntry.getValue() );
    }


}

private static SequencedCollection<LecturerRecord> getLecturerRecordsCollection() {
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

private static SequencedSet<LecturerRecord> getLecturerRecordSequencedSet() {
    SequencedSet<LecturerRecord> lecturerRecordSequencedSet = new LinkedHashSet<>();
    BusinessFaculty businessFaculty = new BusinessFaculty();
    AccountingDept accountingDept = new AccountingDept();

    LecturerRecord janeAustin = new LecturerRecord( "Jane Austin", 24, businessFaculty, accountingDept );
    LecturerRecord drCharlotteBronte = new LecturerRecord( "Dr Charlotte Bronte", 35, businessFaculty, accountingDept );
    LecturerRecord anneBrontePhd = new LecturerRecord( "Anne Bronte Phd", 54, businessFaculty, accountingDept );

    lecturerRecordSequencedSet.addFirst( janeAustin );
    lecturerRecordSequencedSet.addFirst( janeAustin );
    lecturerRecordSequencedSet.addFirst( janeAustin );
    lecturerRecordSequencedSet.addFirst( drCharlotteBronte );
    lecturerRecordSequencedSet.addLast( janeAustin );
    lecturerRecordSequencedSet.addLast( anneBrontePhd );
    return lecturerRecordSequencedSet;
}

private static SequencedMap<LecturerRecord, String> getLecturerRecordStringSequencedMap() {
    SequencedMap<LecturerRecord, String> lecturerRecordSequencedMap = new LinkedHashMap<>();

    SocialCareDept socialCareDept = new SocialCareDept();
    HumanitiesFaculty humanitiesFaculty = new HumanitiesFaculty();

    LecturerRecord kingLear = new LecturerRecord( "King Lear", 88, humanitiesFaculty, socialCareDept );
    LecturerRecord goneril = new LecturerRecord( "Goneril", 55, humanitiesFaculty, socialCareDept );
    LecturerRecord regan = new LecturerRecord( "Regan", 50, humanitiesFaculty, socialCareDept );
    LecturerRecord cordelia = new LecturerRecord( "Cordelia", 45, humanitiesFaculty, socialCareDept );

    lecturerRecordSequencedMap.putFirst( goneril, "Eldest" );
    lecturerRecordSequencedMap.putFirst( regan, "Middle" );
    lecturerRecordSequencedMap.putLast( cordelia, "Youngest" );
    lecturerRecordSequencedMap.putLast( kingLear, "Father" );
    return lecturerRecordSequencedMap;
}