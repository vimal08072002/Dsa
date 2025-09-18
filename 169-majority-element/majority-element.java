class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int ans=0;
        HashMap<Integer,Integer> hm=new HashMap();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int j:hm.keySet()){
            int val=0;
            val=hm.get(j);
            if(val>n/2){
                ans=j;
                break;
            }
        }
    
        return ans;


        
    }
}