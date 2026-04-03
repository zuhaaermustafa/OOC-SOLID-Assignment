//Just makes reports
package srp;
public class EmployeeReportGenerator {
    public String report(Employee e) { return "Name: " + e.getName() + ", Salary: " + e.getSalary(); }
}
