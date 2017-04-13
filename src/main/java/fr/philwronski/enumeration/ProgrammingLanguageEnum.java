package fr.philwronski.enumeration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by p.wronski on 13/04/2017.
 */
public enum ProgrammingLanguageEnum {
  //TODO Add color field, add synthaxhighlighter class
  JAVA("programming-language.java"),
  JAVASCRIPT("programming-language.javascript");

  private String key;

  public static final Map<String, ProgrammingLanguageEnum> LIST_PROGRAMMING_LANGUAGES = new LinkedHashMap<>();

  static {
    for (ProgrammingLanguageEnum current : ProgrammingLanguageEnum.values() ) {
      LIST_PROGRAMMING_LANGUAGES.put(current.name(), current);
    }
  }

  ProgrammingLanguageEnum(String key) {
    this.key = key;
  }

  public String getKey() {
    return key;
  }
}
