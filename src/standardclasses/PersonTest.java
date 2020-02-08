package standardclasses;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonTest {
	
	
	private String firstName = "Frodo";
	private String lastName = "Baggins";
	private int age = 33;
	private Person testPerson;

	// runs one time only as the class is created
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	// runs one time only as the class is torn down
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	// runs each time a test is started
	@Before
	public void setUp() throws Exception {
		testPerson = new Person();
	}

	// runs each time a test is ended
	@After
	public void tearDown() throws Exception {
		testPerson = null;
	}

	@Test
	public void testConstructors() {
		Person p1 = null;
		assertNull("Person was not null as expected.", p1);
		
		assertNotNull("Person was not instantiated as expected", testPerson);
	
		Person p2 = new Person();
		assertNotNull("Person was not instatiated as expected.", p2);
		
		Person p3 = new Person(firstName, lastName, age);
		assertNotNull("Person was not instatiated as expected.", p3);
		assertEquals("First name was not set as expected.", firstName, p3.getFirstName());
		assertEquals("Last name was not set as expected.", lastName, p3.getLastName());
		assertEquals("The person's age was not set as expected.", age, p3.getAge());
	}
	
	@Test
	public void testGetSetLastName() {
		testPerson.setLastName(lastName);
		assertEquals("Last name was not set as expected.", lastName, testPerson.getLastName());
	}
	
	@Test
	public void testGetSetAge() {
		testPerson.setAge(age);
		assertEquals("The person's age was not set as expected.", age, testPerson.getAge());
	}
	
	@Test
	public void testGetSetFirstName() {
		testPerson.setFirstName("James");
		String myValue = testPerson.getFirstName();
		assertEquals("First name was not set as expected"
				, "James"
				, myValue);
	}
	
	
	@Test
	public void testToSTring() {
		
		testPerson.setFirstName(firstName);
		testPerson.setLastName(lastName);
		testPerson.setAge(age);
		
		String personString = testPerson.toString();
		assertTrue("Person toString() does not contain firstName."
				, personString.contains(firstName));
		
		assertTrue("Person toString() does not contain lastName."
				, personString.contains(lastName));
		
		assertTrue("Person toString() does not contain the correct age."
				, personString.contains(String.format("%d", age)));
	}

}
