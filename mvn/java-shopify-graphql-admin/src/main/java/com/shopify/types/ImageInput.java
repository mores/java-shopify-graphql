package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ImageInput {
  
  private String id;

  
  private String altText;

  
  private String src;

  public ImageInput() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getAltText() {
    return altText;
  }

  public void setAltText(String altText) {
    this.altText = altText;
  }

  
  public String getSrc() {
    return src;
  }

  public void setSrc(String src) {
    this.src = src;
  }

  @Override
  public String toString() {
    return "ImageInput{id='" + id + "', altText='" + altText + "', src='" + src + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ImageInput that = (ImageInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(altText, that.altText) &&
        Objects.equals(src, that.src);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, altText, src);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private String altText;

    
    private String src;

    public ImageInput build() {
      ImageInput result = new ImageInput();
      result.id = this.id;
      result.altText = this.altText;
      result.src = this.src;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder altText(String altText) {
      this.altText = altText;
      return this;
    }

    
    public Builder src(String src) {
      this.src = src;
      return this;
    }
  }
}
