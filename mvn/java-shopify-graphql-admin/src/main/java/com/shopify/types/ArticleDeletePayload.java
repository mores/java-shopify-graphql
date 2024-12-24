package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ArticleDeletePayload {
  
  private String deletedArticleId;

  
  private List<ArticleDeleteUserError> userErrors;

  public ArticleDeletePayload() {
  }

  
  public String getDeletedArticleId() {
    return deletedArticleId;
  }

  public void setDeletedArticleId(String deletedArticleId) {
    this.deletedArticleId = deletedArticleId;
  }

  
  public List<ArticleDeleteUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ArticleDeleteUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ArticleDeletePayload{deletedArticleId='" + deletedArticleId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ArticleDeletePayload that = (ArticleDeletePayload) o;
    return Objects.equals(deletedArticleId, that.deletedArticleId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedArticleId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String deletedArticleId;

    
    private List<ArticleDeleteUserError> userErrors;

    public ArticleDeletePayload build() {
      ArticleDeletePayload result = new ArticleDeletePayload();
      result.deletedArticleId = this.deletedArticleId;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedArticleId(String deletedArticleId) {
      this.deletedArticleId = deletedArticleId;
      return this;
    }

    
    public Builder userErrors(List<ArticleDeleteUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
