class A{
    void m1(){
        System.out.println("I");
    }
}
class B extends A{
    void m1(){
        System.out.println("Welcome");
        super.m1();
    }
    
}
class Super{
    public static void main(String[]args){
        B com =new  B();
        com.m1();
    }
}