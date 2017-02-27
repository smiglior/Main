import static org.junit.Assert.*;
import org.junit.Test;

public class SecurityTest {

@Test
public void setStateTest() {

Security main = new Security("Main Gate", false);

assertTrue("Testing for openning of the gate", main.setState(true));
assertFalse("Testing for closing of the gate", main.setState(false));

}

@Test
public void stateTest() {

Security main = new Security("Main Gate", false);

String testClose = "closed";
String testOpen = "open";

assertEquals("Checking if the gate is open or closed, Should be closed in this case", testClose, main.state());

main.setState(true);

assertEquals("Checking if the gate is open or closed, Should be open in this case", testOpen, main.state());
}


@Test
public void getOnDuty() {

Security main = new Security("Main Gate", false);
Employee e = new Employee("hanks","Tom","booth sitter");

main.setEmpOnDuty(e);

String testOnDuty = "Name: hanks, Tom\nOccupation: booth sitter";
assertEquals("Testing for employee info output match", testOnDuty, main.getEmpOnDuty());
}






}
