package com.cox.interview.service;


import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
public class DatasetService {

    public String createDataset(String datasetId){
        try {
            File targetFile = new File(datasetId + ".json");
            boolean success = targetFile.createNewFile();
            System.out.println("file created:  "+success);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return datasetId;

    }
}
