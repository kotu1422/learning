package en.codegym.task.pro.task09.task0912;

/* 
URL validation
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.us", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domainExtension = checkDomainExtension(url);

            System.out.println("URL address: " + url + ", network protocol - " + protocol + ", domain extension - " + domainExtension);
        }
    }

    public static String checkProtocol(String url) {
        if (url.startsWith("https"))
        {
            return "https";//write your code here
        } else if (url.startsWith("http")){
            return "http";
        }
        return "unknown";
    }

    public static String checkDomainExtension(String url) {
        String[] ext = {"com","net","org","us"};
        for (int i = 0; i < ext.length; i++) {
            if (url.endsWith(ext[i])){
                return ext[i];
            }
        }//write your code here
        return "unknown";
    }
}
