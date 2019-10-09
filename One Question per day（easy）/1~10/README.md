这是一个长期慢慢积累的过程，也是我想做的事情，网上也有很多100例题经典例题，都编写的很不错，我会从中收录一些适合各个阶段编程的同学进行复习，查漏补缺用，我会用c，java，python等一些多种程序语言实现它们，同时也是为了自己巩固加强

@[TOC](问题索引)
# 一、A + B 问题 
### 1.1 问题描述 
A+B 
输入两个整数，中间用空格隔开，输出这两个数字之和 

###  1.2 示例代码 
输入：2 3 
输出：5 

###  1.3 代码实现 
c 

```c 
#include<stdio.h> 
int main()
{
	int a, b;
	scanf("%d%d",&a,&b);
	printf("%d",a+b);
	return 0;
}
```

Python3

```python3
a,b =map(int,input().split())#如果用逗号间隔，可以用split(",")
print("{}".format(a+b))

```

java

```java
import java.util.Scanner;//一、导入输入的包

public class Scan {
	public static void main(String args[]) {
		int a, b;
		Scanner input = new Scanner(System.in);//创建对象
		a = input.nextInt();
		b = input.nextInt();
		System.out.printf("%d", a + b);
	}
}
```

# 二、输入一个年份，判断平年，闰年 
### 2.1 问题描述 
输入任意个一个年份，判断该年是平年还是闰年——(判断结构的使用，逻辑运算符的使用) 
> tips：能被400整除的数字或者能被4整除不能被100整除的年份即为 闰年 

### 2.2 示例代码  
输入：2000 
输出：闰年 
输入：2003 
输出：平年 

### 2.3 代码实现 
c 

```c
#include<stdio.h> 
int main()
{
	int year;
	scanf("%d",&year);
	if((year%400 == 0)||(year%4==0&&year%100 !=0))
		printf("闰年");
	else
		printf("平年");
	return 0;
}
```

Python3

```python3
x = int(input())
if x%400==0 or (x%4==0 and x%100!=0):
    print("闰年")
else:
    print("平年")
```

java 

```java
import java.util.Scanner;
public class Yearpd {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		int year;
		year = input.nextInt();
		if(year%400 ==0 || (year%4==0 &&year%100!=0))
			System.out.print("闰年");
		else
			System.out.print("平年");
	}
}
```

# 三、交换两个数字的值 
### 3.1 问题描述 
给定a，b的值，a=3，b=5，然后交换两个数字的值 

### 3.2 示例代码 
无输入： 
a = 4; 
b = 5; 

输出： 
a = 5; 
b = 4; 

### 3.3 代码实现 
c 

```c
#include<stdio.h>
int main()
{
	int a=4,b=5;
	printf("a=%d\nb=%d",b,a);
	return 0;
} 
```

python 

```python
def swap(a,b):
    a,b=b,a
    print("a={}\nb={}".format(a, b))

a,b=4,5
swap(a,b)
```
java 

```java
public class Swap {
	public static void main(String[] args) {
		Swap swap=new Swap();
		int a=4,b=5;
		swap.swap(a,b);
	}
	
	public void swap(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.printf("a=%d\nb=%d",a,b);
	}
}
```
# 四、求和  
### 4.1 问题描述  
小明开始打算背单词，第一天打算背1个，第二天比第一天多背一个，第三天比第二天再多背一个，请问到了第十天，小明总共背了多少个单词？ 
> 问题看起来很绕口，其实，说白了求1到10之间的整数之和 

### 4.2 示例 
输出： 
55 


### 4.3 代码实现 
c
```c
//公式法
#include<stdio.h>
int main()
{
	printf("%i",((10+1)*10)/2);
	return 0;
} 
```

python
```python
#循环
plus = 0#python会自动根据你输入的值判断数据类型
for i in range(1,11):#从1一直到10结束
    plus +=i

print(plus)

#sum在循环中是个关键字，是个自带的一个求和的函数
a = [1,2,3,4,5,6,7,8,9,10]
#两个的结果是一样的
print(sum(a))
```

java 

```java
//java用递归实现这个程序
public class TenPlus {
	public static void main(String[] args) {
		byte n=10;
		//创建对象
		TenPlus plus =new TenPlus();
		//通过对象名.方法名来调用方法
		System.out.println(plus.Plus(n));
	}
	
	//定义递归的方法
	public int Plus(int n) {
		if(n==1)
			return 1;//递归结束点
		else
		return Plus(n-1)+n; 
	}
}
```

# 五、打印九九乘法表 
### 5.1 问题描述 
打印我们小时候背诵用的九九乘法表 
### 5.2 示例 

