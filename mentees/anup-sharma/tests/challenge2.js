function kthlargest(a,k){
    let b = a.sort();
    let c = a[(a.length) - k];
    return c;
}

console.log(kthlargest([3,2,3,1,2,4,5,5,6], 4));