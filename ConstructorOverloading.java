class Student{
    int rollno;
    String name;
    String department;
    Student(){           //no args constructor
        this.department="CSE";
    }
    Student(int rollno,String name,String department){
        this.rollno=rollno;
        this.name=name;
        this.department=department;
    }
    Student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
        this.department="CSE";
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Student student1=new Student();//calls constuctor with no args
        System.out.println("Student 1 details:");//cannot get value from user since no args is passed
        System.out.println("Department:"+student1.department);
        System.out.println();
        Student student2=new Student(47,"Neha");//calls constuctor with 2 args
        System.out.println("Student 2 details:");        //can get 2 details(name and roll no) from user but not the department
        System.out.println("Name:"+student2.name);
        System.out.println("roll number:"+student2.rollno);
        System.out.println("Department:"+student2.department);
        System.out.println();
         Student student3=new Student(47,"Neha","CY");//calls constuctor with 3 args
        System.out.println("Student 3 details:");           //can get all 3 values from user and can be passed to constructor
        System.out.println("Name:"+student3.name);
        System.out.println("roll number:"+student3.rollno);
        System.out.println("Department:"+student3.department);
    }
}
