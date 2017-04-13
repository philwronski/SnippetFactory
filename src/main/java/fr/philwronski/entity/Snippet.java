package fr.philwronski.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * Created by p.wronski on 12/04/2017.
 */
@Data
@Document(collection = "snippets")
public class Snippet {

  @JsonSerialize(using = ToStringSerializer.class)
  @Id
  private ObjectId id;

  @Field(value = "title")
  private String title;

  @Field(value = "description")
  private String description;

  @Field(value = "files")
  private List<SnippetFile> files;

  @Field(value = "private_access")
  private boolean privateAccess;

  @Field(value = "tags")
  private List<Tag> tags;

}
