// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
//to calculate max profit we need to check prices[i] - minSoFar value, while iterating over array update min if prices[i]<minSoFar 
//else if prices[i] - minSoFar > maxProfit update maxProfit

class Solution {
    public int maxProfit(int[] prices) {
        //base case
        if(prices==null || prices.length<=1)
            return 0;
        
        //initialize maxProfit, minSoFar
        int maxProfit=0, minSoFar = prices[0];
        
        //iterate over array, if curElem<minSoFar update minSoFar, else calculate profit 
        for(int i=1; i<prices.length; i++){
            if(prices[i]<minSoFar)
                minSoFar = prices[i];
            else if(prices[i] - minSoFar>maxProfit){
                maxProfit = prices[i] - minSoFar;
            }
                
        }
        
        //return maxProfit
        return maxProfit;
    }
}