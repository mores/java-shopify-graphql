package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `articleUpdate` mutation.
 */
public class ArticleUpdatePayload {
  /**
   * The article that was updated.
   */
  private Article article;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ArticleUpdateUserError> userErrors;

  public ArticleUpdatePayload() {
  }

  /**
   * The article that was updated.
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
    /**
     * The article that was updated.
     */
    private Article article;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ArticleUpdateUserError> userErrors;

    public ArticleUpdatePayload build() {
      ArticleUpdatePayload result = new ArticleUpdatePayload();
      result.article = this.article;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The article that was updated.
     */
    public Builder article(Article article) {
      this.article = article;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ArticleUpdateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
