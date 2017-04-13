package fr.philwronski.service;

import fr.philwronski.entity.Snippet;
import org.bson.types.ObjectId;

import java.util.List;

/**
 * Created by p.wronski on 12/04/2017.
 */
public interface SnippetService {

  public List<Snippet> findAll();

  public  Snippet findOne(ObjectId id);

}
