package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Represents an object that has a list of events.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = Article.class, name = "Article"),
    @JsonSubTypes.Type(value = Blog.class, name = "Blog"),
    @JsonSubTypes.Type(value = Collection.class, name = "Collection"),
    @JsonSubTypes.Type(value = Comment.class, name = "Comment"),
    @JsonSubTypes.Type(value = Company.class, name = "Company"),
    @JsonSubTypes.Type(value = CompanyLocation.class, name = "CompanyLocation"),
    @JsonSubTypes.Type(value = Customer.class, name = "Customer"),
    @JsonSubTypes.Type(value = DiscountAutomaticBxgy.class, name = "DiscountAutomaticBxgy"),
    @JsonSubTypes.Type(value = DiscountAutomaticNode.class, name = "DiscountAutomaticNode"),
    @JsonSubTypes.Type(value = DiscountCodeNode.class, name = "DiscountCodeNode"),
    @JsonSubTypes.Type(value = DiscountNode.class, name = "DiscountNode"),
    @JsonSubTypes.Type(value = DraftOrder.class, name = "DraftOrder"),
    @JsonSubTypes.Type(value = InventoryTransfer.class, name = "InventoryTransfer"),
    @JsonSubTypes.Type(value = Order.class, name = "Order"),
    @JsonSubTypes.Type(value = Page.class, name = "Page"),
    @JsonSubTypes.Type(value = PriceRule.class, name = "PriceRule"),
    @JsonSubTypes.Type(value = Product.class, name = "Product"),
    @JsonSubTypes.Type(value = ProductVariant.class, name = "ProductVariant")
})
public interface HasEvents {
  /**
   * The paginated list of events associated with the host subject.
   */
  EventConnection getEvents();
}
