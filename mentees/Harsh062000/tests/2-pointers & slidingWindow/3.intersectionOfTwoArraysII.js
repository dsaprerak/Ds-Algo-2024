var intersect = function (nums1, nums2) {

       nums1.sort((a, b) => a - b);
       nums2.sort((a, b) => a - b);

       let i = 0, j = 0;
       let res = [];

       while (i !== nums1.length && j !== nums2.length) {
              if (nums1[i] < nums2[j]) {
                     i++;
              } else if (nums1[i] > nums2[j]) {
                     j++;
              } else if (nums1[i] === nums2[j]) {
                     res.push(nums1[i]);
                     i++;
                     j++;
              }
       }
       return res;
};