class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> counter = new HashMap<>();
        for(String V : arr){
            counter.put(V, counter.getOrDefault(V, 0) + 1);
        }
        for(String V : arr){
            if(counter.get(V)==1){
                --k;
                if(k==0){
                    return V;
                }
            }
            
        }
        return "";
    }
}
