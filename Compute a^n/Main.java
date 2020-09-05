#include <iostream>
using namespace std;
int fun(int a,int n)
{
  int num=a;
  int res=a;
  for(int i=1;i<n;i++)
  {
    res=res*num;
  }
  return res;
}
int main() 
{
   // Try out your code here
  int a,n;
  cout<<"Enter the value of a"<<endl;
  cin>>a;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  cout<<"The value of "<<a<<" power "<<n<<" is "<<fun(a,n);
  
  return 0;
}