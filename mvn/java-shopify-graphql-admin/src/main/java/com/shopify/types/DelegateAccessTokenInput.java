package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DelegateAccessTokenInput {
  
  private List<String> delegateAccessScope;

  
  private Integer expiresIn;

  public DelegateAccessTokenInput() {
  }

  
  public List<String> getDelegateAccessScope() {
    return delegateAccessScope;
  }

  public void setDelegateAccessScope(List<String> delegateAccessScope) {
    this.delegateAccessScope = delegateAccessScope;
  }

  
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  @Override
  public String toString() {
    return "DelegateAccessTokenInput{delegateAccessScope='" + delegateAccessScope + "', expiresIn='" + expiresIn + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DelegateAccessTokenInput that = (DelegateAccessTokenInput) o;
    return Objects.equals(delegateAccessScope, that.delegateAccessScope) &&
        Objects.equals(expiresIn, that.expiresIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delegateAccessScope, expiresIn);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<String> delegateAccessScope;

    
    private Integer expiresIn;

    public DelegateAccessTokenInput build() {
      DelegateAccessTokenInput result = new DelegateAccessTokenInput();
      result.delegateAccessScope = this.delegateAccessScope;
      result.expiresIn = this.expiresIn;
      return result;
    }

    
    public Builder delegateAccessScope(List<String> delegateAccessScope) {
      this.delegateAccessScope = delegateAccessScope;
      return this;
    }

    
    public Builder expiresIn(Integer expiresIn) {
      this.expiresIn = expiresIn;
      return this;
    }
  }
}
