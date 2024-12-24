package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetaobjectThumbnail {
  
  private File file;

  
  private String hex;

  public MetaobjectThumbnail() {
  }

  
  public File getFile() {
    return file;
  }

  public void setFile(File file) {
    this.file = file;
  }

  
  public String getHex() {
    return hex;
  }

  public void setHex(String hex) {
    this.hex = hex;
  }

  @Override
  public String toString() {
    return "MetaobjectThumbnail{file='" + file + "', hex='" + hex + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectThumbnail that = (MetaobjectThumbnail) o;
    return Objects.equals(file, that.file) &&
        Objects.equals(hex, that.hex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, hex);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private File file;

    
    private String hex;

    public MetaobjectThumbnail build() {
      MetaobjectThumbnail result = new MetaobjectThumbnail();
      result.file = this.file;
      result.hex = this.hex;
      return result;
    }

    
    public Builder file(File file) {
      this.file = file;
      return this;
    }

    
    public Builder hex(String hex) {
      this.hex = hex;
      return this;
    }
  }
}
