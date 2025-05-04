package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `shopPolicyUpdate` mutation.
 */
public class ShopPolicyUpdatePayload {
  /**
   * The shop policy that has been updated.
   */
  private ShopPolicy shopPolicy;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ShopPolicyUserError> userErrors;

  public ShopPolicyUpdatePayload() {
  }

  /**
   * The shop policy that has been updated.
   */
  public ShopPolicy getShopPolicy() {
    return shopPolicy;
  }

  public void setShopPolicy(ShopPolicy shopPolicy) {
    this.shopPolicy = shopPolicy;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<ShopPolicyUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ShopPolicyUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ShopPolicyUpdatePayload{shopPolicy='" + shopPolicy + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPolicyUpdatePayload that = (ShopPolicyUpdatePayload) o;
    return Objects.equals(shopPolicy, that.shopPolicy) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopPolicy, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The shop policy that has been updated.
     */
    private ShopPolicy shopPolicy;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ShopPolicyUserError> userErrors;

    public ShopPolicyUpdatePayload build() {
      ShopPolicyUpdatePayload result = new ShopPolicyUpdatePayload();
      result.shopPolicy = this.shopPolicy;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The shop policy that has been updated.
     */
    public Builder shopPolicy(ShopPolicy shopPolicy) {
      this.shopPolicy = shopPolicy;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ShopPolicyUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
