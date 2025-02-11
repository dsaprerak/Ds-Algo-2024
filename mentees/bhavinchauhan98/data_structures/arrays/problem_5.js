// Two Sum

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]

function twoSum(nums, target) {
    const map = {};
    for (let i = 0; i < nums.length; i++) {
        const req = target - nums[i];        
        if (map[req] === 0 || map[req] > 0) {
            return [map[req], i];
        } else {
            map[nums[i]] = i;
        }
    }
    return []
}

function main() {
    const nums = [0,4,3,0];
    const target = 0;

    return twoSum(nums, target)
}

console.log(main())