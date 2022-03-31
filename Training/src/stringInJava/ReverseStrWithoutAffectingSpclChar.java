package stringInJava;

public class ReverseStrWithoutAffectingSpclChar {
	public static void main(String[] args) {
		System.out.println(reverseString("abc#gh&"));
	}

	public static String reverseString(String str) {
		char[] cha=str.toCharArray();
		int l=0;
		int r=cha.length-1;
		while(l<r)
		{
			if(!Character.isAlphabetic(cha[l])) {
				l++;
			}
			else if(!Character.isAlphabetic(cha[r])) {
				r--;
			}
			else
			{
				char temp=cha[l];
				cha[l]=cha[r];
				cha[r]=temp;
				l++;
				r--;
			}
		}
		return new String(cha);
	}

	}

