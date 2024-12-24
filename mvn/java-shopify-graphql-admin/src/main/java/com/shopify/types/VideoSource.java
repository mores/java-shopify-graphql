package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class VideoSource {
  
  private Integer fileSize;

  
  private String format;

  
  private int height;

  
  private String mimeType;

  
  private String url;

  
  private int width;

  public VideoSource() {
  }

  
  public Integer getFileSize() {
    return fileSize;
  }

  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }

  
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  
  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
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

  
  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  @Override
  public String toString() {
    return "VideoSource{fileSize='" + fileSize + "', format='" + format + "', height='" + height + "', mimeType='" + mimeType + "', url='" + url + "', width='" + width + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VideoSource that = (VideoSource) o;
    return Objects.equals(fileSize, that.fileSize) &&
        Objects.equals(format, that.format) &&
        height == that.height &&
        Objects.equals(mimeType, that.mimeType) &&
        Objects.equals(url, that.url) &&
        width == that.width;
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSize, format, height, mimeType, url, width);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Integer fileSize;

    
    private String format;

    
    private int height;

    
    private String mimeType;

    
    private String url;

    
    private int width;

    public VideoSource build() {
      VideoSource result = new VideoSource();
      result.fileSize = this.fileSize;
      result.format = this.format;
      result.height = this.height;
      result.mimeType = this.mimeType;
      result.url = this.url;
      result.width = this.width;
      return result;
    }

    
    public Builder fileSize(Integer fileSize) {
      this.fileSize = fileSize;
      return this;
    }

    
    public Builder format(String format) {
      this.format = format;
      return this;
    }

    
    public Builder height(int height) {
      this.height = height;
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

    
    public Builder width(int width) {
      this.width = width;
      return this;
    }
  }
}
