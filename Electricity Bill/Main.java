#include<iostream>
using namespace std;
int main()
{
  int u,t;
  cin>>u;
  if(u<=200)
  {
    t=(u*0.5);
    cout<<"Rs."<<t;
  }
  else if(u>200 && u<=400)
  {
    t=((u*0.65)+100);
    cout<<"Rs."<<t;
  }
  else if(u>400 && u<=600)
  {
    t=((u*0.8)+200);
    cout<<"Rs."<<t;
  }
  else if(u>600)
  {
    t=((u*1.25)+425);
    cout<<"Rs."<<t;
  }
}