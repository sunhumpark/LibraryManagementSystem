package library;

public class Main {

    public static void main(String[] args) {

        Member member1 = new Member(
                "P001", "John Smith",
                "4161234567", "M001", 25);

        Member member2 = new Member(
                "P002", "Jane Wilson",
                "4169876543", "M002", 30);

        member1.registerMember();
        member2.registerMember("Premium");

        System.out.println("\n=== Member Details ===");

        member1.displayMemberDetails();

        System.out.println();

        member2.displayMemberDetails();

        System.out.println("\n=== Total Counts ===");
        System.out.println("Total People: "
                + Person.getPersonCount());
        System.out.println("Total Members: "
                + Member.getMemberCount());
        System.out.println("\n=== Library Staff ===");

        Librarian librarian = new Librarian(
                "P003", "Michael Brown",
                "4161112222", "S001",
                "Circulation", 3000.0, 50, 100);

        SeniorLibrarian senior = new SeniorLibrarian(
                "P004", "Sarah Johnson",
                "4163334444", "S002",
                "Administration", 4000.0, 70, 150,
                "Digital Archives", 500.0);

        LibraryAssistant assistant = new LibraryAssistant(
                "P005", "David Lee",
                "4165556666", "S003",
                "Customer Service", 2500.0,
                "Night", 300.0);

        librarian.displayStaffDetails();

        System.out.println();

        senior.displayStaffDetails();

        System.out.println();

        assistant.displayStaffDetails();

        System.out.println("\n=== Updated Counts ===");
        System.out.println("Total People: "
                + Person.getPersonCount());
        System.out.println("Total Members: "
                + Member.getMemberCount());
        System.out.println("Total Staff: "
                + LibraryStaff.getStaffCount());

System.out.println("\n=== Late Fee Calculation ===");

double fee1 = librarian.calculateLateFee(5);

double fee2 = librarian.calculateLateFee(5, 2.0);

System.out.println("Default Late Fee: $" + fee1);
System.out.println("Custom Late Fee: $" + fee2);

    System.out.println("\n=== Runtime Polymorphism ===");

    LibraryStaff[] staffList = {
            librarian,
            senior,
            assistant
    };

    for (LibraryStaff staff : staffList) {
        System.out.println("Role: " + staff.getRoleDescription());
        System.out.println("Monthly Compensation: $"
                + staff.calculateMonthlyCompensation());
        System.out.println();
    }
    System.out.println("\n=== Interface Demonstration ===");

    Reportable report = member1;
    report.generateReport();

    System.out.println();

    Reservable reservation = member1;
    reservation.reserveBook("BOOK101");
    reservation.reserveBook("");
    System.out.println("\n=== Invalid Registration Test ===");

    int peopleBefore = Person.getPersonCount();
    int membersBefore = Member.getMemberCount();

    try {
        Member invalidMember = new Member(
                "P006", "Invalid User",
                "4161234567", "M003", -5);

        System.out.println("Registration successful");

    } catch (IllegalArgumentException e) {
        System.out.println("Registration failed: " + e.getMessage());
    }

    System.out.println("People before: " + peopleBefore);
    System.out.println("People after: " + Person.getPersonCount());

    System.out.println("Members before: " + membersBefore);
    System.out.println("Members after: " + Member.getMemberCount());

    System.out.println("\n=== Invalid Staff Test ===");

    int staffBefore = LibraryStaff.getStaffCount();
    int peopleBeforeStaff = Person.getPersonCount();

    try {
        Librarian invalidStaff = new Librarian(
                "P007", "Invalid Staff",
                "4161234567", "S004",
                "Circulation", -1000.0, 50, 100);

        System.out.println("Staff registration successful");

    } catch (IllegalArgumentException e) {
        System.out.println("Staff registration failed: "
                + e.getMessage());
    }

    System.out.println("Staff before: " + staffBefore);
    System.out.println("Staff after: "
            + LibraryStaff.getStaffCount());

    System.out.println("People before: " + peopleBeforeStaff);
    System.out.println("People after: "
            + Person.getPersonCount());

    System.out.println("\n=== Invalid Late Fee Test ===");

    try {
        double invalidFee = librarian.calculateLateFee(-5);

        System.out.println("Late Fee: $" + invalidFee);

    } catch (IllegalArgumentException e) {
        System.out.println("Late fee calculation failed: "
                + e.getMessage());
    }
}
}