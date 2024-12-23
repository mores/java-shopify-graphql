package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * SEO information.
 */
public class SEO {
  /**
   * SEO Description.
   */
  private String description;

  /**
   * SEO Title.
   */
  private String title;

  public SEO() {
  }

  /**
   * SEO Description.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * SEO Title.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "SEO{description='" + description + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SEO that = (SEO) o;
    return Objects.equals(description, that.description) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * SEO Description.
     */
    private String description;

    /**
     * SEO Title.
     */
    private String title;

    public SEO build() {
      SEO result = new SEO();
      result.description = this.description;
      result.title = this.title;
      return result;
    }

    /**
     * SEO Description.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * SEO Title.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
