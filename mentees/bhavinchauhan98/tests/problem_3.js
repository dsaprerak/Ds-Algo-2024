// Problem 3:-

// Given an array of integers. Find the numbers whose occurence in the array is odd. 

// Note: Integers are from 0 to 100 and length of array is greater than the max value in Array

// For eg: 
// Input: [1,3,4,2,4,1,4]

// Output: [3,4,2]; Since 3 & 2 is repeated once, 4 is repeated three times.

function oddOccurences(nums) {
    const map = {}
    const result = []
    for (let i of nums) {
        if (map[i] === undefined) map[i] = 1
        else map[i]++
    }
    Object.keys(map).forEach((key) => {
        if (map[key] % 2 !== 0) result.push(parseInt(key))
    })
    return result
}

function main() {
    const nums = [1,3,4,2,4,1,4]

    return oddOccurences(nums)
}

console.log(main())