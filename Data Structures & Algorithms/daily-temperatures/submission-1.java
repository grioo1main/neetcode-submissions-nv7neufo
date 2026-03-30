
class Solution {
    public static int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> dq = new ArrayDeque<>();
        int[] ans = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            if (dq.isEmpty()){
                dq.add(i);
                continue;
            }
            while (!dq.isEmpty() && temperatures[dq.peek()] < temperatures[i]){
                ans[dq.peek()] = i - dq.pop();
            }

            dq.push(i);
        }
        return ans;
    }

//    public static void main(String[] args) {
//        System.out.printf(Arrays.toString(dailyTemperatures(new int[]{23 , 22 , 21 , 32 , 1 })));
//    }
}
