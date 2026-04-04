//
//  10350654.cpp
//  decision control structures
//
//  Created by 10350654 on 4/3/26.
//

#include <iostream>
#include <string>

using namespace std;

int main() {
    string studentName;
    int score;
    char grade;
    string remarks;

    cout << "Enter name of a student: ";
    getline(cin, studentName);

    cout << "Enter score of the student: ";
    cin >> score;

    if (score < 0 || score > 100) {
        cout << "\nThe score is not 0-100\n";
        return 0;
    }

    if (score >= 80) {
        grade = 'A';
        remarks = "Excellent";
    } else if (score >= 70) {
        grade = 'B';
        remarks = "Very Good";
    } else if (score >= 60) {
        grade = 'C';
        remarks = "Good";
    } else if (score >= 50) {
        grade = 'D';
        remarks = "Average";
    } else {
        grade = 'F';
        remarks = "Fail";
    }

    cout << "\nNAME: " << studentName << '\n';
    cout << "GRADE: " << grade << '\n';
    cout << "REMARKS: " << remarks << '\n';

    return 0;
}
