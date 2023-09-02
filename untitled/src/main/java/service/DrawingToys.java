package service;

import model.Toys;

import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class DrawingToys implements DrawingService{

    @Override
    public Integer GetWeightedRandom(List<Toys> toysList) {
        Random random = new Random();
        int totalWeight = 0;
        int partSum = 0;
        int rndMemberId;
        int winIdToy = 0;
        for (Toys toys : toysList) {
            totalWeight += toys.getChanceToWin();
        }
        rndMemberId = random.nextInt(1, totalWeight+1);
        for (Toys toys : toysList) {
            partSum += toys.getChanceToWin();
            if (rndMemberId < partSum) {
                winIdToy = toys.getId();
                toys.setCount(toys.getCount() - 1);
                return winIdToy;
            }
        }
        return winIdToy;
    }

    @Override
    public void updateChanceToWin(List<Toys> toysList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id игрушки у которой хотите изменить шансы выпадения: ");
        int newId = scanner.nextInt();
        System.out.println("Введите новый шанс выпадения игрушки: ");
        int newChanceToWin = scanner.nextInt();
        for (Toys toys : toysList) {
            if (newId == toys.getId()) {
                toys.setChanceToWin(newChanceToWin);
                break;
            }
        }
    }
}
