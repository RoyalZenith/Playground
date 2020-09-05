#include <iostream>
using namespace std;
int fun(int n)
{
  int a=0,c;
  int b=1;
  for(int i=2;i<n;i++)
  {
    c = a+b;
    a=b;
    b=c;
  }
  return c;
}
int main() 
{
   // Try out your code here
  int n;
  cin>>n;
  cout<<"The term "<<n<<" in the fibonacci series is "<<fun(n);
  return 0;
}