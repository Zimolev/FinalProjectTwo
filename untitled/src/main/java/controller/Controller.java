package controller;


import model.Toys;
import service.*;
import view.ToyStoreView;
import view.ViewToys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Controller {
    private final DataService dataService = new ToysService();

    private final ViewToys viewToys = new ViewToys();
    private final DrawingService winToy = new DrawingToys();
    private final ExportFile exportFile = new RaffledToys();

    public void createToy(String titleToy, Integer count, Integer chanceToWin) {
        dataService.create(titleToy, count, chanceToWin);
    }

    public void getToys() {
        List<Toys> toysList = dataService.read();
        for (Toys toy : toysList) viewToys.printConsole(toy);
    }

    public List<Toys> winToys(){
        List<Toys> toysList = dataService.read();
        List<Toys> winToysList = new ArrayList<>();
        int winId = winToy.GetWeightedRandom(toysList);
        for (Toys toy : toysList) {
            if (winId != toy.getId());
            else {
                winToysList.add(toy);
            }
        }
        exportFile.exportToys(winToysList);
        return winToysList;
    }
    public void update(){
        List<Toys> toysList = dataService.read();
        winToy.updateChanceToWin(toysList);
    }
}
