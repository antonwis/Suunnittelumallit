package Chain_of_Responsibility;

public class Manager extends RaiseSalary {

    public void raiseRequest(Employee employee) {
        double oldSalary = employee.getSalary();
        if (employee.getNewSalary() <= employee.getSalary() * 1.02) {
            employee.setSalary(employee.getNewSalary());
            System.out.printf("Manager: Hello %s, Your raise request of %.2f%% has been approved. Your salary is now %.2f€\n", employee.getName(), ((employee.getNewSalary() - oldSalary) / oldSalary) * 100,employee.getSalary());
        } else {
            System.out.printf("Manager: Hello %s, Your raise request of %.2f€ exceeds my authorized 2%% limit. Forwarding your request to the Director\n", employee.getName(), employee.getNewSalary());
            super.raiseRequest(employee);
        }
    }
}
