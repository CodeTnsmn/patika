public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public void toCalc(){
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Work hours: " + this.workHours);
        System.out.println("The year of starting work : " + this.hireYear);
        System.out.println("Tax : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Salary increase : " + raiseSalary());
        System.out.println("Salary with taxes and bonus : " + (this.salary + bonus() - tax()));
        System.out.println("Total Salary : " + (this.salary +  raiseSalary()));
    }

    public double tax(){
        double tax =0;

        if (this.salary <= 1000){
            tax = 0;

        }
        if (this.salary > 1000){
            tax +=this.salary * 0.3;

        }
        return tax;
    }

    public double bonus(){
        double bonus;
        if (this.workHours >= 40){
            bonus = (this.workHours - 40) * 30;

        }else {
            bonus=0;
        }
        return bonus;
    }
    public double raiseSalary(){
        double raiseSalary = 0;

        if ((2021-this.hireYear)<10){
            raiseSalary += this.salary * 0.5;
        }
        if (((2021-this.hireYear ) > 9) && ((2021-this.hireYear) < 20)){
            raiseSalary += this.salary * 0.10;
        }
        if ((2021 - hireYear) > 19){
            raiseSalary += this.salary * 0.15;
        }
        return raiseSalary;

    }



}
