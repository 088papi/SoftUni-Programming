package logger.model.loggers;

import logger.api.Appender;
import logger.api.Layout;
import logger.api.Logger;
import logger.enums.ReportLevel;
import logger.model.loggers.MessageLogger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;



public class MessageLogger implements Logger {
    private Appender[] appenders;

    public MessageLogger(Appender... appenders) {
    this.appenders = new Appender[appenders.length];
    System.arraycopy(appenders, 0, this.appenders, 0, appenders.length);
    }

    @Override
    public void logInfo(String dateTime, String message) {
        this.logMessage(dateTime, ReportLevel.INFO,message);
    }

    @Override
    public void logWarning(String dateTime, String message) {
        this.logMessage(dateTime,ReportLevel.WARNING,message);
    }

    @Override
    public void logError(String dateTime, String message) {
        this.logMessage(dateTime, ReportLevel.ERROR,message);
    }

    @Override
    public void logCritical(String dateTime, String message) {
        this.logMessage(dateTime,ReportLevel.CRITICAL,message);
    }

    @Override
    public void logFatal(String dateTime, String message) {
        this.logMessage(dateTime,ReportLevel.FATAL,message);
    }

    private void logMessage(String dateTime, ReportLevel reportLevel, String message){
        for (Appender appender : this.appenders) {
           appender.appendMessage(dateTime,reportLevel,message);
        }
    }
    @Override
    public String getLogInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("Logger info")
                .append(System.lineSeparator());
        for (Appender appender : this.appenders) {
            stringBuilder.append(appender).append(System.lineSeparator());
        }

        return stringBuilder.toString().trim();
    }
}
