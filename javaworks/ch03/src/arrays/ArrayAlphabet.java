package arrays;

public class ArrayAlphabet {

	public static void main(String[] args) {
		
		// 1���� 10���� �����ϴ� �迭
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
			//System.out.print(numbers[i] + " ");
		}
		
		//���ĺ� �빮�� - ����(26��)
		char[] alphabets = new char[26];
		char ch = 'A';
		
		alphabets[0] = ch;
		alphabets[1] = (char) (ch+1);

		for(int i=0;i < alphabets.length; i++) {
			alphabets[i] = (char)(ch + i);
			System.out.print(alphabets[i] + " ");
		}
		
	}

}
