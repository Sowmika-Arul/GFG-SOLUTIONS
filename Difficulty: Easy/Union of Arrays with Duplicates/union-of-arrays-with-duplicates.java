class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        
        Arrays.sort(b);
        
        ArrayList<Integer> result = new ArrayList<>();
        
        HashMap<Integer, Integer> store = new HashMap<>();
        
        for(int i = 0 ; i < a.length; i++)
        store.put(a[i], store.getOrDefault(a[i], 0) + 1);
        
       for(int i = 0; i < b.length; i++)
        store.put(b[i], store.getOrDefault(b[i], 0) + 1);
        
        for(Map.Entry<Integer, Integer> entry : store.entrySet())
          result.add(entry.getKey());
          
        return result;
    }
}