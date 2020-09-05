#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum=0;
  cin>>n;
  int a=n;
  while(a>0)
  {
    sum = sum + a%10;
    a=a/10;
  }
  
  if(n%sum==0)
  {
    cout<<"Harshad Number";
  }
  else
  {
   cout<<"Not Harshad Number"; 
  }
}