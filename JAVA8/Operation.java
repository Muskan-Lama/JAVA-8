@FunctionalInterface
interface Java
{
   void operation(int a,int b);
}
class Operation {
    void add(int a, int b) {
        System.out.println("The addition result " + (a+b));
    }


    void sub(int a, int b) {
        System.out.println("The subtraction result " + (a-b));

    }
    static void mult(int a,int b)
    {
        System.out.println("The multiplication result " + (a*b));

    }

}
class S
{
    public static void main(String[] args) {
        {

           Java op = Operation::mult;
            op.operation(3,4);

            Java op1 = new Operation()::add;
            op1.operation(3,5);

            Java op2= new Operation()::sub;
            op2.operation(3,5);



        }


    }




}
