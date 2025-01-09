package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for SEO information.
 */
public class SEOInput {
  /**
   * SEO title of the product.
   */
  private String title;

  /**
   * SEO description of the product.
   */
  private String description;

  public SEOInput() {
  }

  /**
   * SEO title of the product.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * SEO description of the product.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "SEOInput{title='" + title + "', description='" + description + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SEOInput that = (SEOInput) o;
    return Objects.equals(title, that.title) &&
        Objects.equals(description, that.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * SEO title of the product.
     */
    private String title;

    /**
     * SEO description of the product.
     */
    private String description;

    public SEOInput build() {
      SEOInput result = new SEOInput();
      result.title = this.title;
      result.description = this.description;
      return result;
    }

    /**
     * SEO title of the product.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * SEO description of the product.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }
}
