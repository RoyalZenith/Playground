#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  	int a,n;
  	cin>>a;
  	while(a>0)
    {
      n= a%10;
      a=a/10;
      cout<<n;
    }
   
    return 0;
}