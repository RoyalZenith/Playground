#include <iostream>
using namespace std;

int main() 
{
   int n;
  cin>>n;
  for(int i=0;i<4;i++)
  {
    for(int j=0;j<=i;j++)
    {
      cout<<n;
      
    }
    cout<<endl;
    n++;
  }
  n=n-1;
  for(int i=4;i>0;i--)
  {
    for(int j=0;j<i;j++)
    {
      cout<<n;
    }
    cout<<endl;
    n--;
  }
    return 0;
}