/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {
/**
 * Name.
 */
    private String name;
    /**
     * Manager.
     */
    private String manager;

    /**
     * Constructor for initialization.
     * @param newName name of the employee
     * @param newManager manager of the employee
     */
    public Employee(final String newName, final String newManager) {
        this.name = newName;
        this.manager = newManager;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param newName The new name to set.
     */
    public void setName(final String newName) {
        this.name = newName;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param newManager The new manager to set.
     */
    public void setManager(final String newManager) {
        this.manager = newManager;
    }
}
