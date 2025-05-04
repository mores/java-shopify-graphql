package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `commentApprove` mutation.
 */
public class CommentApprovePayload {
  /**
   * The comment that was approved.
   */
  private Comment comment;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CommentApproveUserError> userErrors;

  public CommentApprovePayload() {
  }

  /**
   * The comment that was approved.
   */
  public Comment getComment() {
    return comment;
  }

  public void setComment(Comment comment) {
    this.comment = comment;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<CommentApproveUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CommentApproveUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CommentApprovePayload{comment='" + comment + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CommentApprovePayload that = (CommentApprovePayload) o;
    return Objects.equals(comment, that.comment) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The comment that was approved.
     */
    private Comment comment;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CommentApproveUserError> userErrors;

    public CommentApprovePayload build() {
      CommentApprovePayload result = new CommentApprovePayload();
      result.comment = this.comment;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The comment that was approved.
     */
    public Builder comment(Comment comment) {
      this.comment = comment;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CommentApproveUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
