package library;

public class SeniorLibrarian extends Librarian {

    private final String specialization;
    private final double seniorityAllowance;

    public SeniorLibrarian(String personId, String name,
                           String phoneNumber, String staffId,
                           String department, double monthlySalary,
                           int dailyIssueLimit, int booksProcessed,
                           String specialization,
                           double seniorityAllowance) {

    	super(personId, name, phoneNumber, staffId,
    		      department,
    		      validateSenior(monthlySalary, specialization, seniorityAllowance),
    		      dailyIssueLimit, booksProcessed);

        if (specialization == null || specialization.isBlank()
                || !Double.isFinite(seniorityAllowance)
                || seniorityAllowance < 0) {
            throw new IllegalArgumentException(
                "Invalid senior librarian information");
        }

        this.specialization = specialization;
        this.seniorityAllowance = seniorityAllowance;
    }

    @Override
    public double calculateMonthlyCompensation() {
        return super.calculateMonthlyCompensation()
                + seniorityAllowance;
    }

    @Override
    public String getRoleDescription() {
        return "Senior Librarian";
    }

    @Override
    public void displayStaffDetails() {
        super.displayStaffDetails();
        System.out.println("Specialization: " + specialization);
        System.out.println("Seniority Allowance: $"
                + seniorityAllowance);
    }
    private static double validateSenior(double monthlySalary,
            String specialization,
            double seniorityAllowance) {

if (specialization == null || specialization.isBlank()
|| !Double.isFinite(seniorityAllowance)
|| seniorityAllowance < 0) {

throw new IllegalArgumentException(
"Invalid senior librarian information");
}

return monthlySalary;
}
}