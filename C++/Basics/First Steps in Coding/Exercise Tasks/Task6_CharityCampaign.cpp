// Task6_CharityCampaign.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>

using namespace std; 

int main()
{
    

    int days;
    cin >> days;

    int peopleNum;
    cin >> peopleNum;

    int cakeNum;
    cin >> cakeNum;

    double cakePrice = cakeNum * 45;

    int waffleNum;
    cin >> waffleNum;

    double wafflePrice = waffleNum * 5.80;

    int pancakesNum;
    cin >> pancakesNum;

    double pancakesPrice = pancakesNum * 3.20;

    double all = days * (peopleNum * (cakePrice + wafflePrice + pancakesPrice));
    double final = all - (0.125 * all);

    cout.setf(ios::fixed);
    cout.precision(2);
    cout << final;



    return 0;
}
