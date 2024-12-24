package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ArticleUpdatePayload {
  
  private Article article;

  
  private List<ArticleUpdateUserError> userErrors;

  public ArticleUpdatePayload() {
  }

  
  public Article getArticle() {
    return article;
  }

  public void setArticle(Article article) {
    this.article = article;
  }

  
  public List<ArticleUpdateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ArticleUpdateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ArticleUpdatePayload{article='" + article + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ArticleUpdatePayload that = (ArticleUpdatePayload) o;
    return Objects.equals(article, that.article) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(article, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Article article;

    
    private List<ArticleUpdateUserError> userErrors;

    public ArticleUpdatePayload build() {
      ArticleUpdatePayload result = new ArticleUpdatePayload();
      result.article = this.article;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder article(Article article) {
      this.article = article;
      return this;
    }

    
    public Builder userErrors(List<ArticleUpdateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
