package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `blogUpdate` mutation.
 */
public class BlogUpdatePayload {
  /**
   * The blog that was updated.
   */
  private Blog blog;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<BlogUpdateUserError> userErrors;

  public BlogUpdatePayload() {
  }

  /**
   * The blog that was updated.
   */
  public Blog getBlog() {
    return blog;
  }

  public void setBlog(Blog blog) {
    this.blog = blog;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<BlogUpdateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<BlogUpdateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "BlogUpdatePayload{blog='" + blog + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BlogUpdatePayload that = (BlogUpdatePayload) o;
    return Objects.equals(blog, that.blog) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blog, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The blog that was updated.
     */
    private Blog blog;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<BlogUpdateUserError> userErrors;

    public BlogUpdatePayload build() {
      BlogUpdatePayload result = new BlogUpdatePayload();
      result.blog = this.blog;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The blog that was updated.
     */
    public Builder blog(Blog blog) {
      this.blog = blog;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<BlogUpdateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
