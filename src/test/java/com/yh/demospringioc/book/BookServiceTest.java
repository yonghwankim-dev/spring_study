package com.yh.demospringioc.book;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import com.yh.demospringioc.book.Book;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @Test
    public void save(){
        //given
        Book book = new Book();

        // save라는 메서드가 호출되면 book 인스턴스를 반환하라는 의미
        when(bookRepository.save(book)).thenReturn(book);
        BookService bookService = new BookService(bookRepository);

        //when
        Book result = bookService.save(book);

        //then
        assertThat(book.getCreated()).isNotNull();
        assertThat(book.getBookStatus()).isEqualTo(BookStatus.DRAFT);
        assertThat(result).isNotNull();

    }
}