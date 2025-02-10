//brute force

var twoSum = function (nums, target) {
       for (let i = 0; i <= nums.length; i++) {
              for (let j = i + 1; j < nums.length; j++) {
                     if (nums[i] + nums[j] == target) {
                            return [i, j];
                     }
              }
       }
}

//optimized

var twoSumOp = function (nums, target) {
       const map = new Map();
       for (const index in nums) {

              const targetValue = target - nums[index];
              if (map.has(targetValue)) {
                     return [map.get(targetValue), index]
              }
              map.set(nums[index], index)
       }
};