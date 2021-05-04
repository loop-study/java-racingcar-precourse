package domain;

import java.util.Collections;
import java.util.List;

public class Records {

    private final List<Record> records;

    public Records(List<Record> records) {
        this.records = records;
    }

    public List<Record> records() {
        return Collections.unmodifiableList(records);
    }
}
