// Task7_FruitMarket.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>

using namespace std; 

int main()
{


    double strawberryPrice;
    cin >> strawberryPrice;

    double bananas;
    cin >> bananas;

    double oranges;
    cin >> oranges;

    double raspberries;
    cin >> raspberries;

    double strawberries; 
    cin >> strawberries;
    double allStrawberries = strawberries * strawberryPrice;

    double allRaspberries = 0.5 * strawberryPrice * raspberries;
    double allOranges = oranges * (0.5 * strawberryPrice - 0.4 * (0.5 * strawberryPrice));
    double allBanans = bananas * (0.5 * strawberryPrice - 0.8 * (0.5 * strawberryPrice));


    cout.setf(ios::fixed);
    cout.precision(2);
    cout << allBanans + allOranges + allRaspberries + allStrawberries;
}
