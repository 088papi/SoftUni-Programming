// Task9_YardGreening.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
using namespace std;


int main()
{
    double sqMeters;
    cin >> sqMeters;


    double discount = 0.18 * (sqMeters * 7.61);
    double finalPrice = sqMeters * 7.61 - discount;
    
    cout.setf(ios::fixed);
    cout.precision(2);
    cout << "The final price is: " << finalPrice << " lv." << endl;
    cout.setf(ios::fixed);
    cout.precision(2);
    cout << "The discount is: " << discount << " lv.";

}

