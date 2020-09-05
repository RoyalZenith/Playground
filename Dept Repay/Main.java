#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,r,y;
  float z=0.02;
  std::cin>>x;
  std::cin>>r;
  std::cin>>y;
  int x1 = (x*r*y)/100;
  std::cout<<x1<<"\n";
  std::cout<<x+x1<<"\n";
  std::cout<<x1*z<<"\n";
  std::cout<<x+x1-(x1*z)<<"\n";
}