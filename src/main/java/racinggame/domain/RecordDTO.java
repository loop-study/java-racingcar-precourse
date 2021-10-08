package racinggame.domain;

public class RecordDTO {
    Cars record;

    public RecordDTO(Cars record) {
        this.record = record;
    }

    public Cars getRecord() {
        return record;
    }
}
