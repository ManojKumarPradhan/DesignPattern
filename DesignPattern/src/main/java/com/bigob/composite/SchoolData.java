package com.bigob.composite;

public class SchoolData {

	public static void main(String[] args) {
		School student1=new Student("Manoj", 1, "2nd");
		School student2=new Student("Bibhu", 2, "3nd");
		School student3=new Student("Kumar", 3, "4nd");
		School student4=new Student("Sagar", 4, "2nd");
		School student5=new Student("Tusar", 5, "4nd");
		School student6=new Student("Pooja", 6, "3nd");
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		System.out.println(student5);
		System.out.println(student6);
		
		School teacher1=new Teacher("Gopal", 1, "Math");
		teacher1.add(student1);
		teacher1.add(student4);
		System.out.println(teacher1);
		
		School teacher2=new Teacher("Rajesh", 2, "Science");
		teacher2.add(student1);
		teacher2.add(student4);
		System.out.println(teacher2);
		
		School teacher3=new Teacher("Brajech", 3, "English");
		teacher3.add(student1);
		teacher3.add(student4);
		System.out.println(teacher3);
		
		School principal=new Principal("Udaya", 1);
		principal.add(teacher1);
		principal.add(teacher2);
		principal.add(teacher3);
		System.out.println(principal);
		
	}
	
}
