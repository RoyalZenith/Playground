#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  int doller = a+c;
  int cent = b+d;
  int total =  doller+(0.01*cent);
  cout<<total<<endl;
  cout<<cent%100;
}