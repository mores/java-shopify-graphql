package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * A rollout treatment change that applies to a checkout and accounts configuration.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes(@JsonSubTypes.Type(value = RolloutCheckoutAndAccountsConfigurationPublishChange.class, name = "RolloutCheckoutAndAccountsConfigurationPublishChange"))
public interface RolloutCheckoutAndAccountsConfigurationChange {
  /**
   * The configuration that the change applies to. Returns `null` when the
   * configuration has been deleted or the caller can't read it.
   */
  CheckoutAndAccountsConfiguration getCheckoutAndAccountsConfiguration();

  /**
   * A globally unique ID for this change, not the resource it affects.
   */
  String getId();
}
