package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class OnlineStoreThemeFile {
  
  private OnlineStoreThemeFileBody body;

  
  private String checksumMd5;

  
  private String contentType;

  
  private OffsetDateTime createdAt;

  
  private String filename;

  
  private String size;

  
  private OffsetDateTime updatedAt;

  public OnlineStoreThemeFile() {
  }

  
  public OnlineStoreThemeFileBody getBody() {
    return body;
  }

  public void setBody(OnlineStoreThemeFileBody body) {
    this.body = body;
  }

  
  public String getChecksumMd5() {
    return checksumMd5;
  }

  public void setChecksumMd5(String checksumMd5) {
    this.checksumMd5 = checksumMd5;
  }

  
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "OnlineStoreThemeFile{body='" + body + "', checksumMd5='" + checksumMd5 + "', contentType='" + contentType + "', createdAt='" + createdAt + "', filename='" + filename + "', size='" + size + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OnlineStoreThemeFile that = (OnlineStoreThemeFile) o;
    return Objects.equals(body, that.body) &&
        Objects.equals(checksumMd5, that.checksumMd5) &&
        Objects.equals(contentType, that.contentType) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(filename, that.filename) &&
        Objects.equals(size, that.size) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, checksumMd5, contentType, createdAt, filename, size, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private OnlineStoreThemeFileBody body;

    
    private String checksumMd5;

    
    private String contentType;

    
    private OffsetDateTime createdAt;

    
    private String filename;

    
    private String size;

    
    private OffsetDateTime updatedAt;

    public OnlineStoreThemeFile build() {
      OnlineStoreThemeFile result = new OnlineStoreThemeFile();
      result.body = this.body;
      result.checksumMd5 = this.checksumMd5;
      result.contentType = this.contentType;
      result.createdAt = this.createdAt;
      result.filename = this.filename;
      result.size = this.size;
      result.updatedAt = this.updatedAt;
      return result;
    }

    
    public Builder body(OnlineStoreThemeFileBody body) {
      this.body = body;
      return this;
    }

    
    public Builder checksumMd5(String checksumMd5) {
      this.checksumMd5 = checksumMd5;
      return this;
    }

    
    public Builder contentType(String contentType) {
      this.contentType = contentType;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder filename(String filename) {
      this.filename = filename;
      return this;
    }

    
    public Builder size(String size) {
      this.size = size;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
