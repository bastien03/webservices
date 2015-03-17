package bastien03.api;

import bastien03.domain.Author;
import bastien03.domain.Book;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.stereotype.Component;


@Component
public class AuthorResourceProcessor implements ResourceProcessor<Resource<Author>>{

    @Value("${server.port}")
    int port;

    @Override
    public Resource<Author> process(Resource<Author> resource) {
        Link link = new Link("http://localhost:"+
                port+
                "/books/search/findByAuthorId?authorId=" + resource.getContent().getId(), "books");
        resource.add(link);
        return resource;
    }

}
