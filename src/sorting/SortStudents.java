//Program to sort list of students based on their gpa. 
//EPI Sorting Boot Camp
package sorting;

import java.util.Arrays;

public class SortStudents {

	public class Student implements Comparable<Student> { 
		String name;
		double gpa;
		Student(String name, double gpa) {
			this.name = name;
			this.gpa = gpa;
		}
		
		@Override
		public int compareTo(Student b) {
			if(this.gpa > b.gpa)
				return 1;
			if(this.gpa == b.gpa)
				return 0;
			return -1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortStudents obj = new SortStudents();
		SortStudents.Student s1 = obj.new Student("abc", 3.6);
		SortStudents.Student s2 = obj.new Student("abc", 3.6);
		SortStudents.Student s3 = obj.new Student("abcdef", 3.3);
		SortStudents.Student s4 = obj.new Student("xyz", 2.0);
		SortStudents.Student[] arr = new SortStudents.Student[4];
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = s4;
		Arrays.sort(arr);
		for(int i=0; i<4; i++) {
			System.out.println(arr[i].name+":"+arr[i].gpa);
		}
	}

}
