import java.util.Scanner;
//import java.util.Arrays;

public class ValidityCheck {

    public static boolean isValidPNR(String number) {

       	char ch;

	int[] pnArray;
	pnArray = new int[10];
	
	for(int i=0; i<=9; ++i) {
	ch = number.charAt(i);
	pnArray[i] = Character.digit(ch, 10);
	
	}
	int n=2;
		
	for(int a=0; a<=pnArray.length; ++a) {
	    if (a == 0 || a == 2 || a == 4 || a == 6 || a == 8) {
		pnArray[a]=pnArray[a]*n;
		if (pnArray[a] >= 10) {
		    Summera sum1 = new Summera();
		    int x = pnArray[a];
		    x = sum1.getSum1(x);
		    pnArray[a] = x;
		}
	    }
	}
        
	int sum = 0;

	for (int i : pnArray) {
	    sum += i;
	}
        //System.out.println("summan är" + sum);

	if (sum==(sum/10)*10) {
	    return true;
	//System.out.println(Arrays.toString(pnArray));		    
	    
	    }
	return false;
	}

    	public static class Summera {

	    private int sum = 0;
	    
	public int getSum1(int x) {

	    while (x != 0) {
		sum = sum + x % 10;
		x = x/10;
	    }

	    return sum;
	}
	    }	    
	public static void main(String[] args) {
	System.out.println("Skriv in ditt personnummer: ");
       	Scanner kbd = new Scanner(System.in);
        String personNummer = kbd.nextLine();

	if (isValidPNR(personNummer)) {
	    System.out.println("Giltigt nummer.");
	} else {
	    System.out.println("Ej ett giltigt nummer.");
	}
    }
}
