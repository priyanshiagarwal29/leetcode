class Solution {
    public int mostBooked(int n, int[][] meetings) {

        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        // busy rooms: (endTime, room)
        PriorityQueue<long[]> pq = new PriorityQueue<>(
            (a, b) -> a[0] == b[0]
                ? Long.compare(a[1], b[1])
                : Long.compare(a[0], b[0])
        );

        // free rooms by smallest index
        PriorityQueue<Integer> free = new PriorityQueue<>();
        for (int j = 0; j < n; j++) free.offer(j);

        int[] count = new int[n];
        int i = 0;

        while (i < meetings.length) {
            int start = meetings[i][0];
            int end = meetings[i][1];
            int time = end - start;

            // free finished rooms
            while (!pq.isEmpty() && pq.peek()[0] <= start) {
                free.offer((int) pq.poll()[1]);
            }

            if (!free.isEmpty()) {
                int room = free.poll();
                count[room]++;
                pq.add(new long[]{end, room});
            } else {
                long[] curr = pq.poll();
                curr[0] += time;
                count[(int) curr[1]]++;
                pq.add(curr);
            }

            i++;
        }

        int ans = 0;
        for (int j = 1; j < n; j++) {
            if (count[j] > count[ans]) ans = j;
        }

        return ans;
    }
}
