package GENERICSSrelated;
class Employee
{
	int emp_id;
	String emp_name;
	float basic_salary;
	float month_basic_salary;
	Employee(int id, String name, float sal)
	{
		emp_id=id;
		emp_name=name;
		basic_salary=sal;
	}
	Employee(float sal)
	{
		
		month_basic_salary=sal;
	}
	void display()
	{
		/*float da=basic_salary*15/100;
		float hra=basic_salary*10/100;
		float gross_sal=basic_salary+da+hra;*/
		
		float tax1=basic_salary*20/100;
		
		float tax2 ;
		
		if (basic_salary>34000)
		tax2=(34000-basic_salary)*40/100;
		else{
			tax2 =0;}
		float afterTax_sal=basic_salary-tax1-tax2;
		
		System.out.println ("Employee Id= "+emp_id);
		System.out.println ("Emplyee Name= "+emp_name);
		System.out.println ("Gross Salary= "+afterTax_sal);
		System.out.println ("Monthly Salary= "+afterTax_sal/12);
		
	}
	
	void display2()
	{
		
		
		float xxxxxxxxx=month_basic_salary*12;		
		System.out.println ("Yearly  Salary= "+month_basic_salary*12);
		
	}
	
	
}