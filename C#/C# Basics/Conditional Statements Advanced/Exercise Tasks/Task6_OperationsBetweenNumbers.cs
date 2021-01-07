using System;

namespace Task6_OperationsBetweenNumbers
{
    class Task6_OperationsBetweenNumbers
    {
        static void Main(string[] args)
        {
            int N1 = int.Parse(Console.ReadLine());
            int N2 = int.Parse(Console.ReadLine());
            string inputOperator = Console.ReadLine();
            double result = 0.0;
            switch(inputOperator) 
            {
                case "+":

                    result = N1 + N2;
                    if(result % 2 == 0)
                    {
                        Console.WriteLine($"{N1} {inputOperator} {N2} = {result} - even");
                    }
                    else
                    {
                        Console.WriteLine($"{N1} {inputOperator} {N2} = {result} - odd");
                    }
                    
                    break;
                case "-":
                    result = N1 - N2;
                    if (result % 2 == 0)
                    {
                        Console.WriteLine($"{N1} {inputOperator} {N2} = {result} - even");
                    }
                    else
                    {
                        Console.WriteLine($"{N1} {inputOperator} {N2} = {result} - odd");
                    }
                    break;
                case "*":
                    result = N1 * N2;
                    if (result % 2 == 0)
                    {
                        Console.WriteLine($"{N1} {inputOperator} {N2} = {result} - even");
                    }
                    else
                    {
                        Console.WriteLine($"{N1} {inputOperator} {N2} = {result} - odd");
                    }
                    break;
                case "/":

                    if(N2 == 0)
                    {
                        Console.WriteLine($"Cannot divide {N1} by zero");
                    }
                    else
                    {
                        result = N1 * 1.00 / N2;
                        Console.WriteLine("{0} {1} {2} = {3:F2}", N1,inputOperator, N2,result);
                    }
                    break;
                case "%":
                    if (N2 == 0)
                    {
                        Console.WriteLine($"Cannot divide {N1} by zero");
                    }
                    else
                    {
                        result = N1 % N2;
                        Console.WriteLine($"{N1} % {N2} = {result}");
                    }
                    break;
               

            }

        }
    }
}
