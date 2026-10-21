package library;

public class LibraryAssistant extends LibraryStaff {

    private final String shiftType;
    private final double shiftAllowance;

    public LibraryAssistant(String personId, String name,
                            String phoneNumber, String staffId,
                            String department, double monthlySalary,
                            String shiftType, double shiftAllowance) {

    	super(personId, name, phoneNumber,
    		      staffId, department,
    		      validateAssistant(monthlySalary, shiftType, shiftAllowance));
        if (shiftType == null || shiftType.isBlank()
                || !Double.isFinite(shiftAllowance)
                || shiftAllowance < 0) {
            throw new IllegalArgumentException(
                "Invalid shift information");
        }

        this.shiftType = shiftType;
        this.shiftAllowance = shiftAllowance;
    }

    @Override
    public double calculateMonthlyCompensation() {
        return getMonthlySalary() + shiftAllowance;
    }

    @Override
    public String getRoleDescription() {
        return "Library Assistant";
    }

    @Override
    public void displayStaffDetails() {
        super.displayStaffDetails();
        System.out.println("Shift Type: " + shiftType);
        System.out.println("Shift Allowance: $" + shiftAllowance);
        System.out.println("Total Compensation: $"
                + calculateMonthlyCompensation());
    }
    private static double validateAssistant(double monthlySalary,
            String shiftType,
            double shiftAllowance) {

if (shiftType == null || shiftType.isBlank()
|| !Double.isFinite(shiftAllowance)
|| shiftAllowance < 0) {

throw new IllegalArgumentException(
"Invalid shift information");
}

return monthlySalary;
}
}