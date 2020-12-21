using System;

namespace Task4_VacationBookList
{
    class Task4_VacationBookList
    {
        static void Main(string[] args)
        {
            int pageNumber = int.Parse(Console.ReadLine());
            double pagesPerHour = double.Parse(Console.ReadLine());
            int days = int.Parse(Console.ReadLine());

            double hoursPerBook = pageNumber / pagesPerHour;

            double hoursPerDay = hoursPerBook / days;
            Console.WriteLine(hoursPerDay);
        }
    }
}
