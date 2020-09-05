#include <iostream>
using namespace std;
void fun(int m, int n, int req)
{
  int req1 = m*n*req;
  if(req1<=50)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}
int main() 
{
   // Try out your code here
  int m,n,req;
  cin>>m>>n>>req;
  fun(m,n,req);
  return 0;
}