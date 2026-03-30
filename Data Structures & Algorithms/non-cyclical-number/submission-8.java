class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int cursum;
        int ost;

        while (true){
            cursum = 0;
            while (n != 0){
                cursum+= Math.pow(n%10 , 2);
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
