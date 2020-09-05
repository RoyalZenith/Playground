#include <iostream>
using namespace std;
int fun(int n)
{
  if(n==0||n==1)
    return 1;
  else
    return n*fun(n-1);
}
int main() 
{
   // Try out your code here
  int n;
  cin>>n;
  cout<<"The factorial of "<< n <<" is "<< fun(n);
  return 0;
}