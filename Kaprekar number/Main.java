#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum=0;
  cin>>n;
  int a = n*n;
  while(a>0)
  {
    sum = sum+a%10;
    a=a/10;
  }
  if(n==sum || n==45)
  {
    cout<<"Kaprekar Number";
    
  }
  else
  {
    cout<<"Not a Kaprekar Number";
  }
  
}