using System;

namespace Task4_MetricConverter
{
    class Task4_MetricConverter
    {
        static void Main(string[] args)
        {
            double givenNumber = double.Parse(Console.ReadLine());
            string inputMetric = Console.ReadLine();
            string outputMetric = Console.ReadLine();


            if(inputMetric.Equals("mm"))
            {
                givenNumber = givenNumber / 1000;
            }
            else if(inputMetric.Equals("cm"))
            {
                givenNumber = givenNumber / 100;
            }

            if(outputMetric.Equals("mm"))
            {
                givenNumber = givenNumber * 1000;
            } 
            else if(outputMetric.Equals("cm"))
            {
                givenNumber = givenNumber * 100;
            }


            Console.WriteLine("{0:F3}",givenNumber);
        }
    }
}
