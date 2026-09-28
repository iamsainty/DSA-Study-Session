// import java.util.function.DoubleBinaryOperator;

public class ExceptionHandling {

    public static void methodA(){
        methodB();
    }
    public static void methodB(){
        methodC();
    }
    public static void methodC(){
        methodD();
    }
    public static void methodD(){
        methodE();
    }
    public static void methodE(){
        try{
            int a = 10;
            int b = 0;

            int c = a / b;

            System.out.println(c);
        }
        catch(ArithmeticException ex){
            System.out.println(ex.getStackTrace());
        }
        finally{

        }
    }
    public static void main(String[] args) {
        // try{
        //     setLoading = true;
        //     int a = 10;
        //     int b = 0;
    
        //     int c = a / b;

        //     System.out.println("123");


            // return userExist = true, data = userData

            // userData = db.users(username = req.body.username);
            // userData = null;

            // if(userData == null) return;



            // userId = userData.userId;  NULLPOINTEREXCEPTION

            // user gives username, fetch user data, use that userId to perform some activity

        // application
        // code issue
        // edge case
        // network
        // database



        // }
        // catch(Exception e){
            // storeException(e);

        //     System.out.println(e.getMessage());

        //     // return message = "user not exist"

        //     // return userExist = false, data = null
        // }
        // finally{
        //     setLoading = false;
        // }

        // try{

        // }

        // catch(NullPointerException ex){
        //     // Log.Warn("username do not exist");
        // }
        // catch(Exception e){
        //     // Log.Error(e.getMessage());
        // }
        // finally{

        // }

        methodA();





        System.out.println("Hello");
    }
}


