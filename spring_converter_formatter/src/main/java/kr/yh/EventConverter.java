package kr.yh;


import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


public class EventConverter{

    // sprnigboot에서는 빈으로 등록하면 ConversionService에서 빈으로 등록한다.
    // conversionService에 빈으로 등록되면 WebConfig 클래스에서 따로 등록할 필요가 없음
    @Component
    public static class StringToEventConverter implements Converter<String, Event>{
        @Override
        public Event convert(String source) {
            return new Event(Integer.parseInt(source));
        }
    }

    @Component
    public static class EventToStringConverter implements Converter<Event, String>{
        @Override
        public String convert(Event source) {
            return source.getId().toString();
        }
    }
}
