class Solution {
public:
    vector<int> twoSum(vector<int> &numbers, int target) {
        vector<int> result(2);
        unordered_map<int, int> storeNum;
        int x = numbers.size();
        for(int i = 0;i < x;i ++){
            storeNum[numbers[i]] = i;
        }
        for(int i = 0;i < x;i ++){
            int gap = target - numbers[i];
            if(storeNum.find(gap) != storeNum.end() && storeNum[gap] != i){
                result[0]= i + 1;
                result[1]= storeNum[gap] + 1;
                break;
            }
        }
        return result;
    }
};
