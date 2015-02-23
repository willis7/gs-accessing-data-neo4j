package hello;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by willis7 on 23/02/15.
 */
public interface PersonRepository extends CrudRepository<Person, String> {

    Person findByName(String name);

    Iterable<Person> findByTeammatesName(String name);
}
