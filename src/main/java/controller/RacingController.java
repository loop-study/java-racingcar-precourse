package controller;

import domain.Cars;
import domain.Records;
import domain.Round;
import service.RacingGame;
import view.InputView;
import view.ResultView;

public class RacingController {
    private InputView inputView;
    private ResultView resultView;
    private RacingGame racingGame;

    public RacingController() {
        this.inputView = new InputView();
        this.resultView = new ResultView();
        this.racingGame = new RacingGame();
    }

    public void run() {
        Cars cars = inputView.inputCars();
        Round round = inputView.inputRound();

        Records records = racingGame.play(cars, round);

        resultView.printRaceBoard(records);
    }
}
