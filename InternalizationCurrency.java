import java.text.NumberFormat;  
import java.util.*;  
public class InternalizationCurrency 
{   
	static void printCurrency(Locale locale)
	{  
		 double dbl=10500.3245;  
		 NumberFormat formatter=NumberFormat.getCurrencyInstance(locale);  
		 String currency=formatter.format(dbl);  
		 System.out.println(currency+" for the locale "+locale);  
	}  
	  
	public static void main(String[] args) 
	{  
		printCurrency(Locale.UK);  
		printCurrency(Locale.US);  
		printCurrency(Locale.FRANCE);  
	}  
} 