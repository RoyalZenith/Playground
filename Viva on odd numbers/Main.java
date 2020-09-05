#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  float b=0.0;
  for(int i=0;i<3;)
  {
    cin>>n;
   if(n<0)
   {
     b--;
     break;
   }
    else if(n%2==0)
    {
      b=b-0.5;
    }
    else
    {
      b++;
      i++;
    }
  }
  cout<<b<<endl;
}