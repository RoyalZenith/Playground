#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int n,i;
  cin>>n;
  
  if(n==0)
  {
    n=1;
    }
  
 while(n>0)
 {
    n=n/10;
  i++;
 }
  
cout<<i;
    return 0;
}