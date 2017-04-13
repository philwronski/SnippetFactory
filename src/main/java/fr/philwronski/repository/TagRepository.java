package fr.philwronski.repository;

import fr.philwronski.entity.Tag;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by p.wronski on 12/04/2017.
 */
@Repository
public interface TagRepository extends MongoRepository<Tag, ObjectId> {

  public Tag findByKey(String key);

}
