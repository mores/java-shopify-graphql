package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MediaImageOriginalSource {
  
  private Integer fileSize;

  
  private String url;

  public MediaImageOriginalSource() {
  }

  
  public Integer getFileSize() {
    return fileSize;
  }

  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }

  
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "MediaImageOriginalSource{fileSize='" + fileSize + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MediaImageOriginalSource that = (MediaImageOriginalSource) o;
    return Objects.equals(fileSize, that.fileSize) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSize, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Integer fileSize;

    
    private String url;

    public MediaImageOriginalSource build() {
      MediaImageOriginalSource result = new MediaImageOriginalSource();
      result.fileSize = this.fileSize;
      result.url = this.url;
      return result;
    }

    
    public Builder fileSize(Integer fileSize) {
      this.fileSize = fileSize;
      return this;
    }

    
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
