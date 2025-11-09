public class ContactDetails {
    public String parentPhoneno;
    public String parentEmail;

    public ContactDetails(String phone, String email) {
        this.parentPhone = parentPhone;
        this.parentEmail = parentEmail;


    }


    @Override
    public String toString() {
        return "ContactDetails{" +"parentPhone='" + parentPhone + '\''+", parentEmail='" + parentEmail +'\''+'}';
    }
}
