#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int a,b,sum=0;
  cin>>a>>b;
  int c=a+b;
  for(int i=1;i<c;i++)
  {
    if(c%i==0)
    {
      sum = sum+i;
    }
  }

  if(c==sum)
  {
    cout<<"They can read the message";
  }
  else
  {
    cout<<"They can't read the message";
  }
  return 0;
}