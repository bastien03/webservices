package bastien03.api.rest;

import bastien03.api.rest.dto.BookWithAuthorDto;
import bastien03.domain.Book;
import bastien03.service.BooksAuthorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
public class BooksAuthorController {

    @Autowired
    private BooksAuthorsService booksAuthorsService;

    @RequestMapping(value="/xxx", method = RequestMethod.GET)
    @ResponseBody
    public List<BookWithAuthorDto> get() {
        return booksAuthorsService.getAllBooksWithAuthors();
    }
}
