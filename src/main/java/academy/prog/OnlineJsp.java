package academy.prog;

import java.util.ArrayList;

public class OnlineJsp {
    private String[] s;

    public OnlineJsp (ArrayList<String> a) {
        int v = a.size();
        s = new String[v];
         for (int i = 0; i < v; i++) {
             s[i] = a.get(i);
         }
    }
}
