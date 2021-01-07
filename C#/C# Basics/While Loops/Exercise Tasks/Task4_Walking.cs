using System;

namespace Task4_Walking
{
    class Task4_Walking
    {
        static void Main(string[] args)
        {
        
            int allSteps = 0;

            while(allSteps <= 10000)
            {
                string input = Console.ReadLine();
              
                if(input.Equals("Going home"))
                {
                   int steps = int.Parse(Console.ReadLine());
                    allSteps += steps;

                    break;
                  
                }
                
                    allSteps += int.Parse(input);
                
                

            }

            if(allSteps >= 10000)
            {
                Console.WriteLine("Goal reached! Good job!");
                Console.WriteLine("{0} steps over the goal!", (allSteps - 10000));
            }
            else
            {
                Console.WriteLine("{0} more steps to reach goal.", (10000-allSteps));
            }
          
        }
    }
}
