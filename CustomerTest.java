import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class CustomerTest {

//public CustomerTest() {

//}

@Test
public void addLicenseTest() {

Customer test = new Customer("wolf", "lone", "loneWolf@gmail.com", "rxm10937pol");

assertTrue("Testing for boolean true", test.addLicense("RXM-j78"));
}

@Test
public void removeLicenseTest(){

Customer test = new Customer("wolf", "lone", "loneWolf@gmail.com", "rxm10937pol");

assertTrue("Testing for boolean true", test.removeLicense("rxm10937pol"));
}

@Test
public void getNameTest(){

Customer test = new Customer("wolf", "lone", "loneWolf@gmail.com", "rxm10937pol");

String testName = "wolf" + ", " + "lone";

assertEquals("Checking for name output match", testName, test.getName());
}

@Test
public void getFirstNameTest(){

Customer test = new Customer("wolf", "lone", "loneWolf@gmail.com", "rxm10937pol");

String testName = "lone";

assertEquals("Testing for first name output match", testName, test.getFirstName());
}

@Test
public void getLastNameTest(){

Customer test = new Customer("wolf", "lone", "loneWolf@gmail.com", "rxm10937pol");

String testName = "wolf";

assertEquals("Testing for last name output match", testName, test.getLastName());
}

@Test
public void getEmailTest(){

Customer test = new Customer("wolf", "lone", "loneWolf@gmail.com", "rxm10937pol");

String testEmail = "loneWolf@gmail.com";

assertEquals("Checking for email output match", testEmail, test.getEmail());
}

@Test
public void getLicenseTest(){

Customer test = new Customer("wolf", "lone", "loneWolf@gmail.com", "rxm10937pol");

String testLicense = "rxm10937pol";

assertEquals("Testing for license output match", testLicense, test.getLicense());
}

@Test
public void printPlatesTest(){

Customer test = new Customer("wolf", "lone", "loneWolf@gmail.com", "rxm10937pol");
test.addLicense("deck-9op0");
test.addLicense("call-98yu");
test.addLicense("mash-45p9");
test.addLicense("palr-32yt");

List<String> testArrayList = Arrays.asList("rxm10937pol", "deck-9op0", "call-98yu", "mash-45p9", "palr-32yt");

assertEquals("Testing for list print output match", testArrayList, test.printPlates());
}

@Test
public void getCustomerTest(){

Customer test = new Customer("wolf", "lone", "loneWolf@gmail.com", "rxm10937pol");

test.addLicense("deck-9op0");
test.addLicense("call-98yu");
test.addLicense("mash-45p9");
test.addLicense("palr-32yt");

List<String> testArrayList = Arrays.asList("rxm10937pol", "deck-9op0", "call-98yu", "mash-45p9", "palr-32yt");

String testCustomerAttributes =  "Last Name: wolf" + " First Name: lone" +
		    "\nEmail Address: loneWolf@gmail.com" +
	            "\nPlates on File: [rxm10937pol, deck-9op0, call-98yu, mash-45p9, palr-32yt]";

assertEquals("Testing for customer credential print output match", testCustomerAttributes, test.getCustomer());
}




}
