/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: Chad
 *
 * Created on October 10, 2016, 10:17 PM
 */

//#include <cstdlib>
#include <iostream>
#include <fstream>
#include <string>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {

    ifstream readFile("toAddress.txt");
    ofstream outFile("replaced.txt");
    string readout,
            search,
            date,
            name,
            address,
            jobTitle,
            line,
            stringToReplace;
    
    //myFile.open("toAddress.txt");
    
    cout << "Enter the string you'd like to modify ";
    cin >> stringToReplace;
    size_t len = stringToReplace.length();
    if(readFile.is_open())
    {
    while(getline(readFile,line))
    {
        while (true)
        {
            size_t pos = line.find(stringToReplace);
            if (pos != string::npos)
            {
                line.replace(pos, len, stringToReplace);
            }
            else
            {
                break;
            }
            
            outFile << line << '\n';
        }
//        if(readout == search)
//        {
//            cout << "Enter new date";
//            cin >> date;
//            
//        }
    }
    }
//    while (!myFile.eof())
//    {
//        
//    }
   
    readFile.close();
    outFile.close();
    
    return 0;
}

