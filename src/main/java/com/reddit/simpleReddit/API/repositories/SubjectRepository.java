package com.reddit.simpleReddit.API.repositories;
import com.reddit.simpleReddit.API.models.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends CrudRepository<Subject,Long> {

}
