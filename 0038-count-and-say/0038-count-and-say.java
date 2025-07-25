class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";

        String result = "1";

        for (int i = 2; i <= n; i++) {
            StringBuilder next = new StringBuilder(result.length() * 2);
            char[] arr = result.toCharArray();
            char prev = arr[0];
            int count = 1;

            for (int j = 1; j < arr.length; j++) {
                if (arr[j] == prev) {
                    count++;
                } else {
                    next.append(count).append(prev);
                    prev = arr[j];
                    count = 1;
                }
            }

            next.append(count).append(prev);
            result = next.toString();
        }

        return result;
    }
}
