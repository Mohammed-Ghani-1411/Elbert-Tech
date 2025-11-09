public class AddressDetails {
    public String houseNo;
    public String street;
    public String city;
    public String state;
    public String zip;
    public String country;

    public AddressDetails(String houseNo, String street, String city, String state, String zip, String country) {
        this.houseNo = houseNo;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;

    }

    @Override
    public String toString() {
        return "AddressDetails{" +
                "houseNo='" + houseNo + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' + '}';
}
}