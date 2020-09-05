#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float mileage, petrol, distance;
  cin>>mileage>>petrol>>distance;
  if(distance<=(mileage*petrol))
  {
    cout<<"Can reach"; 
  }
  else
  {
    cout<<"Cannot reach"; 
  }
}