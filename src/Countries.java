//Amna Anjum
public class Countries {

	String name;

	public Countries(String name) {
		super();
		this.name = name;
	}

	public String getCountries() {
		return name;
	}

	public void setCountries(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Countries " + name;
	}

}
