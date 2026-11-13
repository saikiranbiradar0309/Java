class If_Else_Ladder
{
    public static void main(String[] args)
    {
        int marks = 93;

        if(marks >= 90)
        {
            System.out.println("Student got Grade A");
        }

        else if(marks >= 80 && marks <= 89)
        {
            System.out.println("Student got Grade B");
        }

        else if(marks >= 70 && marks <= 79)
        {
            System.out.println("Student got Grade C");
        }

        else if(marks >= 60 && marks <= 69)
        {
            System.out.println("Student got Grade D");
        }

        else
        {
            System.out.println("Student has Failed the Exam");
        }

    }
}