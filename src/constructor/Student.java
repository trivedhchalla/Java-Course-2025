public class Student{
    // diff type of access modifier to restrict the object creation of a class

    // constructor overloading
    String name;
    int id;
    String dept;
    public Student(){
        System.out.println("This is zero argument")
    }
    public Student(String name){
        this.name = name;
    }
    public Student(String name,int id){
        this.name = name;
        this.id = id;
    }
    public Student(String name,int id,String dept){
        this.name = name;
        this.id = id;
        this.dept = dept;
    }

    public String getname(){
        return ("Name: " + this.name);
    }
    public String getId(){
        return ("Id: " + this.id);
    }
    public String getDept(){
        return ("Department: " + this.dept);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Trivedh");
        Student s3 = new Student("xyz",290);
        Student s4 = new ("anything",210,"CSE");
        System.out.println(s1);
    }









}