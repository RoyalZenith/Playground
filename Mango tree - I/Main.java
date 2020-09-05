#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  cin>>a>>b>>c;
  if(c<=b)
  {
    cout<<"Yes";
  }
  else if(c==2*b||c ==(b+1)||c==2*b+1)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
}