![在这里插入图片描述](https://img-blog.csdnimg.cn/20190305215926816.?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NhaWRld2VpMTIx,size_16,color_FFFFFF,t_70)
### 5.3 代码实现 
c 

```c
#include<stdio.h>
int main()
{
	for(int i=1;i<=9;i++)
	{
		for(int j=1;j<=i;j++){
			printf("%d*%d=%d ",j,i,i*j);
		}
		printf("\n");
	}
	return 0;
} 
```

java  

```java
public class Nine_Nine_chart {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++) {
				if(i<j)
					continue;
				System.out.printf("%dx%d=%d ",i,j,i*j);
			}
		System.out.print("\n");
		}
	}
		
}
```

python  

```python
for i in range(1, 10):
    for j in range(1, i+1):
        print('{}x{}={}\t'.format(j, i, i*j), end='')
    print()
```

本期用先用java去实现代码，后面我会慢慢补全c语言和python的代码 
@[TOC](题目索引) 

# 六、温度转换问题 
### 6.1 问题描述 
>输入一个华氏温度，输出摄氏度，转化公式：C=5 x (F-32)/9 
### 6.2 示例 
输入：80 
输出：26 
### 6.3 代码实现 
java 

```java
import java.util.Scanner;

public class Sy {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("输入当前华氏度");
		int temperture=input.nextInt();
		System.out.println(temperture+"℉——>"+5*(temperture-32)/9+"℃");		
	}
}
```


# 七、求阶乘之和 
### 7.1 问题描述 
>求1！+2！+3！……+10！ 
### 7.2 示例 
输出 
1!+2!+3!……+10！= 4037913 
### 7.3 代码实现 
java
```java
/**
 * @author gorit
 * @date 2019年3月7日
 * @work 阶乘之和
 * 
 * */
public class FacPlus {
	//非递归的方法
	public static void main(String[] args) {
		int sum=0;//记录阶乘之和
		int flag=1;//循环到第几个数就是第几个数的阶乘
		for (int i = 1; i <= 10; i++) {
			flag*=i;
			sum+=flag;
		}
		System.out.println("1!+2!+3!……+10！= "+sum);
	}
}

```

# 八、打印水仙花数 
### 8.1 打印100~1000之间的水仙花数 
>比如：153=1^3^+5^3^+3^3^这样的数就是水仙花数，题目要求打印100—1000之间的水仙花数 

### 8.2 示例 
输出 
153 
370 
371 
407 

### 8.3 代码实现 
java
```java
/**
 * @author gorit
 * @2019年3月7日
 * @work 打印100到1000之间的水仙花数
 * 
 * */
public class Shuixh {
	public static void main(String[] args) {
		int a=0;//记录个位数
		int b=0;//记录十位数
		int c=0;//记录百位数
		for(int i=100;i<1000;i++) {
			c=i/100;
			b=(i/10)%10;
			a=i%10;
			if(Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c, 3)==(i)) {//幂函数的使用
				System.out.println(i);//打印符合条件的水仙花数
			}
		}
	}
}
```

# 九、求100~200以内的素数 
### 9.1 问题描述 
>什么是素数，就是只能被一和自己本身能整除的数字，比如3、5、7、11等等 
>怎么解决：算法一：我们要判断第n个数是否是素数时，需要从2开始到n-1对这个数进行整除，如果这个数能被整除，就不是素数 
>算法二：用除法的方式 
>算法三：用开方法，就是用2一直整除到sqrt(这个数)，如果能被整除，则不是素数 

### 9.2 示例 
省略，纯输出 
### 9.3 代码实现 

```java
package gorit;
/**
 * @author gorit
 * @date 2019年3月12日
 * @work 求100-200的素数
 * 
 * */
public class Sushu {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 101; i <= 200; i++) {
			if(judge(i)==1) {//使用judge方法判断i是否是素数
				sum ++;
				System.out.println(i);
			}else {
				
			}
		}
		System.out.println("从101至200一共有" + sum + "个素数");
	}
	
	public static int judge(int n) {
		for(int i = 2; i <= Math.sqrt(n); i++) {//判断素数的方法：用一个数分别去除2到sqrt(这个数)
			if(n%i == 0) {//如果可以整除，则不是素数，返回值为0
				return 0;
			}else {
				
			}
		}
		return 1;//循环结束，没有中途返回值，则为素数，返回值为1
	}
}
```

# 十、实现冒泡排序 
### 10.1 问题描述 
>先输入一个n，表示你后面数组中元素的个数，然后再创建一个长度为n的数组，然后用循环把你输入的元素都放进去，调用冒泡排序的方法，然后循环打印排序后的元素

### 10.2 示例 
样例输入：
4
3 2 1 4

样例输出：
1 2 3 4
### 10.3 代码实现 

```java
import java.util.*;
/**
 * @author gorit
 * @date 2019-3-12
 * @冒泡排序
 * */
public class BubbleSort {
	public static void main(String[] args)  {
		Scanner input=new Scanner(System.in);
		int n;//数组的大小
		n=input.nextInt();
		int[] arr=new int[n];//定义长度为n的数组
		for (int i = 0; i < arr.length; i++) {//依次往数组中填入元素
			arr[i]=input.nextInt();
		}
		BubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {//打印元素
			System.out.print(arr[i]+" ");
		}
	}
	public static int[] BubbleSort(int[] array) {
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}
}

```
