//Problem 2
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int KLargest(vector<int>&num,int k){
	sort(num.begin(),num.end(),greater<int>());
	return num[k-1];
}