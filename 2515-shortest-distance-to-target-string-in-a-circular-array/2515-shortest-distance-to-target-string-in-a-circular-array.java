class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n=words.length;

        for(int move=0;move<n;move++)
        {
            int right=(startIndex+move)%n;
            int left=(startIndex-move+n)%n;

            if(words[right].equals(target) || words[left].equals(target) )return move;
        }
        return -1;
    }
}