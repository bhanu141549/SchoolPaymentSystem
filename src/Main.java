import java.util.*;

public class Main {
    public static void main(String[] args) {
        Teacher bhanu = new Teacher(1, "Bhanuprasad", 5000);
        Teacher naveen = new Teacher(2, "NaveenKumar", 5500);
        Teacher bala = new Teacher(3, "BalaChandra", 6000);

        List<Teacher> teachersList = new ArrayList<>();
        teachersList.add(bhanu);
        teachersList.add(naveen);
        teachersList.add(bala);

        Student prasad = new Student(1, "prasad", 3);
        Student hari = new Student(2, "HariKumar", 2);
        Student venkat = new Student(2, "Venkateswarulu", 1);
        
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(prasad);
        studentsList.add(venkat);
        studentsList.add(hari);

        School rgukt = new School(teachersList, studentsList);
        //Students paid details
        prasad.paysFees(60000);
        hari.paysFees(50000);
        venkat.paysFees(45000);

        //new teacher joined to the school
        Teacher mina = new Teacher(5, "Mina", 9000);
        rgukt.addTeacher(mina); //School name is 'rgukt' here

        System.out.println("School has earned Rs: "+rgukt.gettotalMoneyEarned());

        System.out.println("------------School's Pay Salary-----------");
        bhanu.recieveSalary(bhanu.getSalary());
        System.out.println("rgukt spent first salary  to "+bhanu.getName() + " and how has Rs: "+ rgukt.gettotalMoneyEarned());
        naveen.recieveSalary(naveen.getSalary());
        System.out.println("rgukt spent first salary  to "+naveen.getName() + " and how has Rs: "+ rgukt.gettotalMoneyEarned());
        bala.recieveSalary(bala.getSalary());
        System.out.println("rgukt spent first salary  to "+bala.getName() + " and how has Rs: "+ rgukt.gettotalMoneyEarned());

        //Testing Students
        System.out.println(prasad);
        System.out.println(venkat);

        //Testing Teachers
        System.out.println(bhanu);
    }
}
