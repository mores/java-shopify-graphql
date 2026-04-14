package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;
import java.time.OffsetDateTime;

/**
 * Represents a checkout and accounts configuration interface.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CheckoutAndAccountsConfiguration.class, name = "CheckoutAndAccountsConfiguration"),
    @JsonSubTypes.Type(value = CheckoutAndAccountsConfigurationOverride.class, name = "CheckoutAndAccountsConfigurationOverride")
})
public interface CheckoutAndAccountsConfigurationInterface {
  /**
   * The branding configuration.
   */
  CheckoutAndAccountsConfigurationBranding getBranding();

  /**
   * The date and time when the configuration was created.
   */
  OffsetDateTime getCreatedAt();

  /**
   * The date and time when the configuration was last edited.
   */
  OffsetDateTime getEditedAt();

  /**
   * The configuration name.
   */
  String getName();

  /**
   * The date and time when the configuration was last updated.
   */
  OffsetDateTime getUpdatedAt();
}
