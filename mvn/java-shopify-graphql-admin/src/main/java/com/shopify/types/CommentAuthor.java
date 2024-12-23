package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The author of a comment.
 */
public class CommentAuthor {
  /**
   * The author's email.
   */
  private String email;

  /**
   * The author’s name.
   */
  private String name;

  public CommentAuthor() {
  }

  /**
   * The author's email.
   */
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * The author’s name.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "CommentAuthor{email='" + email + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CommentAuthor that = (CommentAuthor) o;
    return Objects.equals(email, that.email) &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The author's email.
     */
    private String email;

    /**
     * The author’s name.
     */
    private String name;

    public CommentAuthor build() {
      CommentAuthor result = new CommentAuthor();
      result.email = this.email;
      result.name = this.name;
      return result;
    }

    /**
     * The author's email.
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    /**
     * The author’s name.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
