using System;

namespace Task3_DepositCalculator
{
    class Task3_DepositCalculator
    {
        static void Main(string[] args)
        {
            double deposit = double.Parse(Console.ReadLine());
            int months = int.Parse(Console.ReadLine());
            double annualPercent = double.Parse(Console.ReadLine());


            double interest = deposit * annualPercent / 100;
            double monthlyInterest = interest / 12;
            double sum = deposit + (months * monthlyInterest);

            Console.WriteLine(sum);
         
        }
    }
}
