using System;

namespace Task11_RefactorVolumeOfPyramid
{
    class Program
    {
        static void Main(string[] args)
        {
           
          
            double length = double.Parse(Console.ReadLine());
            
            double width = double.Parse(Console.ReadLine());
            
            double height = double.Parse(Console.ReadLine());
            Console.Write("Heigth: ");
            Console.Write("Length: ");
            Console.Write("Width: ");
       

            double V = (length + width + height) / 3;
            
            Console.Write($"Pyramid Volume: {V:f2}");

        }
    }
}
