package class2;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl218021 implements StudentDao218021 {
    List<Student218021> students;

    public StudentDaoImpl218021(){
        students = new ArrayList<Student218021>();
        Student218021 student1 = new Student218021("Esterina", 0);
        Student218021 student2 = new Student218021("Yulia", 1);
        students.add(student1);
        students.add(student2);
    }
    @Override
    public void deleteStudent(Student218021 student){
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No "+ student.getRollNo() + ", deleted from database");
    }
    @Override
    public List<Student218021> getAllStudents(){
        return students;
    }
    @Override
    public Student218021 getStudent(int rollNo){
        return students.get(rollNo);
    }
    @Override
    public void updateStudent(Student218021 student){
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No "+ student.getRollNo() + ", update in the database");
    }
}
