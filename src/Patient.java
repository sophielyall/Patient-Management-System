import java.util.ArrayList;

public class Patient {
	private int yearOfBirth, numOfVisits;
	private long medicareNum;
	private String firstName, lastName;
	private ArrayList<Visit> visits;
	
	public Patient(long medicare, String fName, String lName, int aYear) 
	{
		medicareNum = medicare;
		firstName = fName;
		lastName = lName;
		yearOfBirth = aYear;
		numOfVisits = 0;
		visits = new ArrayList<Visit>();
	}
	
	public void addAVisit(String date, double price, String doctor)
	{
		Visit aVisit = new Visit(date, price, doctor);
		visits.add(aVisit);
		numOfVisits ++;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getPatient()
	{
		return medicareNum + " " + firstName + " " + lastName + " " + yearOfBirth + " " + numOfVisits;
	}
	
	public void printAllVisits()
	{
		for(Visit visit : visits)
		{
			System.out.println(visit.getVisit());
		}
	}
	
	

}
