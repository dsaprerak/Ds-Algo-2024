//Problem 3
#include<iostream>
#include<algorithm>
using namespace std;
void Odd(int a[],int n){
	int num[101]={0};
	for(int i=0;i<n;i++){
		num[a[i]]++;
	}
	for(int i=0;i<=100;i++){
		if(num[i]%2!=0){
			cout<<i<<" ";
		}
	}
}