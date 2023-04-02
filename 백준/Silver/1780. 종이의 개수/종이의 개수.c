#include <stdio.h>
#include <stdlib.h>

#define MAX_N 2188

int paper[MAX_N][MAX_N];
int cnt[3]; // -1, 0, 1의 개수를 저장할 배열

void count(int x, int y, int size) {
    int flag = 1;
    for (int i = x; i < x + size; i++) {
        for (int j = y; j < y + size; j++) {
            if (paper[i][j] != paper[x][y]) {
                flag = 0;
                break;
            }
        }
        if (!flag) {
            break;
        }
    }

    if (flag) { // 종이가 모두 같은 숫자로 이루어져 있는 경우
        cnt[paper[x][y] + 1]++;
        return;
    }

    // 9등분하여 각각의 종이를 처리
    int new_size = size / 3;
    for (int i = x; i < x + size; i += new_size) {
        for (int j = y; j < y + size; j += new_size) {
            count(i, j, new_size);
        }
    }
}

int main() {
    int n;
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            scanf("%d", &paper[i][j]);
        }
    }

    count(0, 0, n);

    printf("%d\n%d\n%d\n", cnt[0], cnt[1], cnt[2]);

    return 0;
}