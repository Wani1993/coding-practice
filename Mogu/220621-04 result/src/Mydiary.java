public class Mydiary implements Comparable<Mydiary> {
	private double date;
	private String title;
	private String weather;
	private String text;
	
	
	
	public Mydiary() {
		super();
	}



	public Mydiary(double date) {
		super();
		this.date = date;
	}



	public Mydiary(double date, String title, String weather, String text) {
		super();
		this.date = date;
		this.title = title;
		this.weather = weather;
		this.text = text;
	}

	

	public double getDate() {
		return date;
	}



	public void setDate(double date) {
		this.date = date;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getWeather() {
		return weather;
	}



	public void setWeather(String weather) {
		this.weather = weather;
	}



	public String getText() {
		return text;
	}



	public void setText(String text) {
		this.text = text;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(date);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Mydiary))
			return false;
		Mydiary other = (Mydiary) obj;
		if (Double.doubleToLongBits(date) != Double.doubleToLongBits(other.date))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Mydiary [date=" + date + ", title=" + title + ", weather=" + weather + ", text=" + text + "]";
	}



	@Override
	public int compareTo(Mydiary o) {
		return (int) ((date * 100) - (o.date * 100));
	}


	

	
	
	
}
