public class method_overloading {
    void show(int a,String b){
        System.out.println("1");
    }
    void show(int a){
        System.out.println("2");
    }
    public static void main(String[] args) {
        method_overloading m=new method_overloading();
        m.show(10);
        
        
    }
    
}
