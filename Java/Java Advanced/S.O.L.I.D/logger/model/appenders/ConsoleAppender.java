package logger.model.appenders;


import logger.api.Appender;
import logger.api.Layout;

import logger.model.appenders.BaseAppender;

public class ConsoleAppender extends BaseAppender {

    public ConsoleAppender(Layout layout) {
        super(layout);
    }

    @Override
    public void append(String message) {
        System.out.println(message);
    }
}
