package AddressBook;

public class AddressBookUC2 {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String phoneNumber;
    private String email;


    public AddressBookUC2(String firstName, String lastName, String address, String city, String state,
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

    public AddressBookUC2() {

    }

    @Override
    public String toString() {
        return "FirstName : " + this.firstName + " " + "LastName : " + this.lastName + " " + "Address : " + this.address + " " + " " + "City : " + this.city + " " + "State : " + this.state + " " + "zipcode : " + this.zipcode + " " +
                "phoneNumber : " + this.phoneNumber + " " + "Email : " + this.email;
    }


    public static void main(String[] args) {
        AddressBookUC2 address1 = new AddressBookUC2("Ram", "Sid", "Electronic City", "Bangalore",
                "Karnataka", "560100", "9901112838", "ram.sid@gmail.com");


        Person person = new Person();
        person.setAddressBookUC2(address1);
        System.out.println(person.getAddressBookUC2().toString());

        AddressBookUC2 address2 = new AddressBookUC2("Tej", "Iyer", "Jayanagar", "Bangalore", "Karnataka", "560091", "9901234569", "tej.iyer@yahoo.com");

        person.setAddressBookUC2(address2);
        System.out.println(person.getAddressBookUC2().toString());


    }

}


