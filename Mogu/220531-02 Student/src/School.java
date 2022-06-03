
public class School {
	private Student a;
	private Student b;
	private Student c;
	
	public School(Student a, Student b, Student c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	void studentName() {
		System.out.printf("이름 : %s, %s, %s\n", a.getName(), b.getName(),c.getName());
		
	}
	
	int totalAvg() {
		return (a.getAverage() + b.getAverage() + c.getAverage()) / 3;
	}
	
	void totalWin() {
		if (a.getAverage() == b.getAverage() && a.getAverage() == c.getAverage() && b.getAverage() == c.getAverage()) {
			System.out.println(a.getName() + " " + b.getName() + " " + c.getName());
	    } else if (a.getAverage() == b.getAverage()) {
	    	if (a.getAverage() > c.getAverage()) {
	    	System.out.println(a.getName() + " " + b.getName());
	    	} else {
	    		System.out.println(c.getName());
	    	}
	    } else if (b.getAverage() == c.getAverage()) {
	    	if (b.getAverage() > a.getAverage()) {
	    	System.out.println(b.getName() + " " + c.getName());
	    	} else {
	    		System.out.println(a.getName());
	    	}
	    } else if (a.getAverage() == c.getAverage()) {
	    	if (a.getAverage() > b.getAverage()) {
	    	System.out.println(a.getName() + " " + c.getName());
	    	} else {
	    		System.out.println(b.getName());
	    	}
	    } else if (a.getAverage() > b.getAverage() && a.getAverage() > c.getAverage()) {
	    	System.out.println(a.getName());
		} else if (b.getAverage() > c.getAverage()) {
			System.out.println(b.getName());
		} else {
			System.out.println(c.getName());
		}
	
	}

	public Student getA() {
		return a;
	}

	public void setA(Student a) {
		this.a = a;
	}

	public Student getB() {
		return b;
	}

	public void setB(Student b) {
		this.b = b;
	}

	public Student getC() {
		return c;
	}

	public void setC(Student c) {
		this.c = c;
	}
	

	

	
	
	
	
	
}
