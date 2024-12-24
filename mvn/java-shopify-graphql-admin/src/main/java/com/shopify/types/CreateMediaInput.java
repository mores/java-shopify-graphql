package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CreateMediaInput {
  
  private String originalSource;

  
  private String alt;

  
  private MediaContentType mediaContentType;

  public CreateMediaInput() {
  }

  
  public String getOriginalSource() {
    return originalSource;
  }

  public void setOriginalSource(String originalSource) {
    this.originalSource = originalSource;
  }

  
  public String getAlt() {
    return alt;
  }

  public void setAlt(String alt) {
    this.alt = alt;
  }

  
  public MediaContentType getMediaContentType() {
    return mediaContentType;
  }

  public void setMediaContentType(MediaContentType mediaContentType) {
    this.mediaContentType = mediaContentType;
  }

  @Override
  public String toString() {
    return "CreateMediaInput{originalSource='" + originalSource + "', alt='" + alt + "', mediaContentType='" + mediaContentType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateMediaInput that = (CreateMediaInput) o;
    return Objects.equals(originalSource, that.originalSource) &&
        Objects.equals(alt, that.alt) &&
        Objects.equals(mediaContentType, that.mediaContentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalSource, alt, mediaContentType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String originalSource;

    
    private String alt;

    
    private MediaContentType mediaContentType;

    public CreateMediaInput build() {
      CreateMediaInput result = new CreateMediaInput();
      result.originalSource = this.originalSource;
      result.alt = this.alt;
      result.mediaContentType = this.mediaContentType;
      return result;
    }

    
    public Builder originalSource(String originalSource) {
      this.originalSource = originalSource;
      return this;
    }

    
    public Builder alt(String alt) {
      this.alt = alt;
      return this;
    }

    
    public Builder mediaContentType(MediaContentType mediaContentType) {
      this.mediaContentType = mediaContentType;
      return this;
    }
  }
}
