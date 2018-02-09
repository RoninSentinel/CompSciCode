package FrisbyAssignment;

public class Person {
	private String firstname;
	private String lastname;
	
		public Person(String firstname, String lastname){
			setFirstName(firstname);
			setLastName(lastname);
		}
		public String getFirstName(){
			return firstname;
		}
		public String getLastName(){
			return lastname;
		}
		public void setFirstName(String firstname){
			this.firstname = firstname;
		}
		public void setLastName(String lastname){
			this.lastname = lastname;
		}
		public String toString() {
			String output = lastname + firstname;
			return output;
		}
}
