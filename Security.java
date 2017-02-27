public class Security {

// id scanner for payment
// leaving gate accessed by certain employees 
// after payment fulfilled gate should open then after 30 seconds gate should close

private Employee empOnDuty;
private String gate;
private boolean isOpen;


public Security(String gateLocation, boolean state){

gate = gateLocation;
isOpen = state;
}

public boolean setState(boolean state){

return isOpen = state;
}

// ternary operator, result = testCondition ? value1 : value2
public String state() {

return isOpen ? "open" : "closed"; 
}

// set employee on duty
public void setEmpOnDuty(Employee duty){

empOnDuty = duty;
}

// get employe on duty
public String getEmpOnDuty() {

return empOnDuty.getEmployeeInfo();
}

public static void main(String[] args){

Security main = new Security("Main Gate", false);
Employee e = new Employee("hanks","Tom","booth sitter");
Customer c1 = new Customer("wolf","lone","loneWolf@gmail.com","rxm786");
main.setEmpOnDuty(e);
System.out.println(main.getEmpOnDuty());
//main.setEmpOnDuty(c1);

}


}
