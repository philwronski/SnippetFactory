package fr.philwronski.repository;

import fr.philwronski.entity.Snippet;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by p.wronski on 12/04/2017.
 */
public interface SnippetRepository extends MongoRepository<Snippet, ObjectId> {



}
