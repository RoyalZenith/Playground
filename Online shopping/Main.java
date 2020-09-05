#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fa,fd,fs,sa,sd,ss,aa,ad,as;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  int fprice= fa +fs - (fd*fa*0.01);
  int sprice =sa +ss - (sd*sa*0.01);
  int aprice =aa +as - (ad*aa*0.01);
  cout<<"In Flipkart Rs."<<fprice<<endl;
  cout<<"In Snapdeal Rs."<<sprice<<endl;
  cout<<"In Amazon Rs."<<aprice<<endl;
  if(fprice<=sprice&&fprice<=aprice)
  {
    cout<<"He will prefer Flipkart";
  }
  else if(sprice<=aprice&&sprice<=fprice )
  {
    cout<<"He will prefer Snapdeal";
  }
  else
  {
    cout<<"He will prefer Amazon";
  }
  return 0;
}