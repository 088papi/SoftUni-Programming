using System;
//100/100
namespace Task9_MultiplicationTable
{
    class Task10_MultiplicationTable
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            for (int i = 1; i <= 10; i++)
            {

             
                Console.WriteLine("{0} X {1} = {2}", n,i, n*i);
                
              
            }

        }
    }
}
