// Find the Duplicate Number

// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

// There is only one repeated number in nums, return this repeated number.

// You must solve the problem without modifying the array nums and using only constant extra space.

// Input: nums = [1,3,4,2,2]
// Output: 2

// naive approach (O(n^2))
// function findDuplicate(nums) {
//     for (let i = 0; i < nums.length; i++) {
//         for (let j = i + 1; j < nums.length; j++) {
//             if (nums[i] === nums[j]) {
//                 return nums[i];
//             }
//         }
//     }
//     return -1;
// }

function findDuplicate(nums) {
    let actualSumOfNums = 0;
    for (x of nums) {
        actualSumOfNums = actualSumOfNums + x;
    }
    const expectedSumOfArray = ((nums.length - 1) * nums.length / 2);
    console.log({expectedSumOfArray}, {actualSumOfNums});
    return actualSumOfNums - expectedSumOfArray;
}

function main() {
    // const nums = [1,3,4,2,2]
    const nums = [3,1,3,4,2]

    return findDuplicate(nums)
}

console.log(main())