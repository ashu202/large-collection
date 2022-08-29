package largeCollection;
import java.util.*;
public class UnmodifiableCryptoListExample {  
    public static void main(String[] args) {  
    	
    	/****
    	 * As an example, consider creating a modifiable list of the top five 
    	cryptocurrencies by market capitalization. You can create an unmodifiable 
    	version of the underlying modifiable list using the 
    	java.util.Collections.unmodifiableList() method. You can still modify the 
    	underlying list, which will appear in the unmodifiable list. But you 
    	cannot directly modify the unmodifiable version.
    	 */

        List<String> cryptoList = new ArrayList<>();  
        Collections.addAll(cryptoList, "BTC", "ETH", "USDT", "USDC", "BNB");  
        List<String> unmodifiableCryptoList = Collections.unmodifiableList(cryptoList);  
        System.out.println("Unmodifiable crypto List: " + unmodifiableCryptoList);  

        // try to add one more cryptocurrency to modifiable list and show in unmodifiable list
        cryptoList.add("BUSD");
        System.out.println("New unmodifiable crypto List with new element:" + unmodifiableCryptoList);

        // try to add one more cryptocurrency to unmodifiable list and show in unmodifiable list - unmodifiableCryptoList.add would throw an uncaught exception and the println would not run.
        unmodifiableCryptoList.add("XRP");
        System.out.println("New unmodifiable crypto List with new element:" + unmodifiableCryptoList);

        }  
}