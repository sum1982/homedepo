package condetionProject;

import java.util.Scanner;

public class Student {
private int eng;
private int sci;
private int math;

public int getEng() {
	return eng;
}
public void setEng(int eng) {
	this.eng = eng;
}
public int getSci() {
	return sci;
}
public void setSci(int sci) {
	this.sci = sci;
}
public int getMath() {
	return math;
}
public void setMath(int math) {
	this.math = math;
}

public String getStudent() {
	
	int total = eng+math+sci;
	float avg = total /3.0f;
	
	if (avg>=60 && avg<=70) {
		return "D";
	}else if(avg>=70 && avg<=80) {
		return "C";
	}else if(avg>=80 && avg<=90) {
		return "B";
	}else if(avg>=90 && avg<=100) {
		return "A";
	}else {
		return "fail";
	}
	
}



public static void main (String args[]) {
//	Scanner scan = new Scanner(System.in);
//		System.out.println("Enter Student");
	Student s1 = new Student();
	s1.setEng(65);
	s1.setMath(55);
	s1.setSci(45);
	System.out.println("Student ="+ s1.getStudent());
	
	Student s2 = new Student();
	s2.setEng(95);
	s2.setMath(65);
	s2.setSci(62);
	System.out.println("Student ="+ s2.getStudent());
}

}
