#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x1,x2,y1,y2,x3,y3;
  float z1,z2;
  std::cin>>x1;
  std::cin>>y1;
  std::cin>>x2;
  std::cin>>y2;
  std::cin>>x3;
  std::cin>>y3;
  z1=(float)(x1+x2+x3)/3;
  z2=(float)(y1+y2+y3)/3;
  std::cout<<z1<<"\n";
  std::cout<<z2<<"\n";
}