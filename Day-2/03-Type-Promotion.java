class type_promotion
{
    public static void main(String[] args)
    {
        byte a = 20;
        byte b = 30;


        // So technically we are multiplying byte, it should be byte right?
        // The problem is the result will go out of range
        // The value will be promoted into Int
        // This is called Type promotion
        int result = a * b;

        System.out.println(result);

        ///////////////////////////////////////////

        int s1 = 45;
        double s2 = 676.67;

        double result1 = s1 + s2;

        System.out.println(result1);
    }
}