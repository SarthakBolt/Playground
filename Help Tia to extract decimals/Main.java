#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
	string fnum,flt="";
  int p=999;
	getline(cin,fnum);
  for(int i=0;i<fnum.length();i++){
    if(fnum[i]=='.'){
      p=i;
      }
    else{
      if(p<i)
        flt=flt+fnum[i];}
  }
  cout<<"Floating part is : "<<flt;
}