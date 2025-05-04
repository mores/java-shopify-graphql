package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionLineProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionLineProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionLine"));
  }

  public SubscriptionLineProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionContractProjection<SubscriptionLineProjection<PARENT, ROOT>, ROOT> concatenatedOriginContract(
      ) {
     SubscriptionContractProjection<SubscriptionLineProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractProjection<>(this, getRoot());
     getFields().put("concatenatedOriginContract", projection);
     return projection;
  }

  public MoneyV2Projection<SubscriptionLineProjection<PARENT, ROOT>, ROOT> currentPrice() {
     MoneyV2Projection<SubscriptionLineProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("currentPrice", projection);
     return projection;
  }

  public AttributeProjection<SubscriptionLineProjection<PARENT, ROOT>, ROOT> customAttributes() {
     AttributeProjection<SubscriptionLineProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public SubscriptionDiscountAllocationProjection<SubscriptionLineProjection<PARENT, ROOT>, ROOT> discountAllocations(
      ) {
     SubscriptionDiscountAllocationProjection<SubscriptionLineProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountAllocationProjection<>(this, getRoot());
     getFields().put("discountAllocations", projection);
     return projection;
  }

  public MoneyV2Projection<SubscriptionLineProjection<PARENT, ROOT>, ROOT> lineDiscountedPrice() {
     MoneyV2Projection<SubscriptionLineProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("lineDiscountedPrice", projection);
     return projection;
  }

  public SubscriptionPricingPolicyProjection<SubscriptionLineProjection<PARENT, ROOT>, ROOT> pricingPolicy(
      ) {
     SubscriptionPricingPolicyProjection<SubscriptionLineProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionPricingPolicyProjection<>(this, getRoot());
     getFields().put("pricingPolicy", projection);
     return projection;
  }

  public ImageProjection<SubscriptionLineProjection<PARENT, ROOT>, ROOT> variantImage() {
     ImageProjection<SubscriptionLineProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("variantImage", projection);
     return projection;
  }

  public SubscriptionLineProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SubscriptionLineProjection<PARENT, ROOT> productId() {
    getFields().put("productId", null);
    return this;
  }

  public SubscriptionLineProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public SubscriptionLineProjection<PARENT, ROOT> requiresShipping() {
    getFields().put("requiresShipping", null);
    return this;
  }

  public SubscriptionLineProjection<PARENT, ROOT> sellingPlanId() {
    getFields().put("sellingPlanId", null);
    return this;
  }

  public SubscriptionLineProjection<PARENT, ROOT> sellingPlanName() {
    getFields().put("sellingPlanName", null);
    return this;
  }

  public SubscriptionLineProjection<PARENT, ROOT> sku() {
    getFields().put("sku", null);
    return this;
  }

  public SubscriptionLineProjection<PARENT, ROOT> taxable() {
    getFields().put("taxable", null);
    return this;
  }

  public SubscriptionLineProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public SubscriptionLineProjection<PARENT, ROOT> variantId() {
    getFields().put("variantId", null);
    return this;
  }

  public SubscriptionLineProjection<PARENT, ROOT> variantTitle() {
    getFields().put("variantTitle", null);
    return this;
  }
}
