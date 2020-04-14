package Chain_of_Responsibility;

public class Director extends RaiseSalary {

    public void raiseRequest(Employee employee) {
        double oldSalary = employee.getSalary();
        if (employee.getNewSalary() <= employee.getSalary() * 1.05) {
            employee.setSalary(employee.getNewSalary());
            System.out.printf("Director: Hello %s, Your raise request of %.2f%% has been approved. Your salary is now %.2f€\n", employee.getName(), ((employee.getNewSalary() - oldSalary) / oldSalary) * 100,employee.getSalary());
        } else {
            System.out.printf("Director: Hello %s, Your raise request of %.2f€ exceeds my authorized 5%% limit. Forwarding your request to the CEO\n", employee.getName(), employee.getNewSalary());
            super.raiseRequest(employee);
        }
    }
}
