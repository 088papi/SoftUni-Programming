// Task8_PetShop.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
using namespace std;

int main()
{
    
    int dogFoodNumber;
    cin >> dogFoodNumber;
    double totalDogFood = dogFoodNumber * 2.50;
  

    int otherFood;
    cin >> otherFood;
    double totalOtherFood = otherFood * 4.00;
    
    double  allFood = totalDogFood + totalOtherFood;
   
    cout.setf(ios::fixed);
    cout.precision(2);
    cout << allFood << " lv.";
 

    return 0;
}
