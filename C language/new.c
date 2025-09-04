#include <stdio.h>

int main() {
    for (int i = 0; i < 7; i++) {
        for (int j = 0; j < 7; j++) {
            if (i + j == 3 || i - j == 3 || i + j == 9 || i - j == -3) {
                printf("*");
            } else {
                printf(" ");
            }
        }
        printf("\n");
    }
    printf("Happy Rose Day!");
    return 0;
}