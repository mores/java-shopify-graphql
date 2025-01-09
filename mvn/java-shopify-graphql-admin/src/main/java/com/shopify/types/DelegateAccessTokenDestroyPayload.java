package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `delegateAccessTokenDestroy` mutation.
 */
public class DelegateAccessTokenDestroyPayload {
  /**
   * The user's shop.
   */
  private Shop shop;

  /**
   * The status of the delegate access token destroy operation. Returns true if successful.
   */
  private Boolean status;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<DelegateAccessTokenDestroyUserError> userErrors;

  public DelegateAccessTokenDestroyPayload() {
  }

  /**
   * The user's shop.
   */
  public Shop getShop() {
    return shop;
  }

  public void setShop(Shop shop) {
    this.shop = shop;
  }

  /**
   * The status of the delegate access token destroy operation. Returns true if successful.
   */
  public Boolean getStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<DelegateAccessTokenDestroyUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<DelegateAccessTokenDestroyUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DelegateAccessTokenDestroyPayload{shop='" + shop + "', status='" + status + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DelegateAccessTokenDestroyPayload that = (DelegateAccessTokenDestroyPayload) o;
    return Objects.equals(shop, that.shop) &&
        Objects.equals(status, that.status) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shop, status, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The user's shop.
     */
    private Shop shop;

    /**
     * The status of the delegate access token destroy operation. Returns true if successful.
     */
    private Boolean status;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<DelegateAccessTokenDestroyUserError> userErrors;

    public DelegateAccessTokenDestroyPayload build() {
      DelegateAccessTokenDestroyPayload result = new DelegateAccessTokenDestroyPayload();
      result.shop = this.shop;
      result.status = this.status;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The user's shop.
     */
    public Builder shop(Shop shop) {
      this.shop = shop;
      return this;
    }

    /**
     * The status of the delegate access token destroy operation. Returns true if successful.
     */
    public Builder status(Boolean status) {
      this.status = status;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<DelegateAccessTokenDestroyUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
