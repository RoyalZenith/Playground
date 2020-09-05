#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int n;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    if(i%2!=0)
    {
      for(int j=0;j<n-1;j++)
      {
        cout<<i;
      }
      cout<<i+1;
    }
    if(i%2==0)
    {
      cout<<i+1;
      for(int j=0;j<n-1;j++)
      {
        cout<<i;
      }
    }
    cout<<endl;
  }
    
    return 0;
}