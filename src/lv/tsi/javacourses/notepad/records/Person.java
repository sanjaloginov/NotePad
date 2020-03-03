package lv.tsi.javacourses.notepad.records;

import lv.tsi.javacourses.notepad.Asker;

public class Person extends AbstractRecord {
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
    public boolean contains(String substr) {
        var tmp = substr.toLowerCase();
        return super.contains(substr)
                || firstName.toLowerCase().contains(tmp)
                || lastName.toLowerCase().contains(tmp)
                || phone.toLowerCase().contains(tmp)
                || eMail.toLowerCase().contains(tmp);
    }

    @Override
    public String stringContent() {
        return super.stringContent() +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", eMail='" + eMail + '\'';
    }

    @Override
    protected String type() {
        return "Person";
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
