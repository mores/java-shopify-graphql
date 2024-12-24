package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class Model3dSource {
  
  private int filesize;

  
  private String format;

  
  private String mimeType;

  
  private String url;

  public Model3dSource() {
  }

  
  public int getFilesize() {
    return filesize;
  }

  public void setFilesize(int filesize) {
    this.filesize = filesize;
  }

  
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "Model3dSource{filesize='" + filesize + "', format='" + format + "', mimeType='" + mimeType + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Model3dSource that = (Model3dSource) o;
    return filesize == that.filesize &&
        Objects.equals(format, that.format) &&
        Objects.equals(mimeType, that.mimeType) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filesize, format, mimeType, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private int filesize;

    
    private String format;

    
    private String mimeType;

    
    private String url;

    public Model3dSource build() {
      Model3dSource result = new Model3dSource();
      result.filesize = this.filesize;
      result.format = this.format;
      result.mimeType = this.mimeType;
      result.url = this.url;
      return result;
    }

    
    public Builder filesize(int filesize) {
      this.filesize = filesize;
      return this;
    }

    
    public Builder format(String format) {
      this.format = format;
      return this;
    }

    
    public Builder mimeType(String mimeType) {
      this.mimeType = mimeType;
      return this;
    }

    
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
