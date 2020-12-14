using System;
//100/100
namespace Task6_ForeignLanguages
{
    class Task6_ForeignLanguages
    {
        static void Main(string[] args)
        {
            string country = Console.ReadLine();

            switch(country)
            {
                case "USA":
                case "England":
                    Console.WriteLine("English");
                        break;
                case "Argentina":
                case "Spain":
                case "Mexico":
                    Console.WriteLine("Spanish");
                        break;
                default:
                    Console.WriteLine("unknown");
                    break;

            }
        }
    }
}
