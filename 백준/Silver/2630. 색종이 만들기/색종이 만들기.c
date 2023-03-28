#define CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

int paper[128][128];
int zero=0;
int one = 0;

void conquer(int x, int y, int n) {
	
	int i=0, j=0;
	int std = paper[x][y];
	
	for (i = x; i < x+n; i++) {
		for (j = y; j < y+n; j++) {
			if (paper[i][j] != std) {
				n /= 2;
				conquer(x, y, n);
				conquer(x + n, y, n);
				conquer(x, y + n, n);
				conquer(x + n, y + n, n);
				return;
			}
		}
	}

	if (std == 1) one++;
	else zero++;
		
}

int main(void) {
	int n;
	scanf("%d", &n);	// 종이의 한 변의 길이
	int i, j;

	for (i = 0; i < n; i++) {
		for (j = 0; j < n; j++) {
			scanf("%d", &paper[i][j]);
		}
	}

	int left = 0;
	int right = 0;

	conquer( left, right, n);
	printf("%d\n%d", zero, one);
	return 0;

}