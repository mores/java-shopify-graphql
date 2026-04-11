package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A social login provider for customer accounts.
 */
public class SocialLoginProvider {
  /**
   * The handle of the social login provider.
   */
  private String handle;

  public SocialLoginProvider() {
  }

  /**
   * The handle of the social login provider.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  @Override
  public String toString() {
    return "SocialLoginProvider{handle='" + handle + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SocialLoginProvider that = (SocialLoginProvider) o;
    return Objects.equals(handle, that.handle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The handle of the social login provider.
     */
    private String handle;

    public SocialLoginProvider build() {
      SocialLoginProvider result = new SocialLoginProvider();
      result.handle = this.handle;
      return result;
    }

    /**
     * The handle of the social login provider.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }
  }
}
