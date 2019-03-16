package com.assignment;

/**
 * Hello world!
 *
 */
public class App 
{

    public static final int MAX_EMPLOYEES = 10;

    public static double payIncrease(Employee emp, double amt){
        return amt += emp.pay();
    }
    public static void main( String[] args )
    {
        Employee[] employees = new Employee[MAX_EMPLOYEES];

        int emp = 0;
        employees[emp++] = new Hourly("George Jones", 75.00, 2.5);
        employees[emp++] = new Salaried("Dolly Parton", 125.00);
        employees[emp++] = new Hourly("Willie Nelson", 85.00, 3.0);
        employees[emp++] = new Salaried("Jim Reeves", 150.00);
        employees[emp++] = new Hourly("Tammy Wynette", 65.00, 2.0);

        for (int i = 0; i < emp; ++i)  {
            System.out.println("employee:  " + employees[i]);
            System.out.println("pay:  " + employees[i].pay());
            System.out.println();
        }


        Employee emp1 = new Hourly("Jimmy Jungle", 20.00, 2);
        System.out.println("Employee "+ emp1.getName()+ " new salary:R"+App.payIncrease(emp1, 100));
    }
}

