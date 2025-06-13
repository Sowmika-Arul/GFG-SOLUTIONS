class Solution {
    static char nonRepeatingChar(String s) {
        Map<Character,Integer> store = new HashMap<>();
        for(char c : s.toCharArray())
        store.put(c, store.getOrDefault(c,0) + 1);
        
       for(int i = 0 ; i < s.length(); i++)
       {
           char ch = s.charAt(i);
           if(store.get(ch) == 1)
           return ch;
       }
       
        return '$';
    }
}
