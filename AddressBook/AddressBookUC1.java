package AddressBook;

public class AddressBookUC1 {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String phoneNumber;
    private String email;


    public AddressBookUC1(String firstName, String lastName, String address, String city, String state,
                          String zipcode, String phoneNumber, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }

    @Override
    public String toString() {
        return "FirstName : " + this.firstName + " " + "LastName : " + this.lastName + " " + "Address : " + this.address + " " + " " + "City : " + this.city + " " + "State : " + this.state + " " + "zipcode : " + this.zipcode + " " +
        "phoneNumber : " + this.phoneNumber + " " + "Email : " + this.email;
    }


    public static void main(String[] args) {
        AddressBookUC1 addressBookUC1 = new AddressBookUC1("Ram", "Sid", "Electronic City", "Bangalore",
                "Karnataka", "560100", "9901112838", "ram.sid@gmail.com");

        String a = addressBookUC1.toString();
        System.out.println(a);

    }

}
