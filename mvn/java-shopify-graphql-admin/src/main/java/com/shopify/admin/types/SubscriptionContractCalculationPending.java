package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A subscription contract calculation that is still processing asynchronously.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionContractCalculationPending implements SubscriptionContractCalculation {
  /**
   * The ID of the calculated contract.
   */
  private String id;

  public SubscriptionContractCalculationPending() {
  }

  /**
   * The ID of the calculated contract.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationPending{id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationPending that = (SubscriptionContractCalculationPending) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the calculated contract.
     */
    private String id;

    public SubscriptionContractCalculationPending build() {
      SubscriptionContractCalculationPending result = new SubscriptionContractCalculationPending();
      result.id = this.id;
      return result;
    }

    /**
     * The ID of the calculated contract.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
