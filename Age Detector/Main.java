#include<iostream>
using namespace std;
int main()
{
int a,b,m,n;
cin>>a>>b;
if(a>b)
{  
int x = 1900+a;
int y = 2000+b;
m=y-x;
  cout<<m;
}
else
{
int x = 2000+a;
int y = 2000+b;
n=y-x;
cout<<n;
}
}