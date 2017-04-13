package fr.philwronski.entity;

import fr.philwronski.enumeration.ProgrammingLanguageEnum;
import lombok.Data;
import org.bson.types.Binary;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by p.wronski on 13/04/2017.
 */
@Data
public class SnippetFile {

  @Field(value = "file_name")
  private String fileName;

  @Field(value = "programming_language")
  private ProgrammingLanguageEnum programmingLanguage;

  @Field(value = "data")
  private Binary data;

}
