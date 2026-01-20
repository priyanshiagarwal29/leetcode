
class Solution {
    int[] parent;
    int[] rank;

    public int find(int x) {
        if (x == parent[x]) return x;
        return parent[x] = find(parent[x]); // path compression
    }

    public void union(int x, int y) {
        int px = find(x);
        int py = find(y);

        if (px == py) return;

        if (rank[px] > rank[py]) {
            parent[py] = px;
        } else if (rank[px] < rank[py]) {
            parent[px] = py;
        } else {
            parent[px] = py;
            rank[py]++;
        }
    }

    public boolean equationsPossible(String[] equations) {
        parent = new int[26];
        rank = new int[26];

        for (int i = 0; i < 26; i++) parent[i] = i;


        for (String s : equations) {
            if (s.charAt(1) == '=') {
                int a = s.charAt(0) - 'a';
                int b = s.charAt(3) - 'a';
                union(a, b);
            }
        }

        for (String s : equations) {
            if (s.charAt(1) == '!') {
                int a = s.charAt(0) - 'a';
                int b = s.charAt(3) - 'a';
                if (find(a) == find(b)) return false;
            }
        }

        return true;
    }
}
