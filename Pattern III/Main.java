#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int n;
 cin>>n;
  for(int i=1;i<=n;i++)
  {
    
    for(int j=1;j<i;j++)
    {
      cout<<i<<"*";
    }
    cout<<i<<endl;
  }
  for(int i=n;i>0;i--)
  {
    
    for(int j=i-1;j>0;j--)
    {
      cout<<i<<"*";
    }
    cout<<i<<endl;
  }
  
  
    return 0;
}