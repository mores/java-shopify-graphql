package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = AppInstallation.class, name = "AppInstallation"),
    @JsonSubTypes.Type(value = Article.class, name = "Article"),
    @JsonSubTypes.Type(value = Blog.class, name = "Blog"),
    @JsonSubTypes.Type(value = CartTransform.class, name = "CartTransform"),
    @JsonSubTypes.Type(value = Collection.class, name = "Collection"),
    @JsonSubTypes.Type(value = Company.class, name = "Company"),
    @JsonSubTypes.Type(value = CompanyLocation.class, name = "CompanyLocation"),
    @JsonSubTypes.Type(value = Customer.class, name = "Customer"),
    @JsonSubTypes.Type(value = CustomerSegmentMember.class, name = "CustomerSegmentMember"),
    @JsonSubTypes.Type(value = DeliveryCustomization.class, name = "DeliveryCustomization"),
    @JsonSubTypes.Type(value = DiscountAutomaticNode.class, name = "DiscountAutomaticNode"),
    @JsonSubTypes.Type(value = DiscountCodeNode.class, name = "DiscountCodeNode"),
    @JsonSubTypes.Type(value = DiscountNode.class, name = "DiscountNode"),
    @JsonSubTypes.Type(value = DraftOrder.class, name = "DraftOrder"),
    @JsonSubTypes.Type(value = FulfillmentConstraintRule.class, name = "FulfillmentConstraintRule"),
    @JsonSubTypes.Type(value = GiftCardCreditTransaction.class, name = "GiftCardCreditTransaction"),
    @JsonSubTypes.Type(value = GiftCardDebitTransaction.class, name = "GiftCardDebitTransaction"),
    @JsonSubTypes.Type(value = Image.class, name = "Image"),
    @JsonSubTypes.Type(value = Location.class, name = "Location"),
    @JsonSubTypes.Type(value = Market.class, name = "Market"),
    @JsonSubTypes.Type(value = MediaImage.class, name = "MediaImage"),
    @JsonSubTypes.Type(value = Order.class, name = "Order"),
    @JsonSubTypes.Type(value = Page.class, name = "Page"),
    @JsonSubTypes.Type(value = PaymentCustomization.class, name = "PaymentCustomization"),
    @JsonSubTypes.Type(value = Product.class, name = "Product"),
    @JsonSubTypes.Type(value = ProductVariant.class, name = "ProductVariant"),
    @JsonSubTypes.Type(value = SellingPlan.class, name = "SellingPlan"),
    @JsonSubTypes.Type(value = Shop.class, name = "Shop"),
    @JsonSubTypes.Type(value = Validation.class, name = "Validation")
})
public interface HasMetafields {
  
  Metafield getMetafield();

  
  MetafieldConnection getMetafields();

  
  PrivateMetafield getPrivateMetafield();

  
  PrivateMetafieldConnection getPrivateMetafields();
}
