#include<iostream>
#include<cmath>
int arm(int n, int digitcount)
{
  int temp2,res=0,sum;//Your code goes here
  temp2=n; 
  while(temp2!=0)
  {
  sum = temp2%10;
  res = res + pow(sum,digitcount);
  temp2=temp2/10;
  }
  if(res==n)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
}
int main()
{
    int n,digitcount;
    std::cin>>n;
    int temp=n;
  	while(temp!=0)
  	{
    	digitcount++;
    	temp=temp/10;
 	}
 	 arm(n,digitcount);
    
}