package Chain_of_Responsibility;

public class CEO extends RaiseSalary {

    public void raiseRequest(Employee employee) {
        double oldSalary = employee.getSalary();
        System.out.printf("CEO: What the fuck %s? Your monthly salary proposal of %.2f€ is preposterous. That would increase your salary by %.2f%%. You're fired.\n", employee.getName(), employee.getNewSalary(), ((employee.getNewSalary() - oldSalary) / oldSalary) * 100);
    }
}
