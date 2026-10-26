package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * A change that a rollout treatment makes while it's served. Changes describe what
 * the treatment does, not the current state of the affected resource. Use inline
 * fragments on the concrete types to read type-specific fields.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = RolloutCatalogActivateChange.class, name = "RolloutCatalogActivateChange"),
    @JsonSubTypes.Type(value = RolloutCatalogDraftChange.class, name = "RolloutCatalogDraftChange"),
    @JsonSubTypes.Type(value = RolloutCheckoutAndAccountsConfigurationPublishChange.class, name = "RolloutCheckoutAndAccountsConfigurationPublishChange"),
    @JsonSubTypes.Type(value = RolloutDiscountActivateChange.class, name = "RolloutDiscountActivateChange"),
    @JsonSubTypes.Type(value = RolloutDiscountExpireChange.class, name = "RolloutDiscountExpireChange"),
    @JsonSubTypes.Type(value = RolloutThemePublishChange.class, name = "RolloutThemePublishChange")
})
public interface RolloutChange {
  /**
   * A globally unique ID for this change, not the resource it affects.
   */
  String getId();
}
