package com.example.demo.config;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;


import java.text.ParseException;


@Component
public class DateConverter implements Converter<String, Date> {
    Date date;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm");
    @Override
    public Date convert(String source) {
        try {
            date = sdf.parse(source);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;

    }
}
