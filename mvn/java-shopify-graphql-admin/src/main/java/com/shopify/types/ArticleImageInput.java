package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ArticleImageInput {
  
  private String altText;

  
  private String url;

  public ArticleImageInput() {
  }

  
  public String getAltText() {
    return altText;
  }

  public void setAltText(String altText) {
    this.altText = altText;
  }

  
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "ArticleImageInput{altText='" + altText + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ArticleImageInput that = (ArticleImageInput) o;
    return Objects.equals(altText, that.altText) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(altText, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String altText;

    
    private String url;

    public ArticleImageInput build() {
      ArticleImageInput result = new ArticleImageInput();
      result.altText = this.altText;
      result.url = this.url;
      return result;
    }

    
    public Builder altText(String altText) {
      this.altText = altText;
      return this;
    }

    
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
