package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;
import java.util.Objects;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        if (o1.getId() > o2.getId()) {
            return 1;
        } else if (Objects.equals(o1.getId(), o2.getId())) {
            return 0;
        }
        return -1;
    }
}
