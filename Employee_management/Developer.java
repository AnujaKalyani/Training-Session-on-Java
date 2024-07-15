package emp.com;

public class Developer extends Employee {
	private String ProgrammingLanguage;

	public Developer(String name, int id, double salary,String ProgrammingLanguage ) {
		super(name, id, salary);
		this.ProgrammingLanguage=ProgrammingLanguage;
		
	}

	public String getProgrammingLanguage() {
		return ProgrammingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.ProgrammingLanguage = programmingLanguage;
	}
	 
	public void displayDetails() {
		super.displayDetails();
		System.out.println("ProgrammingLanguage:"+ProgrammingLanguage);
	}

}
