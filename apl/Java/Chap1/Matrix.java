import java.util.*;

public class Matrix {
	int[][] tab;
	
	public void init(int N, int M) {
		Random r = new Random();
		tab = new int[N][M];
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < M; ++j) {
				tab[i][j] = r.nextInt();
			}
		}
	}
	
	public void init(int[][] tab) {
		int N = tab.length;
		int M = tab[0].length;
		
		this.tab = new int[N][M];
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < M; ++j) {
				this.tab[i][j] = tab[i][j];
			}
		}
	}
	
	public Matrix addition(Matrix mat) {	
		Matrix res = new Matrix();
		int N = tab.length;
		int M = tab[0].length;
		
		if (N != mat.tab.length || M != mat.tab[0].length)
			return null;
		
		res.tab = new int[N][M];
		
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < M; ++j) {
				res.tab[i][j] = tab[i][j] + mat.tab[i][j];
			}
		}
		
		return res;
	}
}