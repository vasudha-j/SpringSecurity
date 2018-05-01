package com.springsecurity.vasudha;

public class BitMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T-- > 0) {
            BigInteger N = new BigInteger(scan.next());
            N = N.subtract(BigInteger.ONE);
            System.out.println(N.bitCount() % 2 == 0 ? "Richard" : "Louise");
        }
        scan.close();
	}

}
