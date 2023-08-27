package Entities;

public class Worker {

    public String name;
    public int age;
    public double salary;

    public double taxes;

    public double salaryIncrease;

    public double getSalary() {
        return (salary * (1 + salaryIncrease/100));
    }

    public double showTaxes(){
        return getSalary() * (taxes/100);
    }
}
