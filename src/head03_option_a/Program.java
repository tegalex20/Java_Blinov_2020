package head03_option_a;

import java.io.ObjectInputStream.GetField;



public class Program {

	public static void main(String[] args) {
		
		
		Student st7 = new Student("Sisil", "Georg", "Ivanovich", 1978, "Minsk Lasurna 28", 5);
		System.out.println ();
		System.out.println("St7 -" + st7.toString());
		
	//Инкапсуляция в класс StudentList	

		StudentList studentList = new StudentList(6); // указываем сколько (6)студентов создать
	    studentList.generatedStudent();
	
	
	//вызов метода печати масива ссылок студентов из класса StudentList
	System.out.println("List of students");
	studentList.print();
	//Student.setFaculty("Java"); для поля static можно изменить значение для всех объектов
	
	//вызов метода печати мах года рождения из класса StudentList
    int yearOfbirthX = studentList.getMaxAgeStudent();
    System.out.println("\nMin Age Student =" + yearOfbirthX);
    
  //вызов метода печати обекта с мах годом рождения из класса StudentList
    Student st = studentList.getStudentMaxAge() ;
    System.out.println(st);
	
    
	
	Customer cust1 = new Customer("Ivanov",  "Petr",  "Ivanivich",  "Odessa Gaidara 24" , 34324532, 235734857);
	Customer cust2 = new Customer("Sidorov", "Ivan", "Olegovich",  "Odessa Gaidara 24" , 34324460, 235738757);
	Customer cust3 = new Customer("Ivanov",  "Petr",  "Ivanivich",  "Odessa Gaidara 24" , 34234532, 235733357);
	Customer cust4 = new Customer("Berezin", "Oleg", "Petrovich",  "Odessa Gaidara 24" , 34324467, 235735757);
	Customer cust5 = new Customer("Ivanko",  "Petr",  "Ivanivich",  "Odessa Gaidara 24" , 34724532, 235799857);
	Customer cust6 = new Customer("Perov", "Igor", "Petrovich",  "Odessa Gaidara 24" , 34324702, 235738767);
	Customer cust7 = new Customer("Perova", "Inga", "Petrovna",  "Odessa Gaidara 24" , 34324402, 235731167);
	
	System.out.println ();
	System.out.println(cust2.toString());
	
	//Создание массива ссылок на объект.
	Customer []costs = new Customer [Customer.getId()];
	costs[0]= cust1;
	costs[1]= cust2;
	costs[2]= cust3;
	costs[3]= cust4;
	costs[4]= cust5;
	costs[5]= cust6;
	
	System.out.println("\nAray length :" + costs.length);
	
/*	вывод на консоль всех объектов	
 *             for (int i = 0; i < costs.length; i++) {
					System.out.println(costs[i]);
		       }
*/	
	//Поиск объектов по номеру карты - выдает ошибку - ЗНАЧЕНИЕ НОЛЬ
	int credit_cardX1 = 34324460 ;
	int credit_cardX2 = 34324702 ;
	System.out.println("Search by credit card, from :" + credit_cardX1+ " to :" + credit_cardX2);
	for (int i = 0; i < costs.length; i++) {
		if (costs[i].getCredit_card() >= credit_cardX1 &&  costs[i].getCredit_card()<= credit_cardX2) {
			System.out.println(costs[i]);
		}
	}
	
	//Поиск объектов по фамилии
		String xSurname = "Ivanov";
		System.out.println("Search by name :" + xSurname);
		for (int i = 0; i < costs.length; i++) {
			if (xSurname.equals(costs[i].getSurname())) {
				System.out.println(costs[i]);
			}
		}
		
		
	}
}
