
public class LeetCode223 {
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		int a1 = (A - C) * (B - D);
		int a2 = (E - G) * (F - H);
		if (A >= G || E >= C || B >= H || F >= D)
			return a1 + a2;
		int b = (Math.min(C, G) - Math.max(A, E)) * (Math.min(D, H) - Math.max(B, F));
		return a1 + a2 - b;
	}
}
