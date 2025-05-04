package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The third-party confirmation of a reverse fulfillment order.
 */
public class ReverseFulfillmentOrderThirdPartyConfirmation {
  /**
   * The status of the reverse fulfillment order third-party confirmation.
   */
  private ReverseFulfillmentOrderThirdPartyConfirmationStatus status;

  public ReverseFulfillmentOrderThirdPartyConfirmation() {
  }

  /**
   * The status of the reverse fulfillment order third-party confirmation.
   */
  public ReverseFulfillmentOrderThirdPartyConfirmationStatus getStatus() {
    return status;
  }

  public void setStatus(ReverseFulfillmentOrderThirdPartyConfirmationStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "ReverseFulfillmentOrderThirdPartyConfirmation{status='" + status + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReverseFulfillmentOrderThirdPartyConfirmation that = (ReverseFulfillmentOrderThirdPartyConfirmation) o;
    return Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The status of the reverse fulfillment order third-party confirmation.
     */
    private ReverseFulfillmentOrderThirdPartyConfirmationStatus status;

    public ReverseFulfillmentOrderThirdPartyConfirmation build() {
      ReverseFulfillmentOrderThirdPartyConfirmation result = new ReverseFulfillmentOrderThirdPartyConfirmation();
      result.status = this.status;
      return result;
    }

    /**
     * The status of the reverse fulfillment order third-party confirmation.
     */
    public Builder status(ReverseFulfillmentOrderThirdPartyConfirmationStatus status) {
      this.status = status;
      return this;
    }
  }
}
