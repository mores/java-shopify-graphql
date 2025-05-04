package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for a delegate access token.
 */
public class DelegateAccessTokenInput {
  /**
   * The list of scopes that will be delegated to the new access token.
   */
  private List<String> delegateAccessScope;

  /**
   * The amount of time, in seconds, after which the delegate access token is no longer valid.
   */
  private Integer expiresIn;

  public DelegateAccessTokenInput() {
  }

  /**
   * The list of scopes that will be delegated to the new access token.
   */
  public List<String> getDelegateAccessScope() {
    return delegateAccessScope;
  }

  public void setDelegateAccessScope(List<String> delegateAccessScope) {
    this.delegateAccessScope = delegateAccessScope;
  }

  /**
   * The amount of time, in seconds, after which the delegate access token is no longer valid.
   */
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
    /**
     * The list of scopes that will be delegated to the new access token.
     */
    private List<String> delegateAccessScope;

    /**
     * The amount of time, in seconds, after which the delegate access token is no longer valid.
     */
    private Integer expiresIn;

    public DelegateAccessTokenInput build() {
      DelegateAccessTokenInput result = new DelegateAccessTokenInput();
      result.delegateAccessScope = this.delegateAccessScope;
      result.expiresIn = this.expiresIn;
      return result;
    }

    /**
     * The list of scopes that will be delegated to the new access token.
     */
    public Builder delegateAccessScope(List<String> delegateAccessScope) {
      this.delegateAccessScope = delegateAccessScope;
      return this;
    }

    /**
     * The amount of time, in seconds, after which the delegate access token is no longer valid.
     */
    public Builder expiresIn(Integer expiresIn) {
      this.expiresIn = expiresIn;
      return this;
    }
  }
}
