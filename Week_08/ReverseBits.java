package Week_08;

import java.math.BigInteger;

public class ReverseBits {

    public static int reverseBits(int n) {
        StringBuilder s=new StringBuilder();
    	for(int i=0;i<32;i++){
    		int now=n&1;
    		n>>>=1;
    		s.append(now);
    	}
    	BigInteger bi = new BigInteger(s.toString(), 2);
    	bi.toString(2);
    	return bi.intValue();
    }
}