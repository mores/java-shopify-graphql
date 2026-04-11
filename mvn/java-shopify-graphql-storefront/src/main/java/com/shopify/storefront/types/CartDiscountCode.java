package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A discount code applied to a
 * [`Cart`](https://shopify.dev/docs/api/storefront/current/objects/Cart). Discount
 * codes are case-insensitive and can be added using the [`cartDiscountCodesUpdate`](https://shopify.dev/docs/api/storefront/current/mutations/cartDiscountCodesUpdate) mutation.
 *
 * The [`applicable`](https://shopify.dev/docs/api/storefront/current/objects/CartDiscountCode#field-CartDiscountCode.fields.applicable) field indicates whether the code applies to the cart's current contents, which
 * might change as items are added or removed.
 */
public class CartDiscountCode {
  /**
   * Whether the discount code is applicable to the cart's current contents.
   */
  private boolean applicable;

  /**
   * The code for the discount.
   */
  private String code;

  public CartDiscountCode() {
  }

  /**
   * Whether the discount code is applicable to the cart's current contents.
   */
  public boolean getApplicable() {
    return applicable;
  }

  public void setApplicable(boolean applicable) {
    this.applicable = applicable;
  }

  /**
   * The code for the discount.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  @Override
  public String toString() {
    return "CartDiscountCode{applicable='" + applicable + "', code='" + code + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartDiscountCode that = (CartDiscountCode) o;
    return applicable == that.applicable &&
        Objects.equals(code, that.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicable, code);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the discount code is applicable to the cart's current contents.
     */
    private boolean applicable;

    /**
     * The code for the discount.
     */
    private String code;

    public CartDiscountCode build() {
      CartDiscountCode result = new CartDiscountCode();
      result.applicable = this.applicable;
      result.code = this.code;
      return result;
    }

    /**
     * Whether the discount code is applicable to the cart's current contents.
     */
    public Builder applicable(boolean applicable) {
      this.applicable = applicable;
      return this;
    }

    /**
     * The code for the discount.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }
  }
}
