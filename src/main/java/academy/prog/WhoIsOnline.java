package academy.prog;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.*;

public class WhoIsOnline {
    private static final WhoIsOnline wio = new WhoIsOnline();
    private final Map<String, Date> check = new HashMap<>();
    private final Gson gson;

    private WhoIsOnline () {
        gson = new GsonBuilder().create();
    }

    public static WhoIsOnline getWio () {
        return wio;
    }
    public synchronized void addName (String s, Date d) {
        check.put(s,d);
    }

    public synchronized String getList (Date t1) {
        ArrayList<String> tt = new ArrayList<>();
        String li = "";
        Set<String> keys = check.keySet();
        for (String s:keys) {
            Date t2 = check.get(s);
            if (t1.getTime() - t2.getTime() < 15000) {
                tt.add(s);
            }
        }
        return gson.toJson(new OnlineJsp(tt));
    }


}
