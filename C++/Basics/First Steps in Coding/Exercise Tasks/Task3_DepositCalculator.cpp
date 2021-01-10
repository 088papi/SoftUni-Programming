// Task3_DepositCalculator.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>


using namespace std;

int main()
{
    double deposit;
    cin >> deposit;

    int months;
    cin >> months;

    double percent;
    cin >> percent;


    double interest = percent * deposit;
    double monthlyInterest = interest / 12;

    double sum = deposit + (3 * ((deposit * percent) / 100) / 12); 

    cout.setf(ios::fixed);
    cout.precision(2);
    cout << sum; 
    return 0;


  
}
