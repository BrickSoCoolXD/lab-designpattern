package lab.oodp.company.view;

import lab.oodp.company.model.Employee;
import lab.oodp.company.model.Manager;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class EmployeeTreeAdapter implements TreeModel {
    private final Employee root;

    public EmployeeTreeAdapter(Employee employee) {
        this.root = employee;
    }

    @Override
    public Object getRoot() {
        // TODO complete this
        return null;
    }

    @Override
    public Object getChild(Object parent, int index) {
        // TODO complete this, return a child of given parent at specified index 
        return null;
    }

    @Override
    public int getChildCount(Object parent) {
        // TODO complete this, return number of child for given parent
        return 0;
    }

    @Override
    public boolean isLeaf(Object node) {
        // TODO complete this, check if node is manager and does it has any child? 
        return false;
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        // TODO complete this, loop through all children and return index at given child
        return 0;
    }

    /**
     * NO MODIFICATION FROM THIS LINE
     */

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
        // Unused
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {
        // Unused
    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {
        // Unused
    }
}
