package school.management.system;
/*
* new test system for training
* of Capgemini
*/
public class Student {
    private int id,std,feesPaid,feesTotal;
    private String name;
    /**
     * to create a new student by initializing.
     * $30000 for every student
     * fees paid initially is 0
     * @param id - ID of the student : unique
     * @param name - Name of the student
     * @param std - Class student studying in
     */
    public Student(int id, String name, int std){
        this.id = id;
        this.name = name;
        this.std = std;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }
    // not altering id, name once set

    /**
     *used to set the id of the student
     * @param id - ID of the student
     */
    public void setId(int id){
        this.id = id;
    }
    /**
     * used to update the students STD
     * @param std - Class student currently studying in
     */
    public void setStd(int std){
        this.std = std;
    }
    /**
     * student pays fees
     * keep adding the fees to 'feesPaid' field
     * upon receiving fees from student,
     * @param fees - the fees the student pays
     */
    public void updateFeesPaid(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }
    /**
     * @return id of the student
     */
    public int getId(){
        return id;
    }
    /**
     * @return name of the student
     */
    public String getName(){
        return name;
    }
    /**
     * @return Std of the student
     */
    public int getStd(){
        return std;
    }
    /**
     *
     * @return fees paid by the student
     */
    public int getFeesPaid(){
        return feesPaid;
    }
    /**
     *
     * @return total fees of the student
     */
    public int getFeesTotal(){
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees
     */
    public int getRemainingFees(){
        System.out.println(" Remaining fees to be paid : $" + (feesTotal-feesPaid));
        return 0;
    }

    @Override
    public String toString() {
        return "Student's name : "+name+"\n Total Fees paid so far : $"+feesPaid;
    }
}

















