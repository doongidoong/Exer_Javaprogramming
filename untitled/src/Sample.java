class Student {

    public int studentID; //학번
    public String studentName; //이름
    public String address; //주소

    public Student(int id, String name) {
        studentID = id;
        studentName = name;
    }

    public Student(int id) {
        studentID = id;
    }
}

public class Sample {
    public static void main(String[] args) {
        Student studentPark = new Student(1234,"피망"); //Park 객체 생성
        Student studentKim = new Student(1235);
        System.out.println(studentPark.studentID + studentPark.studentName );
        System.out.println(studentKim.studentID+ studentKim.studentName);
    }
}