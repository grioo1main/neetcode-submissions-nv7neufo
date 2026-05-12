class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        
        int l = 1; // Исправлено: минимальная скорость 1
        int r = max;
        int result = max;
        
        while (l <= r) {
            int mid = l + (r - l) / 2; // Исправлено: безопасное вычисление mid
            long ans = 0; // Исправлено: используем long во избежание переполнения
            
            for (int i : piles) {
                // Исправлено: целочисленное округление вверх без использования double/Math.ceil
                ans += (i + mid - 1) / mid; 
            }
            
            if (ans <= h) {
                result = mid; // Исправлено: мы ищем минимальную скорость (mid), а не время
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        
        return result;
    }
}