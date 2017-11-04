import java.text.DecimalFormat;
import java.util.Scanner;

import org.junit.Test;

public class StringFragment {

	@Test
	public void test() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		byte[] c = s.getBytes();
		//不一样的块长度
		int notSame = 1;
		int currentElement = c[0];
		//遍历数组
		for(int i=0;i<c.length;i++) {
			if(currentElement!=c[i]) {
				notSame++;
				currentElement = c[i];
			}
		}
		//转成小数
		float result = Float.valueOf(s.length())/notSame;
		//格式化输出浮点数
		System.out.println(new DecimalFormat("0.00").format(result));
	}
	
	@Test
	public void test1() {
		int i = 9;
		double f = Double.valueOf(i);
		System.out.println(f/4);
		new DecimalFormat("0.00").format(12.33666999);
	}
	
}
