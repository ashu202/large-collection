package largeCollection;
import java.util.*;
public class UnmodifiableCryptoListExample1 {
	
	public static void main(String[] args) {  

        List<String> cryptoList = new ArrayList<>();  
        Collections.addAll(cryptoList, "BTC", "ETH", "USDT", "USDC", "BNB");
        //List immutableCryptoList = List.copyOf(cryptoList);
        System.out.println("Underlying crypto list:" + cryptoList);
        //System.out.println("Immutable crypto ist: " + immutableCryptoList);  

        // try to add one more cryptocurrency to modifiable list and show immutable does not display change
        cryptoList.add("BUSD");
        System.out.println("New underlying list:" + cryptoList);
       // System.out.println("New immutable crypto List:" + immutableCryptoList);

        // try to add one more cryptocurrency to unmodifiable list and show in unmodifiable list -
       // immutableCryptoList.add("XRP");
        //System.out.println("New unmodifiable crypto List with new element:" + immutableCryptoList);

        }  

}
