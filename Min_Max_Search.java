import java.io.*;
class GFG {
static int minimax(int depth, int nodeIndex, boolean isMax,
			int scores[], int h)
{
	if (depth == h)
		return scores[nodeIndex];
	if (isMax)
	return Math.max(minimax(depth+1, nodeIndex*2, false, scores, h),
			minimax(depth+1, nodeIndex*2 + 1, false, scores, h));
	else
		return Math.min(minimax(depth+1, nodeIndex*2, true, scores, h),
			minimax(depth+1, nodeIndex*2 + 1, true, scores, h));
}
static int log2(int n)
{
return (n==1)? 0 : 1 + log2(n/2);
}

	public static void main (String[] args) {
	int scores[] = {3, 5, 2, 9, 12, 5, 23, 23};
	int n = scores.length;
	int h = log2(n);
	int res = minimax(0, 0, true, scores, h);
	System.out.println( "The optimal value is : " +res);
		
	}
}

