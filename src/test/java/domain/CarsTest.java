package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

@DisplayName("자동차들")
public class CarsTest {

    @ParameterizedTest
    @CsvSource(value = {"povi:1", "povi,study:2", "povi,study,loop:3"}, delimiter = ':')
    @DisplayName("입력된 이름만큼 자동차 생성")
    public void createCarsTest(String inputText, int carCount) throws Exception {
        Cars cars = new Cars(inputText);

        assertThat(cars.cars().size()).isEqualTo(carCount);
    }
}
