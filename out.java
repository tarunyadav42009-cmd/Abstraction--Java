public class out extends demoabstract {
    public void pest(){
        System.out.println("this is pest of demoabstract ");
    }
    public void copy(){
        System.out.println("This is copy of demoastract ");
    }

    public static void main(String[] args) {
        out o1= new out();
        o1.copy();


        
        o1.pest();
        o1.test();    
    }
}
