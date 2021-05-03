package domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

@DisplayName("기록")
public class RecordTest {

    public Record createRecord(int maxDistance) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(NameTest.STUDY, new Distance(maxDistance)));
        cars.add(new Car("povi"));
        return new Record(cars);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4})
    @DisplayName("최대 거리 확인")
    public void maxDistanceTest(int inputDistance) throws Exception {
        Record record = createRecord(inputDistance);
        int maxDistance = record.maxDistance();
        assertThat(maxDistance).isEqualTo(inputDistance);
    }

    @Test
    @DisplayName("우승자 확인")
    public void winnersTest() throws Exception {
        Record record = createRecord(1);
        List<Car> winners = record.winners();
        assertThat(winners.get(0).name().value()).isEqualTo(NameTest.STUDY.value());
    }
}
