#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  float b;
  cin>>a>>b;
  switch(a)
  {
    case 2:
      cout<<b*1.5<<endl;
      break;
    case 3:
      cout<<b*2<<endl;
      break;
    default:
      cout<<"Number of items is more"<<endl;
      break;
  }
}