// Customer class in which a customers attributes are recorded for the database

import java.util.*;

public class Customer {

private String lastName, firstName;
private String emailAddress;
private String licensePlate;
private List<String> licensePlates = new ArrayList<>();
private List<String> raffleTickets = new ArrayList<>();

public Customer(String lastN, String firstN, String email, String license) {

lastName = lastN;
firstName = firstN;
emailAddress = email;
licensePlate = license;
licensePlates.add(licensePlate);


}

public  boolean addLicense(String license) {
return licensePlates.add(license);
}

public  boolean removeLicense(String license) {
if (!licensePlates.contains(license)) {
	return false;
} else {
	return licensePlates.remove(license);
}

}

public String getName() {
return lastName + ", " + firstName;
}

public String getFirstName() {

return firstName;
}

public String getLastName() {

return lastName;
}

public String getEmail() {
return emailAddress;
}

public String getLicense() {
return licensePlate;
}

public List<String> printPlates() {

return licensePlates;
}


public String getCustomer() {

return "Last Name: " + lastName + " First Name: " + firstName +
		    "\nEmail Address: " + emailAddress +
	            "\nPlates on File: " + licensePlates.toString();
}

public static void main(String[] args) {
Customer c1 = new Customer("wolf", "lone", "loneWolf@gmail.com", "rxm10937pol");
System.out.println(c1.getName());
System.out.println(c1.getEmail());
System.out.println(c1.getLicense());

c1.addLicense("deck-9op0");
c1.addLicense("call-98yu");
c1.addLicense("mash-45p9");
c1.addLicense("palr-32yt");

System.out.println(c1.getCustomer());
System.out.println(c1.printPlates());
}

}
