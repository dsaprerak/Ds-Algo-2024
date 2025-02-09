#include <iostream>
#include <vector>
#include <algorithm>
#include<unordered_map>
using namespace std;
vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
    unordered_map<int,int>count;
    vector<int>result;
    for(int n:nums1){
        count[n]++;
    }
    for(int n:nums2){
        if(count[n]>0){
            result.push_back(n);
            count[n]--;
        }
    }
    return result;
}