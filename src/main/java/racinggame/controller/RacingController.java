package racinggame.controller;

import racinggame.domain.Cars;
import racinggame.domain.MoveStrategy;
import racinggame.domain.Round;
import racinggame.service.RacingService;
import racinggame.ui.InputView;
import racinggame.ui.OutputView;

public class RacingController {
    private InputView inputView;
    private OutputView outputView;
    private RacingService racingService;

    public RacingController() {
        inputView = new InputView();
        outputView = new OutputView();
        racingService = new RacingService();
    }

    public void run() {
        Cars cars = new Cars(inputView.inputCarNames(), new MoveStrategy());
        Round round = new Round(inputView.inputRound());
        racingService.play(cars, round);
    }
}
