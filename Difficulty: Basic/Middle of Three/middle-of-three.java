// User function Template for Java

class Solution {
    int middle(int a, int b, int c) {
        if(a > b && a > c) 
        return (b > c) ? b : c;
        else if(b > a && b > c)
        {
            if(a > c) return a;
            else return c;
        }
        else
        {
            if(a > b) return a;
            else return b;
        }
    }
}