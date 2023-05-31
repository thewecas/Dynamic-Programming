
const bestSum=(targetSum,numbers,memo={})=>{
    if(targetSum in memo)   return memo[targetSum];
    if(targetSum==0)   return [];
    if(targetSum<0)    return null;
    
    let shortestCombination=null;

    for(let num of numbers){
        const remainder=targetSum-num;
        const remainderCombination=bestSum(remainder,numbers,memo);
        if(remainderCombination!=null){
            if(shortestCombination==null || remainderCombination.length<shortestCombination.length)
                shortestCombination=[...remainderCombination, num];
        }
    } 
    memo[targetSum]=shortestCombination;
    return shortestCombination;
}

console.log(bestSum(100,[1,2,25]))