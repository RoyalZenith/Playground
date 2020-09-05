#include <iostream>

using namespace std;

int main()

{

int n, i, flag=0,m=0;

cin >> n;

  if(n<2)
  {
    printf("Not eligible");
    m=1;
  }


for(i = 2; i < n; i++)

{

if(n % i == 0)

{

cout<<"Not eligible"<<endl;

flag=1;

break;

}

}

if (flag==0 && m==0)

cout << "Eligible"<<endl;

return 0;

}