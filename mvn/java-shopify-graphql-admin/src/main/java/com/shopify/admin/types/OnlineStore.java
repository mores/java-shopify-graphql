package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The shop's online store channel.
 */
public class OnlineStore {
  /**
   * Storefront password information.
   */
  private OnlineStorePasswordProtection passwordProtection;

  public OnlineStore() {
  }

  /**
   * Storefront password information.
   */
  public OnlineStorePasswordProtection getPasswordProtection() {
    return passwordProtection;
  }

  public void setPasswordProtection(OnlineStorePasswordProtection passwordProtection) {
    this.passwordProtection = passwordProtection;
  }

  @Override
  public String toString() {
    return "OnlineStore{passwordProtection='" + passwordProtection + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OnlineStore that = (OnlineStore) o;
    return Objects.equals(passwordProtection, that.passwordProtection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passwordProtection);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Storefront password information.
     */
    private OnlineStorePasswordProtection passwordProtection;

    public OnlineStore build() {
      OnlineStore result = new OnlineStore();
      result.passwordProtection = this.passwordProtection;
      return result;
    }

    /**
     * Storefront password information.
     */
    public Builder passwordProtection(OnlineStorePasswordProtection passwordProtection) {
      this.passwordProtection = passwordProtection;
      return this;
    }
  }
}
