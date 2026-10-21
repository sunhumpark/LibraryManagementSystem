package library;

public class Librarian extends LibraryStaff {

    private final int dailyIssueLimit;
    private int booksProcessed;

    public Librarian(String personId, String name,
                     String phoneNumber, String staffId,
                     String department, double monthlySalary,
                     int dailyIssueLimit, int booksProcessed) {

    	super(personId, name, phoneNumber,
    		      staffId, department,
    		      validateLibrarian(monthlySalary, dailyIssueLimit, booksProcessed));
        if (dailyIssueLimit < 0 || booksProcessed < 0) {
            throw new IllegalArgumentException(
                "Invalid book information");
        }

        this.dailyIssueLimit = dailyIssueLimit;
        this.booksProcessed = booksProcessed;
    }

    @Override
    public double calculateMonthlyCompensation() {
        return getMonthlySalary() + (booksProcessed * 2.0);
    }

    public double calculateLateFee(int daysOverdue) {
        return calculateLateFee(daysOverdue, 1.0);
    }

    public double calculateLateFee(int daysOverdue,
                                   double dailyRate) {

        if (daysOverdue < 0 || !Double.isFinite(dailyRate)
                || dailyRate <= 0) {
            throw new IllegalArgumentException(
                "Invalid overdue days or daily rate");
        }

        return daysOverdue * dailyRate;
    }

    @Override
    public String getRoleDescription() {
        return "Librarian";
    }

    @Override
    public void displayStaffDetails() {
        super.displayStaffDetails();
        System.out.println("Daily Issue Limit: " + dailyIssueLimit);
        System.out.println("Books Processed: " + booksProcessed);
        System.out.println("Total Compensation: $"
                + calculateMonthlyCompensation());
    }
    private static double validateLibrarian(double monthlySalary,
            int dailyIssueLimit,
            int booksProcessed) {

if (dailyIssueLimit < 0 || booksProcessed < 0) {
throw new IllegalArgumentException(
"Invalid book information");
}

return monthlySalary;
}
}