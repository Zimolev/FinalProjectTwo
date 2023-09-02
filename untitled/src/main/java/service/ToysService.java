package service;

import model.Toys;

import java.util.ArrayList;
import java.util.List;

public class ToysService implements DataService{
    private List<Toys> toysList = new ArrayList<>();


    @Override
    public void create(String titleToy, Integer count, Integer chanceToWin) {
        int lastId = getId();
        Toys toy = new Toys(lastId, titleToy, count, chanceToWin);
        toysList.add(toy);
    }

    private int getId() {
        int count = 0;
        for (Toys toys : toysList) count++;
        return ++count;
    }

    @Override
    public List<Toys> read() {
        return toysList;
    }
}
