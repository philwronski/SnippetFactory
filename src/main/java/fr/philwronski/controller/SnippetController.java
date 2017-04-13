package fr.philwronski.controller;

import fr.philwronski.entity.Snippet;
import fr.philwronski.service.SnippetService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by p.wronski on 12/04/2017.
 */
@RestController
@RequestMapping(value = "/snippets")
public class SnippetController {

  @Autowired
  SnippetService snippetService;

  @RequestMapping(value = "", method = RequestMethod.GET)
  public ResponseEntity<List<Snippet>> findAll() {
    List<Snippet> snippets = snippetService.findAll();
    if(!CollectionUtils.isEmpty(snippets)) {
      return new ResponseEntity<List<Snippet>>(snippets, HttpStatus.OK);
    }
    return new ResponseEntity<List<Snippet>>(new ArrayList<Snippet>(), HttpStatus.NO_CONTENT);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public ResponseEntity<Snippet> findOne(@PathVariable(value = "id", required = true) ObjectId id) {
    Snippet snippet = snippetService.findOne(id);
//   new String(snippet.getFiles().get(0).getData().getData());
    if(snippet != null) {
      return new ResponseEntity<Snippet>(snippet, HttpStatus.OK);
    }
    return new ResponseEntity<Snippet>(snippet, HttpStatus.NO_CONTENT);
  }

}
