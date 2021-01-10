// Task5_BirthdayParty.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>

using namespace std; 

int main()
{
    int rent;
    cin >> rent;

    double cakePrice = 0.20 * rent;

    double drinksPrice = cakePrice - (0.45 * cakePrice);
    double animator = 0.33333333 * rent;

    cout << rent + cakePrice + drinksPrice + animator;
}
