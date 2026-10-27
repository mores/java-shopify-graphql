package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A rollout treatment change that publishes a checkout and accounts configuration
 * for the buyers the treatment serves, without changing the shop's globally
 * published configuration. Returned by [`RolloutTreatment.changes`](https://shopify.dev/docs/api/admin-graphql/latest/objects/RolloutTreatment#field-RolloutTreatment.fields.changes).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class RolloutCheckoutAndAccountsConfigurationPublishChange implements com.shopify.admin.types.RolloutChange, com.shopify.admin.types.RolloutCheckoutAndAccountsConfigurationChange {
  /**
   * The configuration that the change applies to. Returns `null` when the
   * configuration has been deleted or the caller can't read it.
   */
  private CheckoutAndAccountsConfiguration checkoutAndAccountsConfiguration;

  /**
   * A globally unique ID for this change, not the resource it affects.
   */
  private String id;

  public RolloutCheckoutAndAccountsConfigurationPublishChange() {
  }

  /**
   * The configuration that the change applies to. Returns `null` when the
   * configuration has been deleted or the caller can't read it.
   */
  public CheckoutAndAccountsConfiguration getCheckoutAndAccountsConfiguration() {
    return checkoutAndAccountsConfiguration;
  }

  public void setCheckoutAndAccountsConfiguration(
      CheckoutAndAccountsConfiguration checkoutAndAccountsConfiguration) {
    this.checkoutAndAccountsConfiguration = checkoutAndAccountsConfiguration;
  }

  /**
   * A globally unique ID for this change, not the resource it affects.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "RolloutCheckoutAndAccountsConfigurationPublishChange{checkoutAndAccountsConfiguration='" + checkoutAndAccountsConfiguration + "', id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RolloutCheckoutAndAccountsConfigurationPublishChange that = (RolloutCheckoutAndAccountsConfigurationPublishChange) o;
    return Objects.equals(checkoutAndAccountsConfiguration, that.checkoutAndAccountsConfiguration) &&
        Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutAndAccountsConfiguration, id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The configuration that the change applies to. Returns `null` when the
     * configuration has been deleted or the caller can't read it.
     */
    private CheckoutAndAccountsConfiguration checkoutAndAccountsConfiguration;

    /**
     * A globally unique ID for this change, not the resource it affects.
     */
    private String id;

    public RolloutCheckoutAndAccountsConfigurationPublishChange build() {
      RolloutCheckoutAndAccountsConfigurationPublishChange result = new RolloutCheckoutAndAccountsConfigurationPublishChange();
      result.checkoutAndAccountsConfiguration = this.checkoutAndAccountsConfiguration;
      result.id = this.id;
      return result;
    }

    /**
     * The configuration that the change applies to. Returns `null` when the
     * configuration has been deleted or the caller can't read it.
     */
    public Builder checkoutAndAccountsConfiguration(
        CheckoutAndAccountsConfiguration checkoutAndAccountsConfiguration) {
      this.checkoutAndAccountsConfiguration = checkoutAndAccountsConfiguration;
      return this;
    }

    /**
     * A globally unique ID for this change, not the resource it affects.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
