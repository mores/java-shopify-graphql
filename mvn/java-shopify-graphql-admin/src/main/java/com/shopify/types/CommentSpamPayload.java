package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CommentSpamPayload {
  
  private Comment comment;

  
  private List<CommentSpamUserError> userErrors;

  public CommentSpamPayload() {
  }

  
  public Comment getComment() {
    return comment;
  }

  public void setComment(Comment comment) {
    this.comment = comment;
  }

  
  public List<CommentSpamUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CommentSpamUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CommentSpamPayload{comment='" + comment + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CommentSpamPayload that = (CommentSpamPayload) o;
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
    
    private Comment comment;

    
    private List<CommentSpamUserError> userErrors;

    public CommentSpamPayload build() {
      CommentSpamPayload result = new CommentSpamPayload();
      result.comment = this.comment;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder comment(Comment comment) {
      this.comment = comment;
      return this;
    }

    
    public Builder userErrors(List<CommentSpamUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
