@FunctionalInterface
interface Great
{
    boolean greater(int a,int b);
}
@FunctionalInterface
interface Inc
{
   int increment(int a);
}
@FunctionalInterface
interface Con
{
     String concat(String a,String b);
}
@FunctionalInterface
interface Upper
{
    String upper(String a);
}

class All
{

    public static void main(String[] args) {

       //First number is greater than second number or not Parameter (int ,int ) Return boolean
       Great great =(int a, int b)-> {
           if(a>b)
               return true;
          else
              return false;
        };


       //Increment the number by 1 and return incremented value Parameter (int) Return int
       Inc inc=(int a)->
       {
           a=a+1;
           return a;
        };

       // Concatination of 2 string Parameter (String , String ) Return (String)
        Con c=(String a ,String b)->
        {
             return (a+""+b);
        };

        //Convert a string to uppercase and return . Parameter (String) Return (String)
        Upper up=(String a)->
        {
            return a.toUpperCase();
        };
        //calling

        System.out.println("Greater number is :"+ great.greater(23,66));
        System.out.println("Increment by 1 :" + inc.increment(2));
        System.out.println("Concat strings :" + c.concat("Muskan","Lama"));
        System.out.println("Uppercase "+  up.upper("lama"));






    }





}