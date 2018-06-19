#include <stdlib.h>

void mymemcpy(char* dest, char* src, int l) {
	int i;
	for (i = 0; i < l; ++i) {
		dest[i] = src[i];
	}	
}

int strlength(char* str) {
	int i = 0;
	for (; *str != '\0'; ++str)
		++i;
	return i;
}

char* removeFirst(char* str, int nb) {
	int length = strlength(str) - nb < 0 ? 0 : strlength(str) - nb;
	
	char* res = malloc(sizeof(char) * (length + 1));
	mymemcpy(res, str + nb, length);
	res[length] = '\0';
	
	return res;
}

/*
int main() {
    char* str = "548wazaaza";
    printf("%s", removeFirst(str, 3));
}
*/