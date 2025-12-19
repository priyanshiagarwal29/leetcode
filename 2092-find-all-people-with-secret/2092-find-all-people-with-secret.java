class Solution {
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {

        Arrays.sort(meetings, (a, b) -> a[2] - b[2]);

        boolean[] know = new boolean[n];
        know[0] = true;
        know[firstPerson] = true;

        int i = 0;

        while (i < meetings.length) {
            int currTime = meetings[i][2];
            List<int[]> temp = new ArrayList<>();

            while (i < meetings.length && meetings[i][2] == currTime) {
                temp.add(meetings[i]);
                i++;
            }

            boolean changed = true;
            while (changed) {
                changed = false;
                for (int[] m : temp) {
                    int a = m[0], b = m[1];
                    if ((know[a] && !know[b]) || (know[b] && !know[a])) {
                        know[a] = true;
                        know[b] = true;
                        changed = true;
                    }
                }
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int p = 0; p < n; p++) {
            if (know[p]) ans.add(p);
        }
        return ans;
    }
}
