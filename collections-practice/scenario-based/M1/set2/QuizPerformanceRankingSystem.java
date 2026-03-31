package set2;
import java.util.*;

public class QuizPerformanceRankingSystem {
	
	static class Student{
		String name;
		String department;
		int quiz1;
		int quiz2;
		int quiz3;
		int total;
		public Student(String name,String department,int quiz1,int quiz2,int quiz3) {
			this.name=name;
			this.department=department;
			this.quiz1=quiz1;
			this.quiz2=quiz2;
			this.quiz3=quiz3;
			total = quiz1+quiz2+quiz3;
		}
		
	}
	
	static ArrayList<Student> records = new ArrayList<>();
	static void addRecord(Student student) {
		records.add(student);
		System.out.println("Record Added: "+student.name);
	}
	
	static void top(String str) {

		int maxscore=0;
		String namee="";
		for(Student s: records) {
			
			if(s.department.equals(str)) {
			    if(s.total > maxscore) {
			        maxscore = s.total;
			        namee = s.name;
			    }
			}
			if(str.equals("Q1")) {
			    if(s.quiz1 > maxscore) {
			        maxscore = s.quiz1;
			        namee = s.name;
			    }
			}
			if(str.equals("Q2")) {
			    if(s.quiz2 > maxscore) {
			        maxscore = s.quiz2;
			        namee = s.name;
			    }
			}
			if(str.equals("Q3")) {
			    if(s.quiz3 > maxscore) {
			        maxscore = s.quiz3;
			        namee = s.name;
			    }
			}
			
		}
		for(Student s: records) {
			if(s.department.equals(str)) {
			    if(s.total == maxscore) {
			        System.out.println(s.name+" "+s.total);
			    }
			}
			if(str.equals("Q1")) {
			    if(s.quiz1 == maxscore) {
			    	System.out.println(s.name+" "+s.quiz1);
			    }
			}
			if(str.equals("Q2")) {
			    if(s.quiz2== maxscore) {
			    	System.out.println(s.name+" "+s.quiz2);
			    }
			}
			if(str.equals("Q3")) {
			    if(s.quiz3 == maxscore) {
			    	System.out.println(s.name+" "+s.quiz3);
			    }
			}
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String s = sc.nextLine();
			String[] wrds = s.split("\\s+");
			if(wrds[0].equals("Record")) {
				addRecord(new Student(wrds[1],wrds[2],Integer.parseInt(wrds[3]),Integer.parseInt(wrds[4]),Integer.parseInt(wrds[5])));
			}
			if(wrds[0].equals("Top")) {
				top(wrds[1]);
			}
		}
		sc.close();
	}

}

