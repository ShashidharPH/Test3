package Tester;

public class Teacher {
	private String teacherName;
	private String subject;
	private double salary;
	public Teacher(String teacherName,String subject,double salary){
		this.teacherName = teacherName;
		this.subject = subject;
		this.salary = salary;
	}

	public String getTeacherName() {
		return teacherName;
		
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		Teacher[] obj=new Teacher[4];
		obj[0]=new Teacher("Alex","Javafundamentals",1200L");
		obj[1]=new Teacher("John","RDBMS",800L);
		obj[2]=new Teacher("Sam","Networking",900L);
		obj[3]=new Teacher("Maria","Python",900L);
		for(Teacher teacher:obj) {
			System.out.print("Name:"+teacher.getTeacherName());
			System.out.print(":"+teacher.getSubject());
			System.out.println(":"+teacher.getSalary());
		}
	}

}
