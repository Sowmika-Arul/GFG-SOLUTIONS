class Solution {
    
    public int firstElementKTime(int[] arr, int k) {
        
        HashMap<Integer, Integer> store = new HashMap<>();
        
        for(int i = 0 ; i < arr.length; i++){
            
            store.put(arr[i], store.getOrDefault(arr[i], 0) + 1);
            if(store.containsKey(arr[i]) && (store.get(arr[i]) == k)) return arr[i];

        }
        return -1;
    }
}