import java.util.*;
import java.text.DecimalFormat;

public class Employee {

DecimalFormat f = new DecimalFormat("#,###.00");
private String lastName, firstName;
private String jobTitle, id;
private String license;
private List<String> licensePlates = new ArrayList<>();
private double salary, hourlyWage, hours;

public Employee(String lName, String fName, String job, String identification) {

lastName = lName;
firstName = fName;
jobTitle = job;
id = identification;
}

public String getEmployeeInfo() {

return "Name: " + lastName + ", " + firstName + "\nOccupation: " + jobTitle;
}

public void setLicense(String lPlate) {

license = lPlate;
licensePlates.add(license);
}

public String getLicense(){

return license;
}

public String[] getLicencePlates() {

String[] temp;
temp = new String[licensePlates.size()];
licensePlates.toArray(temp);
return temp;
}

public void printPlates() {

System.out.println("License Plates: " + licensePlates);
}

public void getPaymentType() {

if (jobTitle.equalsIgnoreCase("Valet")) {
	hourlyWage = 15.00;
        System.out.println("Hourly Rate: " + f.format(hourlyWage));
} else if (jobTitle.equalsIgnoreCase("Store Associate")) {
            hourlyWage = 12.50;
            System.out.println("Hourly Rate: " + f.format(hourlyWage));
} else if (jobTitle.equalsIgnoreCase("Booth Sitter")) {
            hourlyWage = 18.00;
            System.out.println("Hourly Rate: " + f.format(hourlyWage));
} else if (jobTitle.equalsIgnoreCase("Store Manager")) {
            salary = 42000;
            System.out.println("Salary: " + f.format(salary));
} else if (jobTitle.equalsIgnoreCase("Garage Manager")) {
            salary = 72000;
            System.out.println("Salaray: " + f.format(salary));
} else {
         System.out.println("The job description you are looking for is no longer available here at Chip&Dales Garage. Sorry for the inconvenience.");
                            
 }
}

public void setHours(double h) {

hours = h;
}

public double getHours() {

return hours;
}

public void printPayCheck() {

if (jobTitle.equalsIgnoreCase("Valet")){
	System.out.println("PayCheck: " + f.format(hourlyWage * hours));
} else if (jobTitle.equalsIgnoreCase("Store Associate")){
	System.out.println("PayCheck: " + f.format(hourlyWage * hours));
} else if (jobTitle.equalsIgnoreCase("Booth Sitter")) {
	System.out.println("PayCheck: " + f.format(hourlyWage * hours));
} else if (jobTitle.equalsIgnoreCase("Store Manager")) {
	System.out.println("PayCheck: " + f.format(salary / 26));
} else if (jobTitle.equalsIgnoreCase("Garage Manager")) {
	System.out.println("Salaray: " + f.format(salary / 26));
} else {
	System.out.println("No paycheck to be calculated");
}

}

public String getLastName(){

return lastName;
}

public String getFirstName(){

return firstName;
}

public String getOccupation(){

return jobTitle;
}

public String getID(){

return id;
}



public static void main(String[] args) {

Employee a = new Employee("kuchki","Rukia","Store Manager","ijcuhw90");
a.setLicense("rmx-102");
a.setLicense("pol-647");
a.setLicense("demo-101");

System.out.println(a.getEmployeeInfo());
a.printPlates();
a.getPaymentType();
a.printPayCheck();

}

}


