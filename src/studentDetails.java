public class studentDetails {
    public class studentDetails {
        public class StudentDetails {
            public String fatherName;
            public String motherName;
            public String studentName;
            public String gender;

            public AddressDetails addressDetails;
            public ContactDetails contactDetails;

            public StudentDetails(String fatherName, String motherName, String studentName, String gender, AddressDetails addressDetails, ContactDetails contactDetails) {

                this.fatherName = fatherName;
                this.motherName = motherName;
                this.studentName = studentName;
                this.gender = gender;
                this.addressDetails = addressDetails;
                this.contactDetails = contactDetails;


            }

            public static void main(String[] args){
                AddressDetails ad = new AddressDetails("2-3-54/1/2","nanal nager","tolichowki","Hyderabad","Telangana","5000028");
                ContactDetails cd = new ContactDetails("917763571","ghanimohd@gmail.com");
                AddressDetails ad2 = new AddressDetails("3-4-33-1/2","gudimalkapue","mehdipatnam","Hyderabad","Telangana");
                ContactDetails cd2 = new ContactDetails("9876509371"," mohammed@gmail.com");
                StudentDetails student1 = new StudentDetails("father1","mother1","student1","male", "ad" ,"cd");
                StudentDetails student2 = new StudentDetails("father2","mother2","student2","female"),"ad2","cd2");

                System.out.println("student 1 details: " + student1);
                System.out.println("student 2 details: " + student2);
            }
            @Override
            public String toString() {
                return "StudentDetails{" +"fatherName=" + fatherName + '\''+"," +
                        " " motherName='" + motherName + '\'' +
                        ", studentName='" + studentName + '\''
                        + ", gender='" + gender + '\'' + "," +
                        " addressDetails=" + addressDetails +
                        ", contactDetails=" + contactDetails + '}';
            }
        }

    }