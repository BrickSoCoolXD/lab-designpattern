package lab.oodp.company.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/**
 * Intended to represent an employee at a company. Each employee has a number of info fields,
 * and can be managed by a Manager.
 */
public class Employee {

    private static final Manager Manager = null;
    private int id;
    private String name;
    private String email;
    private String jobTitle;
    private int salary;
    //TODO: add manager field

    private Manager manager;

    public Employee(int id, String name, String email, String jobTitle, int salary) {
        // TODO complete this
        this.id = id;
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    /**
     * Gets this employee's Manager, if any.
     *
     * @return the employee's manager, or null if the employee has no manager
     */
    public Manager getManager() {
        // TODO complete this
        return manager;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    /**
     * Gets the total "reporting chain" for this employee. This is essentially a list of employees starting at the root
     * of the employment hierarchy. Examples:
     * <p>
     * If this employee has no manager, the list will just contain this employee.
     * <p>
     * If this employee has a manager, then the list will contain its manager's reporting chain, with this employee
     * added at the end.
     *
     * @return this employee's reporting chain, as a List.
     */
    public List<Employee> getReportingChain() {
        // TODO complete this by calling getReportingChain of manager and add this employee as the last item in the list
        // NOTE you might want to check if manager is null first (meaning he/she is a top manager). If it is null, return only a list containing this employee
        List<Employee> reportingchhain = new ArrayList<Employee>();
        if (manager == null) {
            reportingchhain.add(this);
        } else {
            reportingchhain.addAll(manager.getReportingChain());
            reportingchhain.add(this);
        }
        return reportingchhain;
    }

   /**
     * NO MODIFICATION FURTHER THAN THIS LINE
     * 
     */
    @Override
    public String toString() {
        return name + " (email: " + email + ")";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                salary == employee.salary &&
                name.equals(employee.name) &&
                email.equals(employee.email) &&
                jobTitle.equals(employee.jobTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, jobTitle, salary);
    }

    public Collection<? extends Employee> getAllEmployees() {
        return null;
    }
}
