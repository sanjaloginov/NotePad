package lv.tsi.javacourses.notepad;

public class Person extends Record {
    private String firstName;
    private String lastName;
    private String phone;
    private String eMail;

    @Override
    public void askInfo() {
        firstName = Asker.askString("First Name");
        lastName = Asker.askString("Last Name");
        phone = Asker.askString("Phone");
        eMail = Asker.askString("E-mail");
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + getId() + " " +
                ", firstName='" + firstName + '\'' + " " +
                ", lastName='" + lastName + '\'' + " " +
                ", phone='" + phone + '\'' + " " +
                ", eMail='" + eMail + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
