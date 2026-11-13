class explicit_type_casting
{
    public static void main(String[] args)
    {
        double a = 67598.7867;
        int b = (int) a;        // We must explicitly specify the target data type using parentheses.

        System.out.println(b);


        //////////////////////////////////////////////////////////


        // Lets see what happens when we type cast int into byte
        int c = 258;    
        byte d = (byte) c;          // See here byte range is max 256 but we took 258, so its we get o/p as 2

        System.out.println(d);


        //////////////////////////////////////////////////////////

        float f = 566.76f;
        int e = (int) f;

        System.out.println(e);

        //////////////////////////////////////////////////////////

    }
}