class Logical
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 12;

        int x = 15;
        int y = 16;

        boolean result1 = a<b && x>y;
        System.out.println(result1);


        boolean result2 = a<b || x>y;
        System.out.println(result2);


        boolean result3 = a<b && x>y;
        System.out.println(!result3);
    }
}