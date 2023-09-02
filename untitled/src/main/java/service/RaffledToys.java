package service;

import model.Toys;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RaffledToys implements ExportFile{
    private File file;
    @Override
    public void exportToys(List<Toys> toysList) {
        StringBuilder sb = new StringBuilder();
        file = new File("RaffledToys.txt");

        for (Toys toy : toysList) {
            sb.append(toy.getId());
            sb.append(',');
            sb.append(toy.getTitleToy());
        }
        try {
            FileOutputStream bos = new FileOutputStream(file, true);
            if (!sb.isEmpty()) {
                bos.write((sb.toString().getBytes()));
                bos.write("\n".getBytes());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


