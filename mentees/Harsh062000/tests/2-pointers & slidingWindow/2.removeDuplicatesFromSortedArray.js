// brute force
var removeDuplicates = function (nums) {
       let swapCount = 0;
       let i = 0;
       let j = 1;
       while (j < nums.length) {
              if (nums[i] === nums[j]) {
                     j++;
              } else if (nums[i] !== nums[j] && nums[i] <= nums[j]) {
                     ++i;
                     [nums[i], nums[j]] = [nums[j], nums[i]];
                     j++;
              } else if (nums[i] >= nums[j]) {
                     j++;
              }
       }
       return i + 1;
};

// optimized
var removeDuplicatesOp = function (nums) {
       if (nums.length === 0) return 0;

       let i = 0;

       for (let j = 1; j < nums.length; j++) {
              if (nums[j] !== nums[i]) {
                     i++;
                     nums[i] = nums[j];
              }
       }

       return i + 1;
};