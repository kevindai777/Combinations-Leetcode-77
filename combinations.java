//Java Solution

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int index = 1;
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> temp = new LinkedList<>();
        
        backtrack(temp, result, index, n, k);
        return result;
    }
    
    public void backtrack(LinkedList<Integer> temp, List<List<Integer>> result, int index, int n, int k) {
        if (temp.size() > k) {
            return;
        }
        
        if (temp.size() == k) {
            result.add(new ArrayList<>(temp));
            return;
        }
        
        for (int i = index; i <= n; i++) {
            temp.add(i);
            backtrack(temp, result, i + 1, n, k);
            temp.removeLast();
        }
    }
}