
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Courses  Java = new Courses("Fundamentos de Java", "JC Valencia", 2025);
		
		Student Rogelio = new Student("Rogelio", "Luis Almazan", 2020, 70, 2025);
		Student Miguel = new Student("Miguel", "Camarena", 2023, 100, 2025);
		Student Angela = new Student("Angela", "Perez", 2020, 50, 2025);
		Student Fer = new Student("Fernanda", "O Farrill", 2021, 80, 2025);
		Student Placido = new Student("Placido", "Domingo", 2022, 60, 2025);
		Student[] newStudents = {Rogelio, Miguel, Angela, Fer, Placido};
		
		System.out.println("____________________");
		System.out.print("Nombre completo: ");
	    Rogelio.printFullName();
	    System.out.println("¿Está aprobado? " + Rogelio.isApproved());
	    System.out.println("El año de Rogelio es ahora: " + Rogelio.changeYearIfApproved());
	    System.out.println("____________________");
	    System.out.print("Nombre completo: ");
	    Angela.printFullName();
	    System.out.println("¿Está aprobado? " + Angela.isApproved());
	    System.out.println("El año de Angela es ahora: " + Angela.changeYearIfApproved());
	    System.out.println("____________________");
		Java.enroll(newStudents);
		System.out.println("____________________");
		Java.unEnroll(Placido);
		System.out.println("____________________");
		Java.enroll(Placido);
		System.out.println("____________________");
		System.out.println("Estudiantes registrados: "+ Java.countStudents());
		System.out.println("____________________");
		System.out.println("Mejor nota:" + Java.bestGrade());
	}

}
