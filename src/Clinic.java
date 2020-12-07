import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;

public class Clinic {
 static ArrayList<Patient> patients;
 static String firstName, lastName, doctor, date;
 static double price;
 
 static int year;
 static long medicare;
	public Clinic() {
		patients = new ArrayList<Patient>();
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args)
	{
		new Clinic();
		while(true) {
		System.out.println("Welcome to Patient Management System");
		System.out.println("1.  add patient");
		System.out.println("2.  Delete Patient");
		System.out.println("3. List All Patients");
		System.out.println("4.  Find a patient and list visits");
		System.out.println(" 5.  Add Patient Visit");
		System.out.println("6. Exit");
		
		Scanner input = new Scanner(System.in);
		int selection = input.nextInt();
		switch(selection)
		{
		case 1: 
			System.out.println("add patient");
			System.out.println("Enter Patients MedicareNumber: ");
			 medicare = Long.parseLong((input.next()));
					 
			System.out.println("Enter Patients First Name: ");
			 firstName = input.next();
			 
			 System.out.println("Enter Patients last Name\\: ");
			 lastName = input.next();
			System.out.println("Enter Patients year of birth: ");
			 year = Integer.parseInt(input.next());
			
			addPatient(medicare, firstName,lastName, year);
			break;
		case 2: 
			
			System.out.println("delete patient");
			System.out.println("Enter Patients first Name ");
			 firstName = input.next();
			 System.out.println("Enter Patients last Name ");
			 lastName = input.next();
			deletePatient(firstName, lastName);
			break;
		case 3: 
			System.out.println("list patient");
			ListAllPatients();
			break;
		case 4: 
			System.out.println("find patient");
			System.out.println("Enter Patients First Name: ");
			 firstName = input.next();
			 System.out.println("Enter Patients Last Name: ");
			 lastName = input.next();
			 findPatientVisit(firstName, lastName);
			break;
			
		case 5: 
			System.out.println("add patient visit");
			
			System.out.println("Enter first name of patient: ");
			 firstName = input.next();
			 System.out.println("Enter last name of patient: ");
			 lastName = input.next();
			System.out.println("Enter date of visit: ");
			 date = input.next();
			 System.out.println("Enter price of visit: ");
			 price = input.nextDouble();
			 System.out.println("Enter Name of the doctor: ");
			 doctor = input.next();
			 
			findPatientByName(firstName, lastName).addAVisit(date, price, doctor);
			break;
			
		case 6:
			System.out.println("---exiting");
			System.exit(1);
		default: System.out.println("innvalid item");
        break;
		}
		
		}
	}
	
	public static void addPatient(long medicare, String firstName, String lastName,int year)
	{
		Patient aPatient = new Patient(medicare, firstName, lastName, year);
		patients.add(aPatient);
	}
	
	public static void deletePatient(String fName, String lName)
	{
	Patient toDelete = null;
		for(Patient aPatient: patients)
		{
			if(aPatient.getFirstName().equals(fName) && aPatient.getLastName().equals(lName))
			{
				toDelete = aPatient;
			}
		}
		
		patients.remove(toDelete);
	}
	
	public static void ListAllPatients()
	{
		for(Patient aPatient: patients)
		{
			System.out.println( aPatient.getPatient());
		}
		
		
	}
	
	public static Patient findPatientByName(String fName, String lName)
	{
		Patient foundPatient = null;
		
		for(Patient aPatient : patients)
		{
			if(aPatient.getFirstName().equals(fName) && aPatient.getLastName().equals(lName))
			{
				foundPatient = aPatient;
				continue;
			}
		}
		return foundPatient;
	}
	
	
	public static void findPatientVisit(String fName, String lName)
	{
	
		
		findPatientByName(fName, lName).printAllVisits();
	}

}
