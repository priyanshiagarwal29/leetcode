class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {

        Set<String> validBusiness = new HashSet<>(
                Arrays.asList("electronics", "grocery", "pharmacy", "restaurant")
        );

        List<int[]> valid = new ArrayList<>();
        // store index of valid coupons

        for (int i = 0; i < code.length; i++) {

            if (!isActive[i]) continue;
            if (code[i] == null || code[i].isEmpty()) continue;
            if (!validBusiness.contains(businessLine[i])) continue;

            boolean ok = true;
            for (char c : code[i].toCharArray()) {
                if (!Character.isLetterOrDigit(c) && c != '_') {
                    ok = false;
                    break;
                }
            }

            if (ok) valid.add(new int[]{i});
        }

        // sort by businessLine, then by code
        valid.sort((a, b) -> {
            int i = a[0], j = b[0];
            int cmp = businessLine[i].compareTo(businessLine[j]);
            if (cmp != 0) return cmp;
            return code[i].compareTo(code[j]);
        });

        List<String> res = new ArrayList<>();
        for (int[] v : valid) {
            res.add(code[v[0]]);
        }

        return res;
    }
}
