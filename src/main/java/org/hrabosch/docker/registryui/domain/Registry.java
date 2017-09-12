package org.hrabosch.docker.registryui.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.boot.autoconfigure.web.ResourceProperties.Strategy;

/**
 * File description
 *
 * @author hrabosch
 */
@Entity
public class Registry {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String name;
  private String uri;
  private String description;
  private Integer imageCount;

  public Registry() {}

  public Registry(String name, String uri, String description) {
    this.name = name;
    this.uri = uri;
    this.description = description;
    this.imageCount = 0;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getImageCount() {
    return imageCount;
  }

  public void setImageCount(Integer imageCount) {
    this.imageCount = imageCount;
  }
}
