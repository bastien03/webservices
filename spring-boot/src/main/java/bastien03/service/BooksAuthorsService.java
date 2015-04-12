package bastien03.service;

import bastien03.api.rest.dto.BookWithAuthorDto;
import bastien03.domain.AuthorRepository;
import bastien03.domain.Book;
import bastien03.domain.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BooksAuthorsService {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;

    public List<BookWithAuthorDto> getAllBooksWithAuthors(){
        List<BookWithAuthorDto> booksWithAuthorDtos = new ArrayList<>();
        Iterable<Book> allBooks = bookRepository.findAll();

        // doing one repository acces per book
        // -> not performant at all but ok for now
        allBooks.forEach(book -> {
            BookWithAuthorDto dto = new BookWithAuthorDto();
            dto.setTitle(book.getTitle());
            dto.setImageUrl(book.getImageUrl());
            dto.setYear(book.getYear());
            dto.setAuthorId(book.getAuthorId());
            dto.setAuthorName(authorRepository.findOne(Long.valueOf(book.getAuthorId())).getName());
            booksWithAuthorDtos.add(dto);
        });

        return booksWithAuthorDtos;
    }
}
