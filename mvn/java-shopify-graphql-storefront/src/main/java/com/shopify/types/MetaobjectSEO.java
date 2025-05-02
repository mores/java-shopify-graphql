package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * SEO information for a metaobject.
 */
public class MetaobjectSEO {
  /**
   * The meta description.
   */
  private MetaobjectField description;

  /**
   * The SEO title.
   */
  private MetaobjectField title;

  public MetaobjectSEO() {
  }

  /**
   * The meta description.
   */
  public MetaobjectField getDescription() {
    return description;
  }

  public void setDescription(MetaobjectField description) {
    this.description = description;
  }

  /**
   * The SEO title.
   */
  public MetaobjectField getTitle() {
    return title;
  }

  public void setTitle(MetaobjectField title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "MetaobjectSEO{description='" + description + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectSEO that = (MetaobjectSEO) o;
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
     * The meta description.
     */
    private MetaobjectField description;

    /**
     * The SEO title.
     */
    private MetaobjectField title;

    public MetaobjectSEO build() {
      MetaobjectSEO result = new MetaobjectSEO();
      result.description = this.description;
      result.title = this.title;
      return result;
    }

    /**
     * The meta description.
     */
    public Builder description(MetaobjectField description) {
      this.description = description;
      return this;
    }

    /**
     * The SEO title.
     */
    public Builder title(MetaobjectField title) {
      this.title = title;
      return this;
    }
  }
}
