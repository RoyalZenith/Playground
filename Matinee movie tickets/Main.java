#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int age;
  float time;
  cin>>age>>time;
  if(age>13)
  {
    if(time==float(10.15))
    {
      cout<<"$8.00";
    }
    else
    {
      cout<<"$5.00";
    }
  }
  else if(time==float(10.15))
    {
      cout<<"$4.00";
    }
  else
    {
      cout<<"$2.00";
    } 
  
  
}