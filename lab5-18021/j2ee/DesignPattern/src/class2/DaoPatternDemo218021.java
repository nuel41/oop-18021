package class2;

public class DaoPatternDemo218021 {
    public static void main (String[] args){
        StudentDao218021 studentDao = new StudentDaoImpl218021();
        for (Student218021 student : studentDao.getAllStudents()){
            System.out.println("Student: [RollNo : "+ student.getRollNo()+ ", Name : "+ student.getName()+ " ]");
        }
        Student218021 student = studentDao.getAllStudents().get(0);
        student.setName("Ima");
        studentDao.updateStudent(student);
        studentDao.getStudent(0);
        System.out.println("Student: RollNo : " + student.getRollNo()+ ", Name : "+ student.getName()+ " ]");
    }
}
