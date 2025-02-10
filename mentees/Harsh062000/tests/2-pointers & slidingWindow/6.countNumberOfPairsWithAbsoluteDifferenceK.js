var countKDifference = function (nums, k) {
       let map = {};
       let count = 0;
       for (let i = 0; i < nums.length; i++) {
              if (map[nums[i] - k]) {
                     count += map[nums[i] - k];
              }
              if (map[nums[i] + k]) {
                     count += map[nums[i] + k];
              }
              map[nums[i]] = (map[nums[i]] || 0) + 1;
       }
       return count;
};