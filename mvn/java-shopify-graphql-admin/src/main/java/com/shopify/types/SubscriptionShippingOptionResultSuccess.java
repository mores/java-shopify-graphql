package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A shipping option for delivery of a subscription contract.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionShippingOptionResultSuccess implements SubscriptionShippingOptionResult {
  /**
   * Available shipping options.
   */
  private List<SubscriptionShippingOption> shippingOptions;

  public SubscriptionShippingOptionResultSuccess() {
  }

  /**
   * Available shipping options.
   */
  public List<SubscriptionShippingOption> getShippingOptions() {
    return shippingOptions;
  }

  public void setShippingOptions(List<SubscriptionShippingOption> shippingOptions) {
    this.shippingOptions = shippingOptions;
  }

  @Override
  public String toString() {
    return "SubscriptionShippingOptionResultSuccess{shippingOptions='" + shippingOptions + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionShippingOptionResultSuccess that = (SubscriptionShippingOptionResultSuccess) o;
    return Objects.equals(shippingOptions, that.shippingOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingOptions);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Available shipping options.
     */
    private List<SubscriptionShippingOption> shippingOptions;

    public SubscriptionShippingOptionResultSuccess build() {
      SubscriptionShippingOptionResultSuccess result = new SubscriptionShippingOptionResultSuccess();
      result.shippingOptions = this.shippingOptions;
      return result;
    }

    /**
     * Available shipping options.
     */
    public Builder shippingOptions(List<SubscriptionShippingOption> shippingOptions) {
      this.shippingOptions = shippingOptions;
      return this;
    }
  }
}
