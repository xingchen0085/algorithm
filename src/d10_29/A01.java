package d10_29;

/**
 * 动态规划
 * 
 * 一般形式就是求最值；求解动态规划的核心思想就是穷举
 * 但是动态规划穷举比较特殊，有“重叠子问题”，需要备忘录、DPTabel优化穷举过程。
 * 
 * --> 写出状态转移方程
 * #初始化base case
 * dp[0][0][...] = base;
 * #状态转移
 * for 状态1 in 状态1所有值 ：
 * 	for 状态2 in 状态2所有值：
 * 		for...
 * 			dp[状态1][状态2][...] = [选择1][选择2][...]
 * 
 * 斐波那契数列
 * f(x) = {
 * 		1  n==1或n==2
 * 		(n-1) + (n-2)
 * }
 * 
 * 递归算法的时间复杂度怎么计算？就是用子问题个数乘以解决一个子问题需要的时间。
 */
public class A01 {
	public static void main(String[] args) {
		int fit = new Solution().fit(1000);
		System.out.println(fit);
	}
}


class Solution {
	//public int fit(int N) {  //时间复杂度  O(n^2)
	//	if(N == 1 || N == 2) return 1;
	//	return fit(N-1) + fit(N-2);
	//}
	
	public int fit(int N) { //时间复杂度O(n)
		if(N < 0) return 0;
		//备忘录
		int[] memo = new int[N+1];
		return helper(N,memo);
	}
	
	private int helper(int N,int[] memo) {  
		if(N == 1 || N == 2) {
			
			return 1;	
		}
		
		if(memo[N] != 0) {
			return memo[N];
		}
		
		memo[N] = helper(N - 1,memo) + helper(N - 2,memo);
		
		return memo[N];
	}
}
