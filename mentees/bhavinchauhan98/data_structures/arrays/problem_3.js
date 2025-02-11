// Intersection of Two Arrays II

// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2,2]

function intersectionOfArrays(nums1, nums2) {
    const map = {};
    const result = [];
    for (x of nums1) {
        if (map[x] > 0) {
            map[x] = map[x] + 1;
        } else {
            map[x] = 1;
        }
    }
    for ( y of nums2) {
        if (map[y] > 0) {
            map[y] = map[y] - 1;
            result.push(y);
        }
    }
    return result
}

function main() {
    // const nums1 = [1,2,2,1]
    // const nums2 = [2, 2]
    const nums1 = [4,9,5]
    const nums2 = [9,4,9,8,4]

    return intersectionOfArrays(nums1, nums2)
}

console.log(main())