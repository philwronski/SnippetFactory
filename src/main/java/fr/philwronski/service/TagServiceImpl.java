package fr.philwronski.service;

import fr.philwronski.entity.Tag;
import fr.philwronski.repository.TagRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by p.wronski on 12/04/2017.
 */
@Service
public class TagServiceImpl implements TagService {

  @Autowired
  TagRepository tagRepository;

  @Override
  public List<Tag> findAll() {
    return tagRepository.findAll();
  }

  @Override
  public Tag findOne(ObjectId id) {
    return tagRepository.findOne(id);
  }

  @Override
  public Tag findByKey(String key) {
    return tagRepository.findByKey(key);
  }

  @Override
  public Tag save(Tag tag) {
    return tagRepository.save(tag);
  }
}
