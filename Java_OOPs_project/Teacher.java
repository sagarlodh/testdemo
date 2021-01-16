package school.management.system;

/**
 * class used for keeping track for teacher's
 * name, id, salary
 */
public class Teacher {
    private int id;
    private int salary;
    private String name;
    private int salaryEarned;

    /**
     * creates a new teacher object
     * @param id - id of the teacher
     * @param name - name of the teacher
     * @param salary - salary of the teacher
     */
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     *
     * @return - return the id for curr teacher
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return - return name of curr teacher
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return - return salary of curr teacher
     */
    public int getSalary(){
        return salary;
    }

    /**
     * set the salary of teacher
     * @param salary - salary of the teacher
     */
    public void setSalary(int salary){
        this.salary = salary;
    }

    /**
     * adds to the salaryEarned
     * removes from the total money earned by the school
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of Teacher : "+name+"\n Salary : $"+salary;
    }
}
