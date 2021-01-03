using System;

namespace Task1_EncryptSortAndPrintArray
{
    class Task1_EncryptSortAndPrintArray
    {
        static void Main(string[] args)
        {
            int lines = int.Parse(Console.ReadLine());

            int[] allSums = new int[lines];

            for (int i = 0; i < lines; i++)
            {
                string name = Console.ReadLine();
                int sum = 0;
                
                for (int j = 0; j <= name.Length-1; j++)
                {
                   

                    char character = name[j];
                    switch(character)
                    {
                        case 'a': 
                        case 'u':  
                        case 'e':       
                        case 'o':  
                        case 'i':

                            sum = sum + ((int)(character) * name.Length);
                            break;
                         
                        default:
                            sum = sum + ((int)(character) / name.Length);
                            break;
                    }

                    allSums[i] = sum;
                }
            }
            Array.Sort(allSums);

            Console.WriteLine(String.Join("\n", allSums));
        }
    }
}
