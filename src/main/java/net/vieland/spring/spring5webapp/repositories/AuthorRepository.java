package net.vieland.spring.spring5webapp.repositories;

import net.vieland.spring.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
