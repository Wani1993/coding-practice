
public class Animal {
	
	protected String habits;
	protected String species;
	protected int age;
	protected int kg;
	
	
	
	public Animal() {
	
	}

	public Animal(String habits, String species, int age, int kg) {
		this.habits = habits;
		this.species = species;
		this.age = age;
		this.kg = kg;
	}

	public String getHabits() {
		return habits;
	}

	public void setHabits(String habits) {
		this.habits = habits;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getKg() {
		return kg;
	}

	public void setKg(int kg) {
		this.kg = kg;
	}

	@Override
	public String toString() {
		return "주식 :" + habits + ", 종은: " + species + ", 나이: " + age + "살, 몸무게 : " + kg + "kg";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((habits == null) ? 0 : habits.hashCode());
		result = prime * result + kg;
		result = prime * result + ((species == null) ? 0 : species.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Animal))
			return false;
		Animal other = (Animal) obj;
		if (age != other.age)
			return false;
		if (habits == null) {
			if (other.habits != null)
				return false;
		} else if (!habits.equals(other.habits))
			return false;
		if (kg != other.kg)
			return false;
		if (species == null) {
			if (other.species != null)
				return false;
		} else if (!species.equals(other.species))
			return false;
		return true;
	}
	
	
	
	
	
	
}
