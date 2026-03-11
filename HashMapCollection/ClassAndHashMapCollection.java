package LearningJava;
import java.util.HashSet;
import java.util.Iterator;

class EmployeeData
{
	int empNo;
	String empName;
	int empSal;
	
	EmployeeData(int empNo, String empName,int empSal)
	{
		this.empNo=empNo;
		this.empName=empName;
		this.empSal=empSal;
	}
}

public class ClassAndHashMapCollection {
public static void main(String[] args) {
	
		
		EmployeeData e1=new EmployeeData(101,"John",20000);
		EmployeeData e2=new EmployeeData(102,"David",50000);
		EmployeeData e3=new EmployeeData(103,"Mary",70000);
		
		HashSet <EmployeeData> myset=new HashSet<EmployeeData>();
		
		myset.add(e1);
		myset.add(e2);
		myset.add(e3);
		
		//read data from objects using for..each loop
		
		/*for(Employee emp:myset)
		{
			System.out.println(emp.empName+"  "+emp.empNo+"  "+emp.empSal);
		}
		*/
		
		Iterator itr=myset.iterator();
		
		while(itr.hasNext())
		{
			EmployeeData emp=(EmployeeData)itr.next();
			System.out.println(emp.empName+"  "+emp.empNo+"  "+emp.empSal);
		}
		
		
	}
}
