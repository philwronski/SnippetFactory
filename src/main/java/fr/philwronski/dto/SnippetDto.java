package fr.philwronski.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import fr.philwronski.entity.SnippetFile;
import fr.philwronski.entity.Tag;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * Created by p.wronski on 13/04/2017.
 */
@Data
public class SnippetDto {

  @JsonSerialize(using = ToStringSerializer.class)
  private ObjectId id;

  private String title;

  private String description;

  private List<SnippetFileDto> files;

  private boolean privateAccess;

  private List<TagDto> tags;

}
