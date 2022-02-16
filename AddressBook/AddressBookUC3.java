package AddressBook;

import java.util.Scanner;

public class AddressBookUC3 {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String phoneNumber;
    private String email;


    public AddressBookUC3(String firstName, String lastName, String address, String city, String state,
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

    public String getFirstName() {
        return firstName;
    }

    public String setFirstName(String firstName) {
        this.firstName = firstName;
        return firstName;
    }

    public AddressBookUC3() {

    }

    @Override
    public String toString() {
        return "FirstName : " + this.firstName + " " + "LastName : " + this.lastName + " " + "Address : " + this.address + " " + " " + "City : " + this.city + " " + "State : " + this.state + " " + "zipcode : " + this.zipcode + " " +
                "phoneNumber : " + this.phoneNumber + " " + "Email : " + this.email;
    }


    public static void main(String[] args) {
        AddressBookUC3 address1 = new AddressBookUC3("Ram", "Sid", "Electronic City", "Bangalore",
                "Karnataka", "560100", "9901112838", "ram.sid@gmail.com");


        Person2 person = new Person2();
        person.setAddressBookUC3(address1);
        System.out.println(person.getAddressBookUC3().toString());

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name that needs to be updated :  ");
        String newName = sc.next();

        person.getAddressBookUC3().setFirstName(newName);
        System.out.println(person.getAddressBookUC3().toString());

    }
}


