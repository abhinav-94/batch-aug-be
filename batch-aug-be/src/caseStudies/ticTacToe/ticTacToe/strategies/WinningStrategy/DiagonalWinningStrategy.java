package caseStudies.ticTacToe.strategies.WinningStrategy;

import caseStudies.ticTacToe.models.Board;
import caseStudies.ticTacToe.models.Move;

public class DiagonalWinningStrategy implements WinningStrategy{

    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}
