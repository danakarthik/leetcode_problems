import java.util.ArrayList;
import java.util.List;

class Solution {
    private void solve(int idx, String num, long prevOperand, long currentOperand, StringBuilder res, List<String> ans, int target) {
        // Base case: If we've processed all digits, check if the current expression equals the target
        if (idx == num.length()) {
            if (currentOperand == target) {
                ans.add(res.toString());
            }
            return;
        }

        // Iterate over all possible lengths of the current number
        for (int i = idx; i < num.length(); i++) {
            // Avoid numbers with leading zeros
            if (i > idx && num.charAt(idx) == '0') break;

            // Get the current number (from idx to i)
            long currNum = Long.parseLong(num.substring(idx, i + 1));
            int len = res.length();

            // First, handle the case where there's no operator before the current number (i.e., we append the number)
            if (idx == 0) {
                res.append(currNum);
                solve(i + 1, num, currNum, currentOperand + currNum, res, ans, target);
                res.delete(len, res.length());
            } else {
                // Add '+'
                res.append('+');
                res.append(currNum);
                solve(i + 1, num, currNum, currentOperand + currNum, res, ans, target);
                res.delete(len, res.length());

                // Add '-'
                res.append('-');
                res.append(currNum);
                solve(i + 1, num, -currNum, currentOperand - currNum, res, ans, target);
                res.delete(len, res.length());

                // Add '*'
                res.append('*');
                res.append(currNum);
                solve(i + 1, num, prevOperand * currNum, currentOperand - prevOperand + (prevOperand * currNum), res, ans, target);
                res.delete(len, res.length());
            }
        }
    }

    public List<String> addOperators(String num, int target) {
        List<String> ans = new ArrayList<>();
        solve(0, num, 0, 0, new StringBuilder(), ans, target);
        return ans;
    }
}
