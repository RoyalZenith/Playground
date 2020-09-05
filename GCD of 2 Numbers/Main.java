#include<iostream>
using namespace std;
int fun(int small, int n1, int n2)
{
  if(n1%small==0 && n2%small==0)
  {
    return small;
  }
  small--;
  fun(small,n1,n2);
}
int main()
{
  //Type your code here.
  int n1,n2;
  cin>>n1>>n2;
  int small;
  if(n1>n2)
  {
    small=n2;
  }
  else
  {
    small=n1;
  }
  cout<<"G.C.D of "<<n1<<" and "<<n2<<" = "<<fun(small,n1,n2);
}