package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `blogDelete` mutation.
 */
public class BlogDeletePayload {
  /**
   * The ID of the deleted blog.
   */
  private String deletedBlogId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<BlogDeleteUserError> userErrors;

  public BlogDeletePayload() {
  }

  /**
   * The ID of the deleted blog.
   */
  public String getDeletedBlogId() {
    return deletedBlogId;
  }

  public void setDeletedBlogId(String deletedBlogId) {
    this.deletedBlogId = deletedBlogId;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<BlogDeleteUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<BlogDeleteUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "BlogDeletePayload{deletedBlogId='" + deletedBlogId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BlogDeletePayload that = (BlogDeletePayload) o;
    return Objects.equals(deletedBlogId, that.deletedBlogId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedBlogId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the deleted blog.
     */
    private String deletedBlogId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<BlogDeleteUserError> userErrors;

    public BlogDeletePayload build() {
      BlogDeletePayload result = new BlogDeletePayload();
      result.deletedBlogId = this.deletedBlogId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the deleted blog.
     */
    public Builder deletedBlogId(String deletedBlogId) {
      this.deletedBlogId = deletedBlogId;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<BlogDeleteUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
