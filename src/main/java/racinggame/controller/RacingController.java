package racinggame.controller;

import racinggame.domain.Cars;
import racinggame.domain.MoveStrategy;
import racinggame.ui.InputView;
import racinggame.ui.OutputView;

public class RacingController {
    private InputView inputView;
    private OutputView outputView;

    public RacingController() {
        inputView = new InputView();
        outputView = new OutputView();
    }

    public void run() {
        Cars cars = new Cars(inputView.inputCarNames(), new MoveStrategy());
    }
}
