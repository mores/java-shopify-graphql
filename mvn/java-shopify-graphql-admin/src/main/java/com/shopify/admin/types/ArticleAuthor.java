package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents an article author in an Article.
 */
public class ArticleAuthor {
  /**
   * The author's full name.
   */
  private String name;

  public ArticleAuthor() {
  }

  /**
   * The author's full name.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "ArticleAuthor{name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ArticleAuthor that = (ArticleAuthor) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The author's full name.
     */
    private String name;

    public ArticleAuthor build() {
      ArticleAuthor result = new ArticleAuthor();
      result.name = this.name;
      return result;
    }

    /**
     * The author's full name.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
