package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class PageUpdatePayload {
  
  private Page page;

  
  private List<PageUpdateUserError> userErrors;

  public PageUpdatePayload() {
  }

  
  public Page getPage() {
    return page;
  }

  public void setPage(Page page) {
    this.page = page;
  }

  
  public List<PageUpdateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<PageUpdateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PageUpdatePayload{page='" + page + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PageUpdatePayload that = (PageUpdatePayload) o;
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
    
    private Page page;

    
    private List<PageUpdateUserError> userErrors;

    public PageUpdatePayload build() {
      PageUpdatePayload result = new PageUpdatePayload();
      result.page = this.page;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder page(Page page) {
      this.page = page;
      return this;
    }

    
    public Builder userErrors(List<PageUpdateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
