public class Student {
    String  name;
    int age;
    Student(String n,int a){
        name=n;
        age=a;
    }  
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);

    }
    
    public static void main(System[]args){
        Student s1=new Student("tarun" ,17);
        Student s2= new Student("jerry", 16);
            s1.display();
            s2.display();
        
    }
}
