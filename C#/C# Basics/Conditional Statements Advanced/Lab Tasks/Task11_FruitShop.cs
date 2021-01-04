using System;

namespace Task11_FruitShop
{
    class Task11_FruitShop
    {
        static void Main(string[] args)
        {
            String fruit = Console.ReadLine();
            String weekDay = Console.ReadLine();
            double quantity = double.Parse(Console.ReadLine());
            double totalPrice = 0;

            if (fruit.Equals("banana"))
            {
                switch (weekDay)
                {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        totalPrice = quantity * 2.50;
                        Console.WriteLine("{0:F2}", totalPrice);
                        break;
                    case "Saturday":
                    case "Sunday":
                        totalPrice = quantity * 2.70;
                        Console.WriteLine("{0:F2}", totalPrice);
                        break;
                    default: Console.WriteLine("error");
                        break;
                }
            }
            else if (fruit.Equals("apple"))
            {
                switch (weekDay)
                {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        totalPrice = quantity * 1.20;
                        Console.WriteLine("{0:F2}", totalPrice);
                        break;
                    case "Saturday":
                    case "Sunday":
                        totalPrice = quantity * 1.25;
                        Console.WriteLine("{0:F2}", totalPrice);
                        break;
                    default: Console.WriteLine("error");
                        break;
                }
            }
            else if (fruit.Equals("orange"))
            {
                switch (weekDay)
                {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        totalPrice = quantity * 0.85;
                        Console.WriteLine("{0:F2}", totalPrice);
                        break;
                    case "Saturday":
                    case "Sunday":
                        totalPrice = quantity * 0.90;
                        Console.WriteLine("{0:F2}", totalPrice);
                        break;
                    default: Console.WriteLine("error");
                        break;
                }
            }
            else if (fruit.Equals("grapefruit"))
            {
                switch (weekDay)
                {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        totalPrice = quantity * 1.45;
                        Console.WriteLine("{0:F2}", totalPrice);
                        break;
                    case "Saturday":
                    case "Sunday":
                        totalPrice = quantity * 1.60;
                        Console.WriteLine("{0:F2}", totalPrice);
                        break;
                    default: Console.WriteLine("error");
                        break;
                }
            }
            else if (fruit.Equals("kiwi"))
            {
                switch (weekDay)
                {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        totalPrice = quantity * 2.70;
                        Console.WriteLine("{0:F2}", totalPrice);
                        break;
                    case "Saturday":
                    case "Sunday":
                        totalPrice = quantity * 3.00;
                        Console.WriteLine("{0:F2}", totalPrice);
                        break;
                    default: Console.WriteLine("error");
                        break;
                }
            }
            else if (fruit.Equals("pineapple"))
            {
                switch (weekDay)
                {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        totalPrice = quantity * 5.50;
                        Console.WriteLine("{0:F2}", totalPrice);
                        break;
                    case "Saturday":
                    case "Sunday":
                        totalPrice = quantity * 5.60;
                        Console.WriteLine("{0:F2}", totalPrice);
                        break;
                    default: Console.WriteLine("error");
                        break;
                }
            }
            else if (fruit.Equals("grapes"))
            {
                switch (weekDay)
                {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        totalPrice = quantity * 3.85;
                        Console.WriteLine("{0:F2}", totalPrice);
                        break;
                    case "Saturday":
                    case "Sunday":
                        totalPrice = quantity * 4.20;
                        Console.WriteLine("{0:F2}", totalPrice);
                        break;
                    default: Console.WriteLine("error");
                        break;
                }

            }
            else
            {
                Console.WriteLine("error");
            }
        }
    }
}
