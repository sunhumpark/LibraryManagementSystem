package library;

public abstract class LibraryStaff extends Person {

    private final String staffId;
    private String department;
    private double monthlySalary;

    private static int staffCount = 0;

    public LibraryStaff(String personId, String name,
                        String phoneNumber, String staffId,
                        String department, double monthlySalary) {

    	super(personId,
    		      validateStaff(name, staffId, department, monthlySalary),
    		      phoneNumber);

        if (staffId == null || staffId.isBlank()
                || department == null || department.isBlank()
                || !Double.isFinite(monthlySalary)
                || monthlySalary < 0) {
            throw new IllegalArgumentException(
                "Invalid staff information");
        }

        this.staffId = staffId;
        this.department = department;
        this.monthlySalary = monthlySalary;

        staffCount++;
    }

    public static int getStaffCount() {
        return staffCount;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public abstract double calculateMonthlyCompensation();

    public void displayStaffDetails() {
        displayBasicDetails();
        System.out.println("Staff ID: " + staffId);
        System.out.println("Department: " + department);
        System.out.println("Monthly Salary: $" + monthlySalary);
    }

    @Override
    public String getRoleDescription() {
        return "Library Staff";
    }
    private static String validateStaff(String name,
            String staffId,
            String department,
            double monthlySalary) {

if (staffId == null || staffId.isBlank()
|| department == null || department.isBlank()
|| !Double.isFinite(monthlySalary)
|| monthlySalary < 0) {

throw new IllegalArgumentException(
"Invalid staff information");
}

return name;
}
}