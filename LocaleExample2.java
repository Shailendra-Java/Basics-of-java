import java.util.*;  
public class LocaleExample2 {  
    public static void main(String[] args) {  
        Locale enLocale = new Locale("en", "US");  
        Locale frLocale = new Locale("fr", "FR");  
        Locale esLocale = new Locale("es", "ES");   		
        System.out.println("English language name (default): " +   
                            enLocale.getDisplayLanguage());  
  
        System.out.println("English language name in French: " +   
                            enLocale.getDisplayLanguage(frLocale));  
        System.out.println("English language name in spanish: " +   
                enLocale.getDisplayLanguage(esLocale));
    }  
  
} 