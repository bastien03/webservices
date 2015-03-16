package bastien03.api;

import bastien03.domain.Book;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.stereotype.Component;



@Component
public class BookResourceProcessor implements ResourceProcessor<Resource<Book>>{

    @Value("${server.port}")
    int port;

    @Override
    public Resource<Book> process(Resource<Book> resource) {
        Link link = new Link("http://localhost:"+
                port+
                "/authors/" + resource.getContent().getAuthorId(), "author");
        resource.add(link);
        return resource;
    }

}
