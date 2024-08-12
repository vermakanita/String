import java.util.Scanner;

public class _15Methodes {
    public static int add(int x, int y){
        System.out.println(x+y);
        return (x+y);
    }
    public static int sub(int x, int y){
        System.out.println(x-y);
        return (x-y);

}
public static int mul(int x, int y){
    System.out.println(x*y);
    return (x*y);
}
    public static int div(int x, int y){
        System.out.println(x/y);
        return (x/y);
    }
        public static int mod(int x, int y){
            System.out.println(x%y);
            return (x%y);
        }


        public static void main(String []args){
           // _15Methodes dm = new _15Methodes();
            Scanner sc = new Scanner( System.in);
            System.out.println("enter x");
            int x = sc.nextInt();
            System.out.println("enter y");
            int y = sc.nextInt();
            add(x,y);
            // dm.add(x,y);
            // dm.sub(x,y);
            // dm.mul(x,y);
            // dm.div(x,y);
            // dm.mod(x,y);

        }





           public static int even(int x){
            return x;
           }
            
         public static void main(){
            _15Methodes dm = new _15Methodes();
            Scanner sc = new Scanner( System.in);
            System.out.println("enter the number");
            int x= sc.nextInt();
            if(x%2==0){
                System.out.println("num is evev"+x);
            }
                else{
                     
                    System.out.println("nu is odd"+x);
                    
                }
                System.out.println(even(x));
                
                 
            }
         
           }
        
    

