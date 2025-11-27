
   public class Student {
       String firstName;
       String lastName;
       int registration;
       int grade;
       int year;
 
       public void printFullName(){
    	      //TODO implement
    	   System.out.println(firstName +" " + lastName);
    	   }//FullName

    	   public boolean isApproved(){
    	       //TODO implement: should return true if grade >= 60
    		  return grade >=60;
    	   }//isApproved
    	   
    	   public int changeYearIfApproved(){
    	       //TODO implement: the student should advance to the next year if he/she grade is >= 60
    	       // Make year = year + 1, and print "Congragulations" if the student has been approved
        	   if(isApproved()) {
        		   System.out.println("Congratualtions");
        		   year++;
        		   return year;
        	   }
			   return year; 
    	   }//changeYearIfApproved
    	   
    	   
    	   public Student(String firstName, String lastName, int registration, int grade, int year) {
    		   this.firstName = firstName;
    		   this.lastName = lastName;
    		   this.registration = registration;
    		   this.grade = grade;
    		   this.year = year;
		}
    	   @Override
    	   public String toString(){
    	        return "Student{" + "name='" + firstName+" "+lastName + '\'' + " registation= "+ registration + " grade= " + grade + " year= " + year + '}';
    	   }
   }