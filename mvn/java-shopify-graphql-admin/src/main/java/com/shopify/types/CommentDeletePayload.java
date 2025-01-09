package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `commentDelete` mutation.
 */
public class CommentDeletePayload {
  /**
   * The ID of the comment that was deleted.
   */
  private String deletedCommentId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CommentDeleteUserError> userErrors;

  public CommentDeletePayload() {
  }

  /**
   * The ID of the comment that was deleted.
   */
  public String getDeletedCommentId() {
    return deletedCommentId;
  }

  public void setDeletedCommentId(String deletedCommentId) {
    this.deletedCommentId = deletedCommentId;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<CommentDeleteUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CommentDeleteUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CommentDeletePayload{deletedCommentId='" + deletedCommentId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CommentDeletePayload that = (CommentDeletePayload) o;
    return Objects.equals(deletedCommentId, that.deletedCommentId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedCommentId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the comment that was deleted.
     */
    private String deletedCommentId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CommentDeleteUserError> userErrors;

    public CommentDeletePayload build() {
      CommentDeletePayload result = new CommentDeletePayload();
      result.deletedCommentId = this.deletedCommentId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the comment that was deleted.
     */
    public Builder deletedCommentId(String deletedCommentId) {
      this.deletedCommentId = deletedCommentId;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CommentDeleteUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
