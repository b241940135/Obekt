package biedaalt;

public class Student {
	
	    private String firstName;
	    private String lastName;
	    private int age;
	    private String major;   
	    private double gpa;    

	    public Student() {
	        this.firstName = "Unknown";
	        this.lastName = "Unknown";
	        this.age = 0;
	        this.major = "Undetermined";
	        this.gpa = 0.0;
	    }

	   
	    public Student(String firstName, String lastName, int age, String major, double gpa) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.age = age;
	        this.major = major;
	        this.gpa = gpa;
	    }

	   
	    private String evaluatePerformance() {
	        if (gpa >= 3.6) {
	            return "Onts(A)";
	        } else if (gpa >= 3.0) {
	            return "Sain (B)";
	        } else if (gpa >= 2.0) {
	            return "Dund (C)";
	        } else {
	            return "Hiceele hii (F)";
	        }
	    }

	  
	    public static void printSchoolInfo() {
	        System.out.println("Shutis Medeelel Technologiin angi");
	    }

	   
	    public void displayInfo() {
	        System.out.println("Oyutnii Medeelel");
	        System.out.println("Ovog Ner: " + lastName + " " + firstName);
	        System.out.println("Nas: " + age);
	        System.out.println("Meregjil: " + major);
	        System.out.println("Golch dvn: " + gpa);
	      
	        System.out.println("Vnelgee: " + evaluatePerformance());
	        System.out.println();
	    }
	    
	    public static void main(String[] args) {
	       
	        Student.printSchoolInfo();

	        Student s1 = new Student("lagva", "Erhmebayr", 18,"IT", 1.5);
	        Student s2 = new Student("Uguumur", "Nurka", 19, "IT", 3.8);
	        Student s3 = new Student("Badral", "Javhaa", 20, "IT", 2.5);

	        s1.displayInfo();
	        s2.displayInfo();
	        s3.displayInfo();
	    }
	}