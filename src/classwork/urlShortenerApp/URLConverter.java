package classwork.urlShortenerApp;

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

    public String getURL(Integer key) {
        return urlMaps.get(key);
    }

    public String getShortURL(String convertedKey) {
        return "https://myurl.me/" + convertedKey;
    }

    public String getConvertedKey(Integer requestKey) {
        return KeyConverter.convertRequestKey(requestKey);
    }

    public Integer getKey(String convertedKey) {
        return KeyConverter.getRequestKey(convertedKey);
    }


    public boolean isValidURL(String url) {
        return url.matches("^https?:\\/\\/(?:www.)?[-a-zA-Z\\d@:%._\\+~#=]{1,256}" +
                "\\.[a-zA-Z\\d9()]{1,6}\\b(?:[-a-zA-Z\\d@:%._\\+.~#?&\\/=]*)$");
    }
}
