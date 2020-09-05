#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,f,l,s;
  std::cin>>a;
  l = a%10;
  if(a<999)
  {
    f = 0;
  }
  else{
  	f = a/1000;
  }
  s = f+l;
  std::cout<<s;
}