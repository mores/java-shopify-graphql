package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `articleCreate` mutation.
 */
public class ArticleCreatePayload {
  /**
   * The article that was created.
   */
  private Article article;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ArticleCreateUserError> userErrors;

  public ArticleCreatePayload() {
  }

  /**
   * The article that was created.
   */
  public Article getArticle() {
    return article;
  }

  public void setArticle(Article article) {
    this.article = article;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<ArticleCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ArticleCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ArticleCreatePayload{article='" + article + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ArticleCreatePayload that = (ArticleCreatePayload) o;
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
    /**
     * The article that was created.
     */
    private Article article;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ArticleCreateUserError> userErrors;

    public ArticleCreatePayload build() {
      ArticleCreatePayload result = new ArticleCreatePayload();
      result.article = this.article;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The article that was created.
     */
    public Builder article(Article article) {
      this.article = article;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ArticleCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
