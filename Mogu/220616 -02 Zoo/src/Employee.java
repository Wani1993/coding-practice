
public class Employee {
	protected String breaker;
	protected String name;

	public Employee(String breaker) {
		super();
		this.breaker = breaker;
	}

	
	
	
	public Employee(String breaker, String name) {
		super();
		this.breaker = breaker;
		this.name = name;
	}




	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getBreaker() {
		return breaker;
	}

	public void setBreaker(String breaker) {
		this.breaker = breaker;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((breaker == null) ? 0 : breaker.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		if (breaker == null) {
			if (other.breaker != null)
				return false;
		} else if (!breaker.equals(other.breaker))
			return false;
		return true;
	}
	
	public void workIng() {
		Animal a = new Animal();
	}
	
	
	
	
}
