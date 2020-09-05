#include <iostream>
using namespace std;

int main() 
{
   int n,res=6;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    cout<<res<<" ";
    res=res+5*i;
    
  }
    return 0;
}