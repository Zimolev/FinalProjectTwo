package service;

import model.Toys;

import java.util.List;

public interface DataService {
    void create(String titleToy, Integer count, Integer chanceToWin);
    List<Toys> read();
}
