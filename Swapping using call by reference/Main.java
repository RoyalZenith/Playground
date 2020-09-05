#include <iostream>
using namespace std;
int fun(int& x,int& y)
{
  x = x+y;
  y = x-y;
  x = x-y;
}
int main() 
{
   // Try out your code here
  int x,y;
  cin>>x>>y;
  cout<<"Before swapping a= "<< x <<" and b="<<y<<endl;
  fun(x,y);
  cout<<"After swapping a= "<< x <<" and b="<<y;
  return 0;
}