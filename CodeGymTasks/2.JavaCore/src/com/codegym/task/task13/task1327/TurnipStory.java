package com.codegym.task.task13.task1327;

import java.util.Collections;
import java.util.List;

public class TurnipStory {
    static void tell(List<Person> items) {
        Collections.reverse(items);
        Person first;
        Person second;
        for (int i = 0; i < items.size()-1; i++) {
            first = items.get(i);
            second = items.get(i+1);
            first.pull(second);
        }
    }
}
