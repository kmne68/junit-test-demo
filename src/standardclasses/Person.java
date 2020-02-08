package standardclasses;




/**
 * 
 * @author kmne68
 *
 * Person
 */
public class Person {

	private String 	firstName;
	private String 	lastName;
	private int 	age;
	
	/**
	 * Default constructor
	 */
	public Person() {
		
	}
	
	
	/**
	 * Explicit constructor
	 */
	public Person(String firstName, String lastName, int age) {
		this.firstName 	= firstName;
		this.lastName 	= lastName;
		this.age 		= age;
	}
	
	/**
	 * Set the person's first name.
	 * 
	 * @param firstName as a String
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	/**
	 * Get the person's first name.
	 * 
	 * @return the person's first name as a String
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Set the person's last name
	 * 
	 * @param the person's last name as a String
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Get the person's last name
	 * 
	 * @return the persons last name as a String
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Set the person's age as int
	 * 
	 *  @param the person's last name as an int
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * Get the person's age as int
	 * 
	 * @return
	 */
	public int getAge() {
		return age;
	}
	
	
	public String toString() {
		
		return String.format("Name: %s %s \tAge: %d"
				, this.getFirstName()
				, this.getLastName()
				, this.getAge());
	}
	
}
