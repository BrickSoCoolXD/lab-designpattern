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
        return employees.size();
    }

    @Override
    public int getColumnCount() {
        // TODO complete this, return number of columns to be shown in the table, it should be 6, look at the hint below for getColumnName()
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // TODO complete this, return value at given row and specified column 
        // For example, rowIndex:1 and columnIndex 0 would return the ID of the 2nd employee in the list.
        // For example, rowIndex:2 and columnIndex 1 would return the Name of the 3rd employee in the list.
        Employee employee = employees.get(rowIndex);
        if (columnIndex == 0) {
            return employee.getId();
        } else if (columnIndex == 1) {
            return employee.getName();
        }else if (columnIndex == 2) {
            return employee.getEmail();
        }else if (columnIndex == 3) {
            return employee.getJobTitle();
        }else if (columnIndex == 4) {
            if (employee.getManager() != null) {
            return employee.getManager().getName();        
        } else {
        return "";
        }
    } else if (columnIndex == 5) {
        return "$"+employee.getSalary();
    }
    return null;
}

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "ID";
        } else if (column == 1) {
            return "Name";
        } else if (column == 2) {
            return "Email address";
        } else if (column == 3) {
            return "Job title";
        } else if (column == 4) {
            return "Reports to";
        } else if (column == 5) {
            return "Salary";
        }
        return "";
    }
}
