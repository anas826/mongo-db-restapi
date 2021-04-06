package mongodbfirst.Mongo_db.api.repository;

import mongodbfirst.Mongo_db.api.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer> {
}
