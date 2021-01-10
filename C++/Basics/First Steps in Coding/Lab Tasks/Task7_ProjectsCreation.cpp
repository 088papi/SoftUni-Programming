#include <iostream>
using namespace std;

int main() {

	string name;
	cin >> name;

	int projectNumber;
	cin >> projectNumber;

	int result = projectNumber * 3;


	cout << "The architect " << name << " will need " << result << " hours to complete " << projectNumber << " project/s.  ";

	return 0;
}