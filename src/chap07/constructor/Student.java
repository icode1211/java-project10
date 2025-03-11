package chap07.constructor;

public class Student extends Person {
    private int studentNo;

    public Student(String name, String ssn, int studentNo) {
        super(name, ssn);           // 부모 생성자 호출
        this.studentNo = studentNo;
    }

    public int getStudentNo() {
        return studentNo;
    }
}
