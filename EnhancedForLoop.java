// for-each loop : This loop iterates over each element in the array nums, assigning each element to n one by one, and then prints it.

class Student {
  int rollNo;
  String name;
  int marks;
}

public class EnhancedForLoop
{

  public static void main(String Arg[])
  {

    Student s1 = new Student();

    s1.rollNo = 1;
    s1.name = "Rushi";
    s1.marks = 87;

    Student s2 = new Student();

    s2.rollNo = 2;
    s2.name = "khushi";
    s2.marks = 88;

    Student s3 = new Student();

    s3.rollNo = 3;
    s3.name = "Navankur";
    s3.marks = 89;

    Student students[] = new Student[3];

    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    for(Student stud : students)              // for-each loop (Enhanced for Loop)
    {
      System.out.println(stud.name + " : " + stud.marks);
    }

    // int nums[] = new int[4];

    // nums[0] = 4;
    // nums[1] = 8;
    // nums[2] = 3;
    // nums[3] = 9;

    // for(int i = 0; i < nums.length; i++)   //Normal For Loop
    // {
    //   System.out.println(nums[i]);
    // }

    // for(int n : nums)                      // for each loop(enhanced for loop)
    // {
    //   System.out.println(n);
    // }
  }
}