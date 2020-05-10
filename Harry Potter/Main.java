#include<iostream>
using namespace std;
int main()
{
int n,first,last,sum,len;
cin>>n;
len=sizeof(n);
  if(len==4)
  {
    first=n/1000;
    last=n%10;
    cout<<first+last;
  }
}