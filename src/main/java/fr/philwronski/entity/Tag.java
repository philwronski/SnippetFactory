package fr.philwronski.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import fr.philwronski.enumeration.TagCategoryEnum;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by p.wronski on 12/04/2017.
 */
@Data
@Document(collection = "tags")
public class Tag {

  @Id
  private ObjectId id;

  @Field(value = "key")
  private String key;

  @Field(value = "category")
  private TagCategoryEnum category;

}
