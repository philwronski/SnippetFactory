package fr.philwronski.service;

import fr.philwronski.entity.Snippet;
import fr.philwronski.repository.SnippetRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by p.wronski on 12/04/2017.
 */
@Service
public class SnippetServiceImpl implements SnippetService {

  @Autowired
  SnippetRepository snippetRepository;

  @Override
  public List<Snippet> findAll() {
    return snippetRepository.findAll();
  }

  @Override
  public Snippet findOne(ObjectId id) {
    return snippetRepository.findOne(id);
  }
}
