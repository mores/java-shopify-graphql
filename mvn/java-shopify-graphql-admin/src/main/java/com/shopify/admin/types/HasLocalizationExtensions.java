package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Localization extensions associated with the specified resource. For example, the tax id for government invoice.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = DraftOrder.class, name = "DraftOrder"),
    @JsonSubTypes.Type(value = Order.class, name = "Order")
})
public interface HasLocalizationExtensions {
  /**
   * List of localization extensions for the resource.
   */
  LocalizationExtensionConnection getLocalizationExtensions();
}
