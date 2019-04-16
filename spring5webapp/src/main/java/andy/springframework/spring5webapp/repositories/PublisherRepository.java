package andy.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import andy.springframework.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
