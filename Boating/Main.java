#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a;
  cin>>b;
  cin>>c;
  int f = b*75 + c*30;
  if(f<=a)
  {
    cout<<"Boat is stable";
  }
  else
  {
    cout<<"Boat will drow";
  }
  return 0;
}