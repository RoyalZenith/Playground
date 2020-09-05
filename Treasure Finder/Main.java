#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,s,t;
  cin>>a>>b>>c;
  if(a>b&&a>c)
  {
    if(b>c){
    s=b;
    }
    else
    {
      s=c;
    }
  }
  else if(b>a&&b>c)
  {
    if(a>c){
    s=a;
    }
    else
    {
      s=c;
    }
  }
  else if (a>=b)
  {
    s=a;
  }
  else{
  s=b;
  }
  cout<<"The treasure is in box which has number "<<s<<endl;
  for(int i=1;i<=100;i++)
  {
     if(a%i==0 && b%i==0 && c%i==0)
     {
       t=i;
     }
  }
	cout<<"The code to open the box is "<<t;
  
  
}