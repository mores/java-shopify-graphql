package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CommentEventAttachment {
  
  private String fileExtension;

  
  private String id;

  
  private Image image;

  
  private String name;

  
  private int size;

  
  private String url;

  public CommentEventAttachment() {
  }

  
  public String getFileExtension() {
    return fileExtension;
  }

  public void setFileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "CommentEventAttachment{fileExtension='" + fileExtension + "', id='" + id + "', image='" + image + "', name='" + name + "', size='" + size + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CommentEventAttachment that = (CommentEventAttachment) o;
    return Objects.equals(fileExtension, that.fileExtension) &&
        Objects.equals(id, that.id) &&
        Objects.equals(image, that.image) &&
        Objects.equals(name, that.name) &&
        size == that.size &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileExtension, id, image, name, size, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String fileExtension;

    
    private String id;

    
    private Image image;

    
    private String name;

    
    private int size;

    
    private String url;

    public CommentEventAttachment build() {
      CommentEventAttachment result = new CommentEventAttachment();
      result.fileExtension = this.fileExtension;
      result.id = this.id;
      result.image = this.image;
      result.name = this.name;
      result.size = this.size;
      result.url = this.url;
      return result;
    }

    
    public Builder fileExtension(String fileExtension) {
      this.fileExtension = fileExtension;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder image(Image image) {
      this.image = image;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder size(int size) {
      this.size = size;
      return this;
    }

    
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
