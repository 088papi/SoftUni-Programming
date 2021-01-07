using System;

namespace Task7_HotelRoom
{
    class Task7_HotelRoom
    {
        static void Main(string[] args)
        {
            string month = Console.ReadLine();
            int days = int.Parse(Console.ReadLine());

            double studioPrice = 0.0;
            double apartmentPrice = 0.0;


            switch(month)
            {
                case "May":
                case "October":


                    studioPrice = days * 50;
                    apartmentPrice = days * 65;

                    if(days > 14 )
                    {
                        studioPrice -= 0.3 * studioPrice;
                        apartmentPrice -= 0.1 * apartmentPrice;
                    }
                    else if (days > 7)
                    {
                        studioPrice -= 0.05 * studioPrice;
                    }
                    break;

                case "June":
                case "September":

                    studioPrice = days * 75.20;
                    apartmentPrice = days * 68.70;

                    if (days > 14)
                    {
                        studioPrice -= 0.2 * studioPrice;
                        apartmentPrice -= 0.1 * apartmentPrice;
                    }
                    break;

                case "July":
                case "August":

                    studioPrice = days * 76;
                    apartmentPrice = days * 77;

                    if (days > 14)
                    {
                   
                        apartmentPrice -= 0.1 * apartmentPrice;
                    }
                    break;
            }


            Console.WriteLine("Apartment: {0:F2} lv.", apartmentPrice);
            Console.WriteLine("Studio: {0:F2} lv.", studioPrice);
        }
    }
}
