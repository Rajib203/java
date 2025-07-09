class InvalidAgeException extends Exception{
    InvalidAgeException(String msg)
    {
        System.out.println(msg);
    }
}
class ABC{
public static void vote(int age) throws InvalidAgeException
    {
        if(age<18)
        {
            throw new InvalidAgeException("cannot vote now");
        }
        else
        {
            System.out.println("Eligible for voting");
        }
    }
}


public class user_defined_exception {
   
    public static void main(String[] args) {
        try{
            ABC.vote(13);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
    