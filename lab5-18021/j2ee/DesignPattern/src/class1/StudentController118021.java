package class1;

public class StudentController118021 {
    private Student118021 model;
    private StudentView118021 view;

    public StudentController118021(Student118021 model, StudentView118021 view){
        this.model = model;
        this.view = view;
    }
    public void setStudentName(String name){
        model.setName(name);
    }
    public String getStudentName(){
        return model.getName();
    }
    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);
    }
    public String getStudentRollNo(){
        return model.getRollNo();
    }
    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
