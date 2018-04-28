package jsonJackson;


/**http://www.baeldung.com/jackson-annotations
 *https://crunchify.com/json-manipulation-in-java-examples/
 * @author Renjith
 *
 */

import java.math.BigDecimal;
import java.util.List;

public class Staff {

	private String name;
	private int age;
	private String position;
	private BigDecimal salary;
	private List<String> skills;
	
	
	
	public Staff( ) {
		super();		
	}
	public Staff(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//getters and setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	//tostring
	@Override
	public String toString() {
		return "Staff [name=" + name + ", age=" + age + ", position=" + position + ", salary=" + salary + ", skills="
				+ skills + "]";
	}

	
	
	
	
	
}