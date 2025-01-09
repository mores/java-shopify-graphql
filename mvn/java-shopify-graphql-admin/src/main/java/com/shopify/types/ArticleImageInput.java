package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for an image associated with an article.
 */
public class ArticleImageInput {
  /**
   * A word or phrase to share the nature or contents of an image.
   */
  private String altText;

  /**
   * The URL of the image.
   */
  private String url;

  public ArticleImageInput() {
  }

  /**
   * A word or phrase to share the nature or contents of an image.
   */
  public String getAltText() {
    return altText;
  }

  public void setAltText(String altText) {
    this.altText = altText;
  }

  /**
   * The URL of the image.
   */
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
    /**
     * A word or phrase to share the nature or contents of an image.
     */
    private String altText;

    /**
     * The URL of the image.
     */
    private String url;

    public ArticleImageInput build() {
      ArticleImageInput result = new ArticleImageInput();
      result.altText = this.altText;
      result.url = this.url;
      return result;
    }

    /**
     * A word or phrase to share the nature or contents of an image.
     */
    public Builder altText(String altText) {
      this.altText = altText;
      return this;
    }

    /**
     * The URL of the image.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
