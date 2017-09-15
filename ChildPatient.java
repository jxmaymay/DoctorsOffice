
public class ChildPatient extends Patient{
	
	private String parentName;
	
	public ChildPatient(String n, int a, String p) {
		super(n, a);
		parentName = p;
	}
	
	public String getParentName() {
		return parentName;
	}
	
	public double dosage() {
		return 300.00;
	}
	
	public void toStringInfos() {
		System.out.println("Patient " + getName() + " is " + getAge() + " years old and"
				+ " has parent " + parentName + ".");
	}
}
