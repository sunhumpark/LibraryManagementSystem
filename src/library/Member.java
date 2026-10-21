package library;

public class Member extends Person implements Reportable, Reservable {

    private final String memberNumber;
    private int age;
    private String membershipType;
    private double outstandingFees;

    private static int memberCount = 0;

    public Member(String personId, String name,
                  String phoneNumber, String memberNumber,
                  int age) {

    	super(personId, validateMember(name, memberNumber, age), phoneNumber);

        if (memberNumber == null || memberNumber.isBlank()
                || age < 0) {
            throw new IllegalArgumentException(
                "Invalid member number or age");
        }

        this.memberNumber = memberNumber;
        this.age = age;
        this.membershipType = "Basic";
        this.outstandingFees = 0;

        memberCount++;
    }

    public void registerMember() {
        System.out.println("Member registered: Basic");
    }

    public void registerMember(String membershipType) {
        if (membershipType == null || membershipType.isBlank()) {
            throw new IllegalArgumentException(
                "Invalid membership type");
        }

        this.membershipType = membershipType;
        System.out.println("Member registered: " + membershipType);
    }

    public static int getMemberCount() {
        return memberCount;
    }

    @Override
    public String getRoleDescription() {
        return "Library Member";
    }

    public void displayMemberDetails() {
        displayBasicDetails();
        System.out.println("Member Number: " + memberNumber);
        System.out.println("Age: " + age);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Outstanding Fees: $" + outstandingFees);
    }
    @Override
    public void generateReport() {
        System.out.println("=== Member Report ===");
        displayMemberDetails();
    }

    @Override
    public void reserveBook(String bookId) {
        if (bookId == null || bookId.isBlank()) {
            System.out.println("Reservation failed: Invalid book ID");
            return;
        }

        System.out.println("Reservation successful for book: " + bookId);
    }
    private static String validateMember(String name,
            String memberNumber, int age) {

if (memberNumber == null || memberNumber.isBlank()
|| age < 0) {
throw new IllegalArgumentException(
"Invalid member number or age");
}

return name;
}
}