import java.util.Scanner;

/**
 * @author gorit
 * @date 2019年4月2日
 *	 最大公约数以及最小公倍数的实现
 * */
public class greatestCommonDivisor {
	static int temp;//定义一个全局的中间变量
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		System.out.println(a+"和"+b+"的辗转相除法得到的结果为:"+division(a, b));
		System.out.println(a+"和"+b+"的辗转相减法得到的结果为:"+substract(a, b));
		System.out.println(a+"和"+b+"的穷举法得到的结果为:"+Exhaus(a, b));
		System.out.println(a+"和"+b+"的最小公倍数为:"+(a*b)/Exhaus(a, b));
	}
	
		//method of successive division
		//辗转相除法的实现
	public static int division(int a,int b) {
		while(a % b!=0) {//直到余数为0 ，最大公约数为上一步的余数
			temp= a%b;
			a = b;
			b = temp;
		}
		return b;
	}
	
	//Rolling subtraction
	//辗转相减法
	public static int substract(int a,int b) {
		while(true) {
			if(a>b) {
				a=a-b;
			}else if(a<b) {
				b=b-a;
			}else {
				return b;//这里返回a，b都可以，因为最终a是等于b的
			}
		}
	}
	
	//穷举
	public static int Exhaus(int a,int b) {
		for(int i=a;;i--) 
			if(a%i==0 && b%i==0)	
				return i;
	}
}
