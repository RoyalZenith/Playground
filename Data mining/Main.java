#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum=0,even,odd;
  cin>>n;
  while(n>0)
  {
    sum=n%10;
    if(sum%2==0)
    {
      even = even+sum;
    }
    else
    {
      odd=odd+sum;
    }
    n=n/10;
  }
  if(even==odd){

cout<<"Yes";
  }
  else
  {cout<<"No";}
}