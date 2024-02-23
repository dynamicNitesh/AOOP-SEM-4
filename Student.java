class student2{
public static void main(String args[]){
Student s1=new Student(24,"NITESH NADAR");
Student s2=new Student(04,"ROHAN CHAUNDHARY");
s1.display();
s2.display();
}
}
class Student{
int enroll_no;
String student_name;
Student(int enroll_no,String student_name){
this.enroll_no=enroll_no;
this.student_name= student_name;

}
void display(){System.out.println(enroll_no+" "+student_name+" ");  
}  
}

