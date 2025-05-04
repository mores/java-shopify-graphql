package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `pageCreate` mutation.
 */
public class PageCreatePayload {
  /**
   * The page that was created.
   */
  private Page page;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<PageCreateUserError> userErrors;

  public PageCreatePayload() {
  }

  /**
   * The page that was created.
   */
  public Page getPage() {
    return page;
  }

  public void setPage(Page page) {
    this.page = page;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<PageCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<PageCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PageCreatePayload{page='" + page + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PageCreatePayload that = (PageCreatePayload) o;
    return Objects.equals(page, that.page) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The page that was created.
     */
    private Page page;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<PageCreateUserError> userErrors;

    public PageCreatePayload build() {
      PageCreatePayload result = new PageCreatePayload();
      result.page = this.page;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The page that was created.
     */
    public Builder page(Page page) {
      this.page = page;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<PageCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
