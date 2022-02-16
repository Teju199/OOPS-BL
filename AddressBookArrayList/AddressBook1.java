package AddressBookArrayList;

import java.util.ArrayList;

public class AddressBook1 {
    private String name, address, city, state, zipcode, phoneNumber, email;

    public AddressBook1(String name, String address, String city, String state,
                        String zipcode, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public AddressBook1() {
    }

    @Override
    public String toString() {
        return "Name : " + this.name + " " + "Address : " + this.address + " " + " " + "City : " + this.city + " " + "State : " + this.state + " " + "zipcode : " + this.zipcode + " " +
                "phoneNumber : " + this.phoneNumber + " " + "Email : " + this.email;
    }
    private static void printPersonList(ArrayList<PersonClass> personArrayList) {
        for(PersonClass person : personArrayList){
            System.out.println(person.getAddressBook1().toString());
        }
    }

    public static void main(String[] args) {
        ArrayList<PersonClass> personArrayList = new ArrayList<>();

        // Adding address to person 1
        AddressBook1 addressBookOfPerson1 = new AddressBook1("Teju", "Electronic City", "Bangalore",
                "Karnataka", "560010", "9000192090", "teju.iyer@gmail.com");
        PersonClass personClass1 = new PersonClass();
        personClass1.setAddressBook1(addressBookOfPerson1);

        // Adding address to person 2
        AddressBook1 addressBookOfPerson2 = new AddressBook1("Ram", "Jayanagar", "Bangalore", "Karanataka",
                "560106", "9187627892", "ram.sid@gmail.com");
        PersonClass personClass2 = new PersonClass();
        personClass2.setAddressBook1(addressBookOfPerson2);

        //Adding persons to list
        personArrayList.add(personClass1);
        personArrayList.add(personClass2);
        System.out.println("After adding persons to arraylist : ");
        printPersonList(personArrayList);

        //remove
        personArrayList.remove(personClass2);
        System.out.println("After removing person from arraylist : ");
        printPersonList(personArrayList);


    }


}