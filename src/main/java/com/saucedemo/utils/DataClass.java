package com.saucedemo.utils;

import org.testng.annotations.DataProvider;

import java.io.File;
import java.util.Iterator;

public class DataClass {

    private FileOperations fileOperations = new FileOperations();
    private static final String csvFile =
            "src" + File.separator +
            "test" + File.separator +
            "resources" + File.separator +
            "dataLogin.csv";

    @DataProvider(name="dataLogin")
    public Iterator<Object[]> data() {
        return fileOperations.parseCsvData(csvFile);
    }
}