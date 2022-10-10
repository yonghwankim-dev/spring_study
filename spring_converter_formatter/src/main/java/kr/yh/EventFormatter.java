package kr.yh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;


public class EventFormatter implements Formatter<Event> {

    // 1. 문자를 받아서 객체로
    @Override
    public Event parse(String text, Locale locale) throws ParseException {
        return new Event(Integer.parseInt(text));
    }

    // 2. 객체를 문자열로
    @Override
    public String print(Event object, Locale locale) {
        return object.getId().toString();
    }
}
