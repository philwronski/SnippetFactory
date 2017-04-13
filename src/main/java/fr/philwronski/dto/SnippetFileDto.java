package fr.philwronski.dto;

import fr.philwronski.enumeration.ProgrammingLanguageEnum;
import lombok.Data;
import org.bson.types.Binary;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by p.wronski on 13/04/2017.
 */
@Data
public class SnippetFileDto {

  private String fileName;

  private ProgrammingLanguageEnum programmingLanguage;

  private Binary data;

}
