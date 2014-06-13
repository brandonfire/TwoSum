class Solution:
    # @return a tuple, (index1, index2)
    def twoSum(self, num, target):
        di = {}
        count = 1
        for item in num:
            di[item]=count
            count+=1
        count = 1
        for x in num:
            gap = target - x
            if gap in di:
                a = count
                b = di[gap]
                if a!=b:
                    return(a,b)
            count +=1

