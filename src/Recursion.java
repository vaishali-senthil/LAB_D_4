public class Recursion {
   public static void main(String[] args){
   f f1= new f();
   f1.fib();
   }

}

class f{
    int i=10;
   void fib(){
        if(i>0){

            System.out.println("hello"+i);
            i--;
            fib();}
        else{
            System.exit(0);
       }
    }
}

