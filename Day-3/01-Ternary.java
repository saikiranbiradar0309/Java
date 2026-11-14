class Ternary
{
    public static void main(String[] args)
    {
        int age = 20;

        String result = (age >= 18)
            ? "Eligible To Vote"
            : "Not Eligible To Vote";
        
        System.out.println(result);




        int number = 5;
        String OddEven = (number%2 == 0)
            ? "Number is Even"
            : "Number is Odd";
        
        System.out.println(OddEven);
    }
}