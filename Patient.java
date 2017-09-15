
public class Patient {
	
	private String name;
	private int age;
	
	public Patient(String n, int a) {
		name = n;
		age = a;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double bmi(double heightInMeters, double weightInKilograms) {
		double bodyMassIndex = weightInKilograms / (heightInMeters * heightInMeters);
		return bodyMassIndex;
	}
	
	public double bmi(double height, String heightUnits, double weight, String weightUnits) {
		double w;
		double h;
		if (heightUnits.equals("cm")) {
			h = height / 100;
		} else {
			h = height * 0.0254;
		}
		
		if (weightUnits.equals("lbs")) {
			w = weight / 2.2;
		} else {
			w = weight /  0.15747;
		}
		
		return (w / (h * h));
	}
	
	public double dosage() {
		return 600.00;
	}
	
	public void toStringInfos() {
		System.out.println("Patient " + name + " is " + age + " years old.");
	}
}
