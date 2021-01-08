using System;

namespace Task4_TrainTheTrainers
{
    class Task4_TrainTheTrainers
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            double allScores = 0;
            int countPresentations = 0;
            string presentation = Console.ReadLine();

            while(!presentation.Equals("Finish"))
            {
                double sumScores = 0;
                countPresentations++;


                for (int i = 0; i < n; i++)
                {

                    double currentScore = double.Parse(Console.ReadLine());
                    sumScores += currentScore;

                }

                double avScore = sumScores / n;
                Console.WriteLine("{0} - {1:F2}.", presentation, avScore);

                allScores += avScore;

                presentation = Console.ReadLine();
            }

            Console.WriteLine("Student's final assessment is {0:F2}.", allScores/countPresentations);
            
        }
    }
}
