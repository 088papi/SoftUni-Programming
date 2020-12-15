using System;
//100/100
namespace Task3_Vacation
{
    class Task3_Vacation
    {
        static void Main(string[] args)
        {
            
                decimal studentNumber = decimal.Parse(Console.ReadLine());
                string typeTicket = Console.ReadLine();
                string dayOfWeek = Console.ReadLine();

                decimal price = 0.0m;
                decimal totalPrice = 0.0m;

                switch (dayOfWeek)
                {
                    case "Friday":
                        switch (typeTicket)
                        {
                            case "Students":
                                price = 8.45m;
                                break;
                            case "Business":
                                price = 10.90m;
                                break;
                            case "Regular":
                                price = 15.0m;
                                break;
                            default:
                                break;
                        }
                        break;
                    case "Saturday":
                        switch (typeTicket)
                        {
                            case "Students":
                                price = 9.80m;
                                break;
                            case "Business":
                                price = 15.60m;
                                break;
                            case "Regular":
                                price = 20.0m;
                                break;
                            default:
                                break;
                        }
                        break;
                    case "Sunday":
                        switch (typeTicket)
                        {
                            case "Students":
                                price = 10.46m;
                                break;
                            case "Business":
                                price = 16.0m;
                                break;
                            case "Regular":
                                price = 22.50m;
                                break;
                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }

                totalPrice = price * studentNumber;

                if (studentNumber >= 30.0m && typeTicket == "Students")
                {
                    totalPrice = totalPrice - (totalPrice * 0.15m);
                }
                if (studentNumber >= 100.0m && typeTicket == "Business")
                {
                    totalPrice = totalPrice - (price * 10.0m);
                }
                if (studentNumber >= 10.0m && studentNumber <= 20.0m && typeTicket == "Regular")
                {
                    totalPrice -= totalPrice * 0.05m;
                }

                Console.WriteLine($"Total price: {totalPrice:f2}");
            }
        }
}
