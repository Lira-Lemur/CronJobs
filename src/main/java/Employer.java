
class Employer {

    private String firstName;
    private String lastName;
    private int age;
    private String position;

    Employer(String firstName, String lastName, int age, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    int getAge() {
        return age;
    }

    String getPosition() {
        return position;
    }
}
