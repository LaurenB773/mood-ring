package com.example;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    /*
    Responsible for setting file path and writing to the file
     */

    private static LocalDateTime today = LocalDateTime.now();
    private static DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
    private File moodLog;

    public Logger() {

    }

    //takes in a file path to set log location
    public void setMoodLog(String filePath) {
        //create file object with filePath
        moodLog = new File(filePath);
    }

    //prints to the log
    public void logger(String moodText) {

        //open file for appending and open writer to add string
        try (FileOutputStream outputStream = new FileOutputStream(moodLog, true);
             PrintWriter printWriter = new PrintWriter(outputStream)) {

            //add current date
            String formattedDate = today.format(format);
            printWriter.println(formattedDate);

            //add string built off of gathered user input | separated
            printWriter.println(moodText);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
