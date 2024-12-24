package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class UpdateMediaInput {
  
  private String id;

  
  private String previewImageSource;

  
  private String alt;

  public UpdateMediaInput() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getPreviewImageSource() {
    return previewImageSource;
  }

  public void setPreviewImageSource(String previewImageSource) {
    this.previewImageSource = previewImageSource;
  }

  
  public String getAlt() {
    return alt;
  }

  public void setAlt(String alt) {
    this.alt = alt;
  }

  @Override
  public String toString() {
    return "UpdateMediaInput{id='" + id + "', previewImageSource='" + previewImageSource + "', alt='" + alt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateMediaInput that = (UpdateMediaInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(previewImageSource, that.previewImageSource) &&
        Objects.equals(alt, that.alt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, previewImageSource, alt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private String previewImageSource;

    
    private String alt;

    public UpdateMediaInput build() {
      UpdateMediaInput result = new UpdateMediaInput();
      result.id = this.id;
      result.previewImageSource = this.previewImageSource;
      result.alt = this.alt;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder previewImageSource(String previewImageSource) {
      this.previewImageSource = previewImageSource;
      return this;
    }

    
    public Builder alt(String alt) {
      this.alt = alt;
      return this;
    }
  }
}
