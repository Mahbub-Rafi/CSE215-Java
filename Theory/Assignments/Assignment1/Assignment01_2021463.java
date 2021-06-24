public class Assignment01_2021463 {
    public static void main(String[] args) {

        PrintFunctionValues();
    }


    public static double CalculateFofN(int n) {

        double result, a, b;

        int x= n-1;
        int y= n-2;


        if (n <= 0)
            result = 0;
        else if (n == 1)
            result = 1;
        else if (n == 2)
            result = 3;
        else if (n % 2 == 0)
        {
            a = CalculateFofN(x);
            b = CalculateFofN(y);

            result = Math.sqrt(a)
                    + Math.pow(b, (1.0 / y));
        }
        else
        {
            a = CalculateFofN(x);

            result = Math.pow(a, 1.000001);
        }

        return result;
    }

    public static double CalculateIteration(int n)
    {
        double result, a, b;
        int x , y;

        double[] array = new double[n+3];
        array [0] = 0; array [1] = 1; array [2] = 3;


        if (n <= 0)
            result = array[0];
        else if (n == 1)
            result = array[1];
        else if (n == 2)
             result = array[2];
        else
        {
            for ( int index = 3; index <= n; index++ )
            {
                x = index-1;
                y=index-2;
                a = CalculateIteration(x);
                b = CalculateIteration(y);

                if (index % 2 == 0)
                    array [index] = Math.sqrt(a) + Math.pow(b, (1.0 / y));
                if (index % 2 ==1 )
                    array [index] = Math.pow(a, 1.000001);
            }
            result = array [n];
        }
        return result;
    }

    public static void PrintFunctionValues ()
    {
        System.out.printf("%s %25s %25s\n", "Index |", "Iteration |", "Recursion |");
        System.out.println("-----------------------------------------------------------");

        for (int i=0; i<= 20; i++)
        {
            System.out.printf("%3d | %25.2f | %25.2f\n", i, CalculateIteration(i), CalculateFofN(i));
        }
    }

}
