package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher zeus = new Teacher(1,"Zeus",2000);
        Teacher jack = new Teacher(2,"Jack",3000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(zeus);
        teacherList.add(jack);

        Student tom = new Student(1,"Tom",4);
        Student raj = new Student(2,"Raj",7);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tom);
        studentList.add(raj);

        School dbsk = new School(teacherList,studentList);


        tom.updateFeesPaid(6000);
        System.out.println(tom);
        tom.getRemainingFees();

        raj.updateFeesPaid(8000);
        System.out.println(raj);
        raj.getRemainingFees();
        /**
         * total money earned for the school
         */
        System.out.println("DBSK has earned $"+dbsk.getTotalMoneyEarned());

        System.out.println("--------Making School Pay Salary----------");
        System.out.println(zeus);
        /**
         * paying salary to 'Zeus'
         */
        zeus.receiveSalary(zeus.getSalary());
        System.out.println("DBSK has paid $"+zeus.getSalary()+" salary to '"+zeus.getName()+"' and now has $"+dbsk.getTotalMoneyEarned());
        System.out.println(jack);
        /**
         * paying salary to 'Jack'
         */
        jack.receiveSalary(jack.getSalary());
        System.out.println("DBSK has paid $"+jack.getSalary()+" salary to '"+jack.getName()+"' and now has $"+dbsk.getTotalMoneyEarned());

    }
}





