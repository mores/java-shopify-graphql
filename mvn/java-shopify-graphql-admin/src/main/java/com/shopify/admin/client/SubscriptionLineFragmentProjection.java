package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SubscriptionLineFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SubscriptionLineFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionLine"));
  }

  public SubscriptionLineFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionContractProjection<SubscriptionLineFragmentProjection<PARENT, ROOT>, ROOT> concatenatedOriginContract(
      ) {
     SubscriptionContractProjection<SubscriptionLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractProjection<>(this, getRoot());
     getFields().put("concatenatedOriginContract", projection);
     return projection;
  }

  public MoneyV2Projection<SubscriptionLineFragmentProjection<PARENT, ROOT>, ROOT> currentPrice() {
     MoneyV2Projection<SubscriptionLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("currentPrice", projection);
     return projection;
  }

  public AttributeProjection<SubscriptionLineFragmentProjection<PARENT, ROOT>, ROOT> customAttributes(
      ) {
     AttributeProjection<SubscriptionLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public SubscriptionDiscountAllocationProjection<SubscriptionLineFragmentProjection<PARENT, ROOT>, ROOT> discountAllocations(
      ) {
     SubscriptionDiscountAllocationProjection<SubscriptionLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountAllocationProjection<>(this, getRoot());
     getFields().put("discountAllocations", projection);
     return projection;
  }

  public MoneyV2Projection<SubscriptionLineFragmentProjection<PARENT, ROOT>, ROOT> lineDiscountedPrice(
      ) {
     MoneyV2Projection<SubscriptionLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("lineDiscountedPrice", projection);
     return projection;
  }

  public SubscriptionPricingPolicyProjection<SubscriptionLineFragmentProjection<PARENT, ROOT>, ROOT> pricingPolicy(
      ) {
     SubscriptionPricingPolicyProjection<SubscriptionLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionPricingPolicyProjection<>(this, getRoot());
     getFields().put("pricingPolicy", projection);
     return projection;
  }

  public ImageProjection<SubscriptionLineFragmentProjection<PARENT, ROOT>, ROOT> variantImage() {
     ImageProjection<SubscriptionLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("variantImage", projection);
     return projection;
  }

  public WeightProjection<SubscriptionLineFragmentProjection<PARENT, ROOT>, ROOT> weight() {
     WeightProjection<SubscriptionLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new WeightProjection<>(this, getRoot());
     getFields().put("weight", projection);
     return projection;
  }

  public SubscriptionLineFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SubscriptionLineFragmentProjection<PARENT, ROOT> productId() {
    getFields().put("productId", null);
    return this;
  }

  public SubscriptionLineFragmentProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public SubscriptionLineFragmentProjection<PARENT, ROOT> requiresShipping() {
    getFields().put("requiresShipping", null);
    return this;
  }

  public SubscriptionLineFragmentProjection<PARENT, ROOT> sellingPlanId() {
    getFields().put("sellingPlanId", null);
    return this;
  }

  public SubscriptionLineFragmentProjection<PARENT, ROOT> sellingPlanName() {
    getFields().put("sellingPlanName", null);
    return this;
  }

  public SubscriptionLineFragmentProjection<PARENT, ROOT> sku() {
    getFields().put("sku", null);
    return this;
  }

  public SubscriptionLineFragmentProjection<PARENT, ROOT> taxable() {
    getFields().put("taxable", null);
    return this;
  }

  public SubscriptionLineFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public SubscriptionLineFragmentProjection<PARENT, ROOT> variantId() {
    getFields().put("variantId", null);
    return this;
  }

  public SubscriptionLineFragmentProjection<PARENT, ROOT> variantTitle() {
    getFields().put("variantTitle", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SubscriptionLine {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
