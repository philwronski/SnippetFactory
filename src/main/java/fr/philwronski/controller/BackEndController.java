package fr.philwronski.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.Arrays;

/**
 * Created by p.wronski on 13/04/2017.
 */
public abstract class BackEndController {

  public static final String API_V1 = "application/vnd.snippetfactory.v1+json";
  public static final String API_V2 = "application/vnd.snippetfactory.v2+json";

  public HttpHeaders getHeaders(String api) {
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.valueOf(api));
    headers.setAccept(Arrays.asList(MediaType.valueOf(api)));

    return headers;
  }

}
