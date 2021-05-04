package controller;

import domain.Cars;
import domain.Records;
import domain.Round;
import service.RacingService;
import view.InputView;
import view.ResultView;

public class RacingController {
    private InputView inputView;
    private ResultView resultView;
    private RacingService racingService;

    public RacingController() {
        this.inputView = new InputView();
        this.resultView = new ResultView();
        this.racingService = new RacingService();
    }

    public void run() {
        Cars cars = inputView.inputCars();
        Round round = inputView.inputRound();

        Records records = racingService.play(cars, round);

        resultView.printRaceBoard(records);
    }
}
