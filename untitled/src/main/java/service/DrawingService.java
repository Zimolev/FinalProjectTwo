package service;

import model.Toys;

import java.util.List;

public interface DrawingService {
    Integer GetWeightedRandom(List<Toys> toysList);
    void updateChanceToWin(List<Toys> toysList);
}
