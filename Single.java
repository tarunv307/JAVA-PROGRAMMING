class A{
    void m1(){
        System.out.println("I");
    }
}
class B extends A{
    void m2(){
        System.out.println("Welcome");
    }
}
class Single{
    public static void main(String[]args){
        B com =new  B();
        com.m1();
        com.m2();
    }
}