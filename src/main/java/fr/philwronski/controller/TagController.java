package fr.philwronski.controller;

import fr.philwronski.entity.Tag;
import fr.philwronski.service.TagService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by p.wronski on 12/04/2017.
 */
@RestController
@RequestMapping(value = "/tags")
public class TagController extends BackEndController {

  @Autowired
  TagService tagService;

  @RequestMapping(value = "", method = RequestMethod.GET, consumes = API_V1)
  public ResponseEntity<List<Tag>> getTags() {
    List<Tag> tags = tagService.findAll();

    if(!CollectionUtils.isEmpty(tags)) {
      return new ResponseEntity<List<Tag>>(tags, getHeaders(API_V1), HttpStatus.OK);
    }
    return new ResponseEntity<List<Tag>>(new ArrayList<Tag>(), getHeaders(API_V1), HttpStatus.NO_CONTENT);
  }

  /** Exemple d'utilisation d'une v2 */
  @RequestMapping(value = "", method = RequestMethod.GET, consumes = API_V2)
  public ResponseEntity<String> getTagsV2() {
    return new ResponseEntity<String>("super", getHeaders(API_V2), HttpStatus.OK);
  }

  @RequestMapping(value = "", method = RequestMethod.POST)
  public ResponseEntity<Tag> addTag(@RequestBody(required = true) Tag tag) {
    Tag newTag = tagService.save(tag);

    if(newTag != null) {
      return new ResponseEntity<>(newTag, HttpStatus.CREATED);
    }

    return new ResponseEntity<>(newTag, HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public ResponseEntity<Tag> findOne(@PathVariable(value = "id", required = true) ObjectId id) {
    Tag tag = tagService.findOne(id);

    if(tag != null) {
      return new ResponseEntity<>(tag, HttpStatus.OK);
    }

    return new ResponseEntity<>(tag, HttpStatus.NO_CONTENT);
  }

  @RequestMapping(value = "/key/{key:.+}", method = RequestMethod.GET)
  public ResponseEntity<Tag> findOne(@PathVariable(value = "key", required = true) String key) {
    Tag tag = tagService.findByKey(key);

    if(tag != null) {
      return new ResponseEntity<>(tag, HttpStatus.OK);
    }

    return new ResponseEntity<>(tag, HttpStatus.NO_CONTENT);
  }
}
