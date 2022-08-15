package com.yh.spring_applicationcontext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class BookService {

    // 주입 방법3 : @Autowired 어노테이션
    @Autowired
    BookRepository bookRepository;

    // 주입 방법1 : 생성자
    public BookService() {
    }
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public BookRepository getBookRepository() {
        return bookRepository;
    }

    // 주입 방법2 : setter 메서드
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
