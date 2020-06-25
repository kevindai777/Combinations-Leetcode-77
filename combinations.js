//Objective is to find all unique combinations of length k for numbers from 1..n.

let n = 4
let k = 2


//O(N!/(N-k)! * k!) solution similar to Combination Sum II (since we can only have
//unique combinations)

let temp = []
let index = 1
let result = []

backtrack(temp, index)

function backtrack(temp, index) {
    if (temp.length == k) {
        result.push([...temp])
        return
    }

    //For reference, incrementing the index by 1 in the recursion
    //will make sure we don't have repeats like [1,1]
    for (let i = index; i <= n; i++) {
        temp.push(i)
        backtrack(temp, i + 1)
        temp.pop()
    }
}

return result