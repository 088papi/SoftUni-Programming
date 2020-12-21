using System;

namespace Task6_CharityCampaign
{
    class Task6_CharityCampaign
    {
        static void Main(string[] args)
        {

            int days = int.Parse(Console.ReadLine());
            int confectioners = int.Parse(Console.ReadLine());

            int cakes = int.Parse(Console.ReadLine());
            int waffles = int.Parse(Console.ReadLine());
            int pancakes = int.Parse(Console.ReadLine());


            double totalCakePrice = cakes * 45;
            double totalWafflePrice = waffles * 5.80;
            double totalPancakePRice = pancakes * 3.20;

            double totalPerConfectioner = (totalCakePrice + totalPancakePRice + totalWafflePrice) * confectioners;
            double totalPrice = 23 * totalPerConfectioner;
            double total = totalPrice - (0.125 * totalPrice);
            Console.WriteLine(total);

        }
    }
}
