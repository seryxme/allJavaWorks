package classwork.urlShortenerApp;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

public class URLConverter {

    private final Map<Integer, String> urlMaps = new HashMap<>();

    public void addURL(Integer key, String url) {
        urlMaps.put(key, url);
    }

    public int dataSize() {
        return urlMaps.size();
    }

    public String getURL(String shortURL) {
        int key = getKey(shortURL);
        return urlMaps.get(key);
    }

    public String getShortURL(String url) {
        SecureRandom randInt = new SecureRandom();
        int requestKey = randInt.nextInt(1_000_000_000);
        addURL(requestKey, url);
        String convertedKey = getConvertedKey(requestKey);
        return "https://myurl.me/" + convertedKey;
    }

    public String getConvertedKey(Integer requestKey) {
        return KeyConverter.convertRequestKey(requestKey);
    }

    public Integer getKey(String shortURL) {
        String[] compArray = shortURL.split("/");
        String convertedKey = compArray[compArray.length - 1];
        return KeyConverter.getRequestKey(convertedKey);
    }

    public boolean isValidURL(String url) {
        return url.matches("^https?:\\/\\/(?:www.)?[-a-zA-Z\\d@:%._\\+~#=]{1,256}" +
                "\\.[a-zA-Z\\d9()]{1,6}\\b(?:[-a-zA-Z\\d@:%._\\+.~#?&\\/=]*)$");
    }
}
