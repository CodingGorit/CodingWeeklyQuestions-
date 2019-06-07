#include<stdio.h>
int main()

{
	int u,v,temp;
	printf("判断公约数\n");
	printf("----------\n");
	printf("输入两个正整数\n");
	scanf("%d%d",&u,&v);
 	while(v!=0)
 	{
 		temp=u%v;
 		u=v;
 		v=temp;
 		
	 }
	printf("最小公约数为%d",u);

	return 0;
 } 
