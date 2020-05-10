#include<iostream>
using namespace std;
int main()
{
  int boat,a,c;
  cin>>boat>>a>>c;
  if(boat>=((a*75)+(c*30)))
  {
    cout<<"Boat is stable";
  }
  else
  {
    cout<<"Boat will drow";
  }
}