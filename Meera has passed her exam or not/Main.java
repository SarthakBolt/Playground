#include<iostream>
int main()
{
  int n,mr,flag;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    std::cin>>a[i];
  std::cin>>mr;
  for(int i=0;i<n;i++)
  {
    if(a[i]==mr){
      std::cout<<"She passed her exam"; flag=1;}
    
  }
  if(flag==0)
    std::cout<<"She failed";
}