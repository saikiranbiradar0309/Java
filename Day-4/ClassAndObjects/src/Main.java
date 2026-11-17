
public class Main {
	
	public static void main(String[] args)
    {
        Employee emp1 = new Employee();

        emp1.empId = 101;
        emp1.empName = "Saikiran";
        emp1.salary = 123000;

        System.out.println(emp1.empId);
        System.out.println(emp1.empName);
        System.out.println(emp1.salary);


        Employee emp2 = new Employee();

        emp2.empId = 102;
        emp2.empName = "Abhishek";
        emp2.salary = 323000;

        System.out.println(emp2.empId);
        System.out.println(emp2.empName);
        System.out.println(emp2.salary);


        Employee emp3 = new Employee();

        emp3.empId = 103;
        emp3.empName = "Niranjan";
        emp3.salary = 153000;


        System.out.println(emp3.empId);
        System.out.println(emp3.empName);
        System.out.println(emp3.salary);


    }
}
