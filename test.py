memo={}

def bestSum(targetSum, numbers):
    if targetSum in memo:
        return memo[targetSum]
    if targetSum==0:
        return []
    if targetSum<0:
        return None

    shortestCombination=None
    for num in numbers:
        remainder=targetSum-num
        remainderCombination=bestSum(remainder,numbers)
        if remainderCombination!=None:
            remainderCombination.append(num)
            if shortestCombination==None or len(shortestCombination)>len(remainderCombination):
                shortestCombination=remainderCombination
    memo[targetSum]=shortestCombination
    return shortestCombination


print(bestSum(8,[2,3,5]))
