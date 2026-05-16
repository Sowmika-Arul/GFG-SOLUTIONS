class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        
        HashMap<Integer, Integer> store = new HashMap<>();
        for(int i = 0; i < arr.length; i++)
        store.put(arr[i], store.getOrDefault(arr[i], 0) + 1);
        
        for(Map.Entry<Integer, Integer> entry : store.entrySet())
        {
            if(entry.getValue() % 2 != 0) return entry.getKey();
        }
        return -1;
    }
}