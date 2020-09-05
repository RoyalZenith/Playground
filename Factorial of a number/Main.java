#include<iostream>
using namespace std;

int main(){
  
  // Type your code here
  int n;
  cin>>n;
  int sum=1;
  for(int i=1;i<=n;i++)
  {
    sum = sum*i;
  }
  	cout<<sum;
}