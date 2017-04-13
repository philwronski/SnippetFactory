package fr.philwronski.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import fr.philwronski.enumeration.TagCategoryEnum;
import org.bson.types.ObjectId;

/**
 * Created by p.wronski on 13/04/2017.
 */
public class TagDto {

  @JsonSerialize(using = ToStringSerializer.class)
  private ObjectId id;

  private String key;

  private TagCategoryEnum category;

}
