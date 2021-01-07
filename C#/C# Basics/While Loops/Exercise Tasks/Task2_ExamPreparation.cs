using System;

namespace Task2_ExamPreparation
{
    class Task2_ExamPreparation
    {
        static void Main(string[] args)
        {
            int maxPoorGradeCounter = int.Parse(Console.ReadLine());
            int poorGradeCounter = 0;
            int taskCounter = 0;
            double totalScore = 0;

            string lastProblem = "";
            string task = "";

            while (true)
            {
                lastProblem = task;
                 task = Console.ReadLine();
                if(task.Equals("Enough"))
                {
                    break;
                }
                taskCounter++;

                int grade = int.Parse(Console.ReadLine());
                totalScore += grade;
                if (grade <= 4)
                {
                    poorGradeCounter++;
                }

                if(poorGradeCounter == maxPoorGradeCounter)
                {
                    Console.WriteLine("You need a break, {0} poor grades.", maxPoorGradeCounter);
                    return;
                }

            }


            Console.WriteLine("Average score: {0:F2}", totalScore/taskCounter);
            Console.WriteLine("Number of problems: {0}", taskCounter);
            Console.WriteLine("Last problem: {0}",lastProblem );
           

        }
    }
}
