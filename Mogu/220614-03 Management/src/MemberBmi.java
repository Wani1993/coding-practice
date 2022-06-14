
public class MemberBmi extends Member {
	private double BMI;

	public MemberBmi(double bMI) {
		super();
		BMI = bMI;
	}
	
	public MemberBmi() {
	}
	
	public MemberBmi(String name, double cm, double kg) {
		super(name, cm, kg);
	}

	public MemberBmi(String name, double cm, double kg, double bMI) {
		super(name, cm, kg);
		BMI = bMI;
	}

	public double getBMI() {
		return BMI;
	}

	public void setBMI(double bMI) {
		BMI = bMI;
	}
	
	public double getBmi() {
		 return  this.kg / (this.miter * this.miter);
	}
	
	
	
}