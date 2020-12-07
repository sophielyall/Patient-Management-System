
public class Visit {
	String dateOfVisit, nameOfDoctor;
	double priceOfVisit;
	public Visit(String dateVisited, double price, String doctor) {
dateOfVisit = dateVisited;
priceOfVisit = price;
nameOfDoctor = doctor;
	}
	
	public String getVisit()
	{
		return dateOfVisit + ", $" + priceOfVisit + ", " + nameOfDoctor;
	}

}
