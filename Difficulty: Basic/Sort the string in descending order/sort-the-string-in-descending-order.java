// User function Template for Java
class Solution {
    String ReverseSort(String s) {
        char[] store = s.toCharArray();
        Arrays.sort(store);
        StringBuilder res = new StringBuilder();
        res.append(store).reverse();
        return res.toString();
        
    }
}