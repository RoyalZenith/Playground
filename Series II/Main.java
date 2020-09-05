#include <iostream>
using namespace std;

int main() 
{
    int n,res=121,m=104;
  	cin>>n;
  	for(int i=0;i<n;i++)
    {
      cout<<res<<" ";
      res = res + m;
      m= m+32;
    }
    return 0;
}