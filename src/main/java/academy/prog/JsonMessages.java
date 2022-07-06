package academy.prog;

import java.util.ArrayList;
import java.util.List;

public class JsonMessages {
    private final List<Message> list = new ArrayList<>();

    public JsonMessages(List<Message> sourceList, int fromIndex, String forName) {
        for (int i = fromIndex; i < sourceList.size(); i++) {
            if (sourceList.get(i).getTo() != null && sourceList.get(i).getTo().equals(forName)) {
                list.add(sourceList.get(i));
            } else if (sourceList.get(i).getTo() == null) {
                list.add(sourceList.get(i));
            } else {
                list.add(new Message("nope", "nope"));
            }

            //list.add(sourceList.get(i));
        }
    }
}
