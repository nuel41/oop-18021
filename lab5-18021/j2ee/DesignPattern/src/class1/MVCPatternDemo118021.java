package class1;

public class MVCPatternDemo118021 {
    public static void main(String [] args){
        Student118021 model = retriveStudentFromDatabase();
        StudentView118021 view = new StudentView118021();
        StudentController118021 controller = new StudentController118021(model, view);
        controller.updateView();
        controller.setStudentName("Theii");
        controller.updateView();
    }
    private static Student118021 retriveStudentFromDatabase(){
        Student118021 student = new Student118021();
        student.setName("Julia");
        student.setRollNo("4");
        return student;
    }
}
