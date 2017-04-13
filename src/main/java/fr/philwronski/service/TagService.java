package fr.philwronski.service;

import fr.philwronski.entity.Tag;
import org.bson.types.ObjectId;

import java.util.List;

/**
 * Created by p.wronski on 12/04/2017.
 */
public interface TagService {

  public List<Tag> findAll();

  public Tag findOne(ObjectId id);

  public Tag findByKey(String key);

  public Tag save(Tag tag);

}
