package library;

public abstract class Person {

    private final String personId;
    private String name;
    private String phoneNumber;

    private static int personCount = 0;

    public Person(String personId, String name, String phoneNumber) {

        if (personId == null || personId.isBlank()
                || name == null || name.isBlank()
                || phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException(
                    "Invalid person information");
        }

        this.personId = personId;
        this.name = name;
        this.phoneNumber = phoneNumber;

        personCount++;
    }

    public static int getPersonCount() {
        return personCount;
    }

    public void displayBasicDetails() {
        System.out.println("Person ID: " + personId);
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
    }

    public abstract String getRoleDescription();

    @Override
    public String toString() {
        return "Person ID: " + personId
                + ", Name: " + name
                + ", Phone: " + phoneNumber;
    }
}