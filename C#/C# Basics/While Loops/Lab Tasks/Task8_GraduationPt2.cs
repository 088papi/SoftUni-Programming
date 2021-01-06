using System;

namespace Task8_GraduationPt2
{
    class Task8_GraduationPt2
    {
        static void Main(string[] args)
        {
            double totalGrade = 0;
            string name = Console.ReadLine();
            int counter = 0;
            while (counter <= 12)
            {

                double currentGrade = double.Parse(Console.ReadLine());

                if(currentGrade <= 4.00)
                {
                    Console.WriteLine($"{name} has been excluded at {counter} grade");
                    return;
                }
                else
                {
                    totalGrade += currentGrade;
                }
                


                counter++;
            }
            Console.WriteLine("{0} graduated. Average grade: {1:F2}", name, totalGrade/ 12 );
        }
    }
}
