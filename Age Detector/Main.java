#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int year,cyear,age;
  cin>>year>>cyear;
  if(year>cyear)
  {
    age = 100-year+cyear;
    cout<<age;
  }
  else
  {
    age = cyear-year;
    cout<<age;
  }
  
}