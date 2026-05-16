// User function Template for Java

class Solution {
    String uncommonChars(String s1, String s2) {
        
        HashSet<Character> set = new HashSet<>();
        HashMap<Character, Integer> store = new HashMap<>();
        StringBuilder result = new StringBuilder();
        
        for(int i = 0 ; i < s1.length(); i++) 
           store.put(s1.charAt(i), store.getOrDefault(s1.charAt(i), 0) + 1);
        
        for(int i = 0; i < s2.length(); i++){
            if(!store.containsKey(s2.charAt(i)) && !set.contains(s2.charAt(i)))
                  result.append(s2.charAt(i));
                  
            else  store.remove(s2.charAt(i));
                 set.add(s2.charAt(i));
    }
        
        for(Map.Entry<Character, Integer> entry : store.entrySet())
            result.append(entry.getKey());

         char[] sort = result.toString().toCharArray();
         
         Arrays.sort(sort);
         
         String res = new String(sort);
         
         return res;
    }
}