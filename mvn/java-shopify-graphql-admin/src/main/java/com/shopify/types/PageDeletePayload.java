package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class PageDeletePayload {
  
  private String deletedPageId;

  
  private List<PageDeleteUserError> userErrors;

  public PageDeletePayload() {
  }

  
  public String getDeletedPageId() {
    return deletedPageId;
  }

  public void setDeletedPageId(String deletedPageId) {
    this.deletedPageId = deletedPageId;
  }

  
  public List<PageDeleteUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<PageDeleteUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PageDeletePayload{deletedPageId='" + deletedPageId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PageDeletePayload that = (PageDeletePayload) o;
    return Objects.equals(deletedPageId, that.deletedPageId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedPageId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String deletedPageId;

    
    private List<PageDeleteUserError> userErrors;

    public PageDeletePayload build() {
      PageDeletePayload result = new PageDeletePayload();
      result.deletedPageId = this.deletedPageId;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedPageId(String deletedPageId) {
      this.deletedPageId = deletedPageId;
      return this;
    }

    
    public Builder userErrors(List<PageDeleteUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
