class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int cursum;

        while (true){
            cursum = 0;
            while (n != 0){
                cursum+= (n % 10) * (n % 10);
                n /=  10;
            }
            if (cursum == 1){
                return true;
            }if (set.contains(cursum)){
                return false;
            }
            set.add(cursum);
            n =  cursum;

        } 
    }
}
