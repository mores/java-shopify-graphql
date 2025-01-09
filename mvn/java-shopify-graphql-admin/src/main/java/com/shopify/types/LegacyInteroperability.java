package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * Interoperability metadata for types that directly correspond to a REST Admin API resource.
 * For example, on the Product type, LegacyInteroperability returns metadata for
 * the corresponding [Product
 * object](https://shopify.dev/api/admin-graphql/latest/objects/product) in the
 * REST Admin API.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = Customer.class, name = "Customer"),
    @JsonSubTypes.Type(value = DraftOrder.class, name = "DraftOrder"),
    @JsonSubTypes.Type(value = Fulfillment.class, name = "Fulfillment"),
    @JsonSubTypes.Type(value = InventoryItem.class, name = "InventoryItem"),
    @JsonSubTypes.Type(value = Location.class, name = "Location"),
    @JsonSubTypes.Type(value = MarketingEvent.class, name = "MarketingEvent"),
    @JsonSubTypes.Type(value = Metafield.class, name = "Metafield"),
    @JsonSubTypes.Type(value = Order.class, name = "Order"),
    @JsonSubTypes.Type(value = PriceRule.class, name = "PriceRule"),
    @JsonSubTypes.Type(value = Product.class, name = "Product"),
    @JsonSubTypes.Type(value = ProductVariant.class, name = "ProductVariant"),
    @JsonSubTypes.Type(value = Refund.class, name = "Refund"),
    @JsonSubTypes.Type(value = SavedSearch.class, name = "SavedSearch"),
    @JsonSubTypes.Type(value = ScriptTag.class, name = "ScriptTag"),
    @JsonSubTypes.Type(value = ShopifyPaymentsDispute.class, name = "ShopifyPaymentsDispute"),
    @JsonSubTypes.Type(value = ShopifyPaymentsPayout.class, name = "ShopifyPaymentsPayout"),
    @JsonSubTypes.Type(value = WebhookSubscription.class, name = "WebhookSubscription")
})
public interface LegacyInteroperability {
  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  String getLegacyResourceId();
}
