// Merge Sorted Array

// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

// The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]

function mergeSortedArrays(nums1, nums2, m, n) {
    let j = 0;
    for (let i = m; i < nums1.length; i++) {
        nums1[i] = nums2[j];
        j++;
    }
    nums1 = nums1.sort()
    return nums1;
}

function main() {
    const nums1 = [1,2,3,0,0,0]
    const nums2 = [2,5,6]
    const m = 3
    const n = 3

    return mergeSortedArrays(nums1, nums2, m, n)
}

console.log(main())