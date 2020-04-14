package Chain_of_Responsibility;

public abstract class RaiseSalary {

    private RaiseSalary raiseSalary;
    public void setSuccessor(RaiseSalary raiseSalary) { this.raiseSalary = raiseSalary; }
    public void raiseRequest(Employee employee) { if (raiseSalary != null) raiseSalary.raiseRequest(employee); }

}
