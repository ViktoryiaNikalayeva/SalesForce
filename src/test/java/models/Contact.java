package models;

public class Contact {
    String phone;
    String mobile;
    String firstName;
    String lastName;
    String email;
    String title;
    String mailingAddress;
    String mailingStreet;
    String mailingCity;
    String mailingStateProvince;
    String mailingZipPostalCode;
    String mailingCountry;
    String fax;
    String department;
    String homePhone;
    String asstPhone;
    String assistant;
    String description;
    String viktoryia;

    public Contact(String phone, String mobile, String firstName, String lastName, String email, String title, String mailingAddress, String mailingStreet, String mailingCity, String mailingStateProvince, String mailingZipPostalCode, String mailingCountry, String fax, String department, String homePhone, String asstPhone, String assistant, String description, String viktoryia) {
        this.phone = phone;
        this.mobile = mobile;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.title = title;
        this.mailingAddress = mailingAddress;
        this.mailingStreet = mailingStreet;
        this.mailingCity = mailingCity;
        this.mailingStateProvince = mailingStateProvince;
        this.mailingZipPostalCode = mailingZipPostalCode;
        this.mailingCountry = mailingCountry;
        this.fax = fax;
        this.department = department;
        this.homePhone = homePhone;
        this.asstPhone = asstPhone;
        this.assistant = assistant;
        this.description = description;
        this.viktoryia = viktoryia;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public String getMailingStreet() {
        return mailingStreet;
    }

    public void setMailingStreet(String mailingStreet) {
        this.mailingStreet = mailingStreet;
    }

    public String getMailingCity() {
        return mailingCity;
    }

    public void setMailingCity(String mailingCity) {
        this.mailingCity = mailingCity;
    }

    public String getMailingStateProvince() {
        return mailingStateProvince;
    }

    public void setMailingStateProvince(String mailingStateProvince) {
        this.mailingStateProvince = mailingStateProvince;
    }

    public String getMailingZipPostalCode() {
        return mailingZipPostalCode;
    }

    public void setMailingZipPostalCode(String mailingZipPostalCode) {
        this.mailingZipPostalCode = mailingZipPostalCode;
    }

    public String getMailingCountry() {
        return mailingCountry;
    }

    public void setMailingCountry(String mailingCountry) {
        this.mailingCountry = mailingCountry;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getAsstPhone() {
        return asstPhone;
    }

    public void setAsstPhone(String asstPhone) {
        this.asstPhone = asstPhone;
    }

    public String getAssistant() {
        return assistant;
    }

    public void setAssistant(String assistant) {
        this.assistant = assistant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getViktoryia() {
        return viktoryia;
    }

    public void setViktoryia(String viktoryia) {
        this.viktoryia = viktoryia;
    }
}
