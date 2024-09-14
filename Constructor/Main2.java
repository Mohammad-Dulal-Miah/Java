class Test2{
    String name;

    Test2(String string){
        this.name = string;
    }

   

    Test2(Test2 t) {
        this.name = t.name;
    }
}




public class Main2 {
    public static void main(String[] args) {
        
        Test2 t = new Test2("Dulal");
        Test2 t1 = new Test2(t);

        System.out.println(t1.name);
    }
}
