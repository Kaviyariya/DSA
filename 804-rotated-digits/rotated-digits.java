class Solution {
    public int rotatedDigits(int n) {
        int goodCount = 0;
        
        for (int i = 1; i <= n; i++) {
            if (isGood(i)) {
                goodCount++;
            }
        }
        return goodCount;
    }
    
    private boolean isGood(int num) {
        boolean isDifferent = false;
        
        while (num > 0) {
            int digit = num % 10;
            
            // invalid digits
            if (digit == 3 || digit == 4 || digit == 7) {
                return false;
            }
            
            // digits that change after rotation
            if (digit == 2 || digit == 5 || digit == 6 || digit == 9) {
                isDifferent = true;
            }
            
            num /= 10;
        }
        
        return isDifferent;
    }
}