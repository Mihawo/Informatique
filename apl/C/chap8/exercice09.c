#include <stdlib.h>

int strlength(char* str) {
	int i = 0;
	for (; *str != '\0'; ++str)
		++i;
	return i;
}

char* strcat(char* str1, char* str2) {
	int size = strlength(str1) + strlength(str2);
	char* res = malloc(sizeof(char) * (size+1));
	char* tmp;

	
	for (tmp = res; *str1 != '\0'; str1++, tmp++) {
		*tmp = *str1;
	}

	for (; *str2 != '\0'; str2++, tmp++) {
		*tmp = *str2;
	}
	
	*tmp = '\0';
	
	return res;
}