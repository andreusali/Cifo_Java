package app;

import java.util.Scanner;

import service.ApartmentDb;
import service.LecturerDb;
import service.PetDb;
import service.StudentDb;
import service.VaccineDb;
import utilsdb.ApartmentInitialFilling;
import utilsdb.PetInitialFilling;
import utilsdb.VaccineInitialFilling;
import view.View;

public class Main {

	public static void main(String[] args) {
		
		StudentDb studentDb = new StudentDb("Students' DataBase");
		LecturerDb lecturerDb = new LecturerDb("Lecturers' Database");
		ApartmentDb apartmentDb = new ApartmentDb("Apartments Database");
		PetDb petDb = new PetDb("Pets' DataBase");
		VaccineDb vaccineDb = new VaccineDb("Vaccine Database");
		VaccineInitialFilling.vaccineDbPreFilling();
		PetInitialFilling.petDbPreFilling();
		ApartmentInitialFilling.apartmentDbPreFilling();

		
		Scanner input = new Scanner(System.in);
		View view = new View();
		view.start(input, studentDb, lecturerDb, apartmentDb, petDb, vaccineDb);
		
	}

}