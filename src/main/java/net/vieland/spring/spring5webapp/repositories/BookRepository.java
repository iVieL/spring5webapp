package net.vieland.spring.spring5webapp.repositories;

import net.vieland.spring.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
