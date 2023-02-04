package com.files;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        System.out.println("Hello, choose an option:");
        System.out.println("1) Dubai");
        System.out.println("2) Turkey");
        System.out.println("3) Nailang");
        System.out.println("4) MUmbai");
        System.out.println("5) KAzakhstan");
        System.out.println("6) Exit from app");
        System.out.print("Enter a number to select a function: ");
        choice = scanner.nextInt();
       // while (choice != 4) {
            switch (choice) {
                case 1:
                    try {
                        String filePath = "C:/Users/assboobs/IdeaProjects/ILOVEOOP/src/com/files/City";
                        FileReader reader = new FileReader(filePath);
                        BufferedReader bufferedReader = new BufferedReader(reader);
                        String line = bufferedReader.readLine();
                        while (line != null) {
                            System.out.println(line);
                            line = bufferedReader.readLine();
                        }
                        bufferedReader.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("Error: File not found.");
                    } catch (IOException e) {
                        System.out.println("Error: Unable to read file.");
                    }

                    break;
                case 2:
                    try {
                        String filePath = "C:/Users/assboobs/IdeaProjects/ILOVEOOP/src/com/files/City2";
                        FileReader reader = new FileReader(filePath);
                        BufferedReader bufferedReader = new BufferedReader(reader);
                        String line = bufferedReader.readLine();
                        while (line != null) {
                            System.out.println(line);
                            line = bufferedReader.readLine();
                        }
                        bufferedReader.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("Error: File not found.");
                    } catch (IOException e) {
                        System.out.println("Error: Unable to read file.");
                    }

                    break;

                case 3:
                    try {
                        String filePath = "C:/Users/assboobs/IdeaProjects/ILOVEOOP/src/com/files/City3";
                        FileReader reader = new FileReader(filePath);
                        BufferedReader bufferedReader = new BufferedReader(reader);
                        String line = bufferedReader.readLine();
                        while (line != null) {
                            System.out.println(line);
                            line = bufferedReader.readLine();
                        }
                        bufferedReader.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("Error: File not found.");
                    } catch (IOException e) {
                        System.out.println("Error: Unable to read file.");
                    }

                    break;
            }
        }
    }
//}

