import java.util.ArrayList;
import java.util.List;

public class Courses {
	   String courseName;
       String professorName;
       int year;

       List<Student> enrolledStudents;

       
       public Courses(String courseName, String professorName, int year) {
           this.courseName = courseName;
           this.professorName = professorName;
           this.year = year;
           this.enrolledStudents = new ArrayList<>(  );
       }
       
       public void enroll(Student Student){
    	      //TODO add the student to the collection
    	   if(!this.enrolledStudents.contains(Student)) {
    		   enrolledStudents.add(Student);
    		   System.out.println(Student.firstName + " " + Student.lastName +
    				   " enrolled in " + courseName + ", Profesor= "+ professorName +
    				   ", año= " + year);
    	   }else {
    		   System.out.println(Student.firstName + " " + Student.lastName +
    				   " is already enrolled.");
    	   }
       
       }
       
       public void enroll(Student[] Students){
    	      //TODO add all the students to the collection
    	for(Student Student:Students) {
    		   if(!this.enrolledStudents.contains(Student)) {
        		   enrolledStudents.add(Student);
        		   System.out.println(Student.firstName + " " + Student.lastName +
        				   " enrolled in " + courseName + ", Profesor= "+ professorName +
        				   ", año= " + year);
        	   }else {
        		   System.out.println(Student.firstName + " " + Student.lastName +
        				   "  is already enrolled.");
        	   }
    	}
       
       }

    	   public void unEnroll(Student Student){
    	       //TODO remove this student from the collection
    	       // Hint: check if that really is this student
    	   
        	   if(this.enrolledStudents.contains(Student)) {
        		   enrolledStudents.remove(Student);
        		   System.out.println(Student.firstName + " " + Student.lastName +
        				   " unenrolled for " + courseName + ", Profesor= "+ professorName +
        				   ", año= " + year);
        	   }else {
        		   System.out.println(Student.firstName + " " + Student.lastName +
        				   " is not enrolled");
        	   }
    	   
    	   }

    	   public int countStudents(){
    	       //TODO implement
    	       return enrolledStudents.size();
    	   }
    	   
    	   public int bestGrade(){
    	       //TODO implement
    	       int max = 0;
    	       for(Student Student: enrolledStudents) {
    	    	   if(Student.grade > max) {
    	    		   max = Student.grade;
    	    	   }
    	       }
    		   return max ;
    	   }

    	   



}

