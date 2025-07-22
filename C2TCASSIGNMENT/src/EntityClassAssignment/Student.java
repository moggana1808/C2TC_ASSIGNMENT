package EntityClassAssignment;

public class Student {


		// TODO Auto-generated method stub
		    private int rollNumber;
		    private String name;
		    private int age;

		    // Constructor
		    public Student(int rollNumber, String name, int age) {
		        this.rollNumber = rollNumber;
		        this.name = name;
		        this.age = age;
		    }

		    // Display student details
		    public void displayDetails() {
		        System.out.println("Roll Number: " + rollNumber);
		        System.out.println("Name       : " + name);
		        System.out.println("Age        : " + age);
		        System.out.println("-------------------------");
		    }
		

	}


