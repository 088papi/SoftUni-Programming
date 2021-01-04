using System;

namespace Task8_Scholarship
{
    class Task8_Scholarship
    {
        static void Main(string[] args)
        {
            double income = double.Parse(Console.ReadLine());
            double avGrade = double.Parse(Console.ReadLine());
            double salary = double.Parse(Console.ReadLine());

            double socialScholarship = 0.0;
            double gradeScholarship = 0.0;

            if (income <= salary && avGrade >= 4.5)
            {
                socialScholarship = Math.Floor(0.35 * salary);
            }
            else if (avGrade >= 5.50)
            {
                gradeScholarship = Math.Floor(avGrade * 25);
            }


            if (socialScholarship > gradeScholarship)
            {
                Console.WriteLine($"You get a Social scholarship {socialScholarship} BGN");
            }
            else if (socialScholarship < gradeScholarship)
            {
                Console.WriteLine($"You get a scholarship for excellent results {gradeScholarship} BGN");
            }
            else
            {
                Console.WriteLine("You cannot get a scholarship!");

            }
        }
    }
}
