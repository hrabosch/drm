package org.hrabosch.docker.registryui.domain;

/**
 * File description
 *
 * @author hrabosch
 */
public class DockerRegistry {

  private String name;

  private int imagesCount;

  public DockerRegistry(String name, int imagesCount) {
    this.name = name;
    this.imagesCount = imagesCount;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getImagesCount() {
    return imagesCount;
  }

  public void setImagesCount(int imagesCount) {
    this.imagesCount = imagesCount;
  }
}
