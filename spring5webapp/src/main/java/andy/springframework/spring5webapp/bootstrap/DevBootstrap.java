package andy.springframework.spring5webapp.bootstrap;

import andy.springframework.spring5webapp.model.Author;
import andy.springframework.spring5webapp.model.Book;
import andy.springframework.spring5webapp.model.Publisher;
import andy.springframework.spring5webapp.repositories.AuthorRepository;
import andy.springframework.spring5webapp.repositories.BookRepository;
import andy.springframework.spring5webapp.repositories.PublisherRepository;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{
	
	private AuthorRepository authorRepository;
	private BookRepository bookRespository;
	private PublisherRepository publisherRepository;



	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRespository,
			PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRespository = bookRespository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		initDate();
	}
	
	private void initDate() {
		
		Publisher publisher = new Publisher();
		publisher.setName("foo");
		
		publisherRepository.save(publisher);
		
		//Eric
        Author eric = new Author("Eric", "Evans");
        Book  ddd = new Book("Domain Driven Design", "1234", publisher);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        
        authorRepository.save(eric);
        bookRespository.save(ddd);
        
		
        //Rod
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "23444", publisher);
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        
        authorRepository.save(rod);
        bookRespository.save(noEJB);
	}



}
