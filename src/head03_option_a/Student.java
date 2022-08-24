package head03_option_a;



public class Student {
	
	//????????? ???? ??????
private static int id = 0;
private int current_id;
private String surname;
private String name;
private String patronymic;
private int yearOfbirth;
private String address;
private static String faculty;
private int course;
private String group;


//????????? ?????????????. 
//??? ????? ??? ????????????? ?????????? ?????????? ??????.
public Student(String surname, String name, String patronymic, Integer yearOfbirth,
		String address, String faculty, int course, String group) {
	super();
	Student.id++; 
	this.current_id = Student.id;
	this.surname = surname;
	this.name = name;
	this.patronymic = patronymic;
	this.yearOfbirth = yearOfbirth;
	this.address = address;
	this.faculty = faculty;
	this.course = course;
	this.group = group;
}



public Student( String surname, String name, String patronymic,
		int yearOfbirth, String address,  String group) {
	super();
	Student.id++; 
	this.current_id = Student.id;
	this.surname = surname;
	this.name = name;
	this.patronymic = patronymic;
	this.yearOfbirth = yearOfbirth;
	this.address = address;
	this.course = 4;
	this.group = group;
}



public Student( String surname, String name, String patronymic,
		int yearOfbirth, String address, int course) {
	super();
	Student.id++; 
	this.current_id = Student.id;
	this.surname = surname;
	this.name = name;
	this.patronymic = patronymic;
	this.yearOfbirth = yearOfbirth;
	this.address = address;
	this.course = course;
	this.group = "Java";
}



//????????? ?????? ?????? ( ??? ????????? ?????????? ?????????? ??????) ?
// ??????  (??? ????????? ?????????? ?????????? ??????)
public static int getId() {
	return id;
}

public int getCurrent_id() {
	return current_id;
}

public String getSurname() {
	return surname;
}

public void setSurname(String surname) {
	this.surname = surname;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPatronymic() {
	return patronymic;
}

public void setPatronymic(String patronymic) {
	this.patronymic = patronymic;
}

public int getYearOfbirth() {
	return yearOfbirth;
}

public void setYearOfbirth(int yearOfbirth) {
	this.yearOfbirth = yearOfbirth;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getFaculty() {
	return faculty;
}

public void setFaculty(String faculty) {
	this.faculty = faculty;
}

public int getCourse() {
	return course;
}

public void setCourse(int course) {
	this.course = course;
}

public String getGroup() {
	return group;
}

public void setGroup(String group) {
	this.group = group;
}

@Override
public String toString() {
	return "Student [id=" + current_id + ", surname=" + surname + ", name=" + name + ", patronymic="
			+ patronymic + ", yearOfbirth=" + yearOfbirth + ", address="
			+ address + ", faculty=" + faculty + ", course=" + course
			+ ", group=" + group + "]";
}


}
