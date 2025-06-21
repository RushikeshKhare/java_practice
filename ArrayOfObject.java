class Student {
  int rollNo;
  String name;
  int marks;
}

public class ArrayOfObject {
  public static void main(String Arg[]) {

    Student s1 = new Student();

    s1.rollNo = 1;
    s1.name = "Rushi";
    s1.marks = 90;

    Student s2 = new Student();

    s2.rollNo = 2;
    s2.name = "khushi";
    s2.marks = 80;

    Student s3 = new Student();

    s3.rollNo = 3;
    s3.name = "hara";
    s3.marks = 10;

    Student students[] = new Student[3];

    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    for (int i = 0; i < students.length; i++) {
      System.out.println(students[i].name + " :" + students[i].marks);
    }
  }
}
