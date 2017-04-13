package fr.philwronski.enumeration;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by p.wronski on 12/04/2017.
 */
public enum TagCategoryEnum {
  PROGRAMMING_LANGUAGE("tags.category.programming-language"),
  DEVELOPMENT_TOOL("tags.category.development-tool"),
  FRAMEWORK("tags.category.framework");

  private String key;

  public static final Map<String, TagCategoryEnum> LIST_TAG_CATEGORIES = new LinkedHashMap<>();

  static {
    for (TagCategoryEnum current : TagCategoryEnum.values() ) {
      LIST_TAG_CATEGORIES.put(current.name(), current);
    }
  }

  TagCategoryEnum(String key) {
    this.key = key;
  }

  @JsonValue
  public String getKey() {
    return key;
  }
}
