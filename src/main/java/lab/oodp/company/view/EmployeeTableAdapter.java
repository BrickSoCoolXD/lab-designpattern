package lab.oodp.company.view;

import lab.oodp.company.model.Employee;
import lab.oodp.company.model.Manager;

import javax.swing.table.AbstractTableModel;
import java.util.List;
import java.util.Optional;

public class EmployeeTableAdapter extends AbstractTableModel {

    private List<Employee> employees;

    public EmployeeTableAdapter(Manager boss) {
        this.employees = boss.getAllEmployees();
    }

    @Override
    public int getRowCount() {
        // TODO complete this, return number of employee
        return 0;
    }

    @Override
    public int getColumnCount() {
        // TODO complete this, return number of columns to be shown in the table, it should be 6, look at the hint below for getColumnName()
        return 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // TODO complete this, return value at given row and specified column 
        // For example, rowIndex:1 and columnIndex 0 would return the ID of the 2nd employee in the list.
        // For example, rowIndex:2 and columnIndex 1 would return the Name of the 3rd employee in the list.
        return null;
    }

    @Override
    public String getColumnName(int column) {
        // TODO complete this, return column name at specified column as following, 0: "ID", 1: "Name", 2: "Email address" , 3: "Job title", 4: "Reports to" and 5:"Salary"
        return "";
    }

   
}
