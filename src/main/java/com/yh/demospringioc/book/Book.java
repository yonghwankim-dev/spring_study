package com.yh.demospringioc.book;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Book {
    private Date created;
    private BookStatus bookStatus;
}
