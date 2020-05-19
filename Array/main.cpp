/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: Chad
 *
 * Created on April 14, 2016, 8:08 PM
 */

#include "ArrayList.h"
#include <iostream>
using namespace std;

int main(int argc,char *argv[])
{
	ArrayList arr;
	
	for (int i=1;i<=50;i++)
	{
		arr.push_back(i);
	}
	
	cout << "Should contain numbers 1..50, is ";
	
	cout << arr.toString() << endl;
	
	for (int i=arr.size()-1;i>=1;i--)
	{
		arr.erase(arr[i]);
	}	
	
	cout << "Should contain only 1, is ";
	cout << arr.toString() << endl;
	
	arr.erase(arr[0]);
	
	for (int i=2;i<=50;i++)
	{
		if (i<=2)
			arr.push_back(i);
		else
		{
			int j=1;
			while ((j<arr.size()) && (i%arr[j]!=0))
				j++;
			
			if (j==arr.size())
			{
				arr.push_back(i);
			}
		}
	}
	
	cout << "Prime numbers between 1 and 50 are: " << arr.toString() << endl;
	
}

