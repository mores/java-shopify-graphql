package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class FulfillmentOrderLineItemFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public FulfillmentOrderLineItemFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderLineItem"));
  }

  public FulfillmentOrderLineItemFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderLineItemFinancialSummaryProjection<FulfillmentOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> financialSummaries(
      ) {
     FulfillmentOrderLineItemFinancialSummaryProjection<FulfillmentOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderLineItemFinancialSummaryProjection<>(this, getRoot());
     getFields().put("financialSummaries", projection);
     return projection;
  }

  public ImageProjection<FulfillmentOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<FulfillmentOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public LineItemProjection<FulfillmentOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> lineItem(
      ) {
     LineItemProjection<FulfillmentOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new LineItemProjection<>(this, getRoot());
     getFields().put("lineItem", projection);
     return projection;
  }

  public MoneyBagProjection<FulfillmentOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> originalUnitPriceSet(
      ) {
     MoneyBagProjection<FulfillmentOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalUnitPriceSet", projection);
     return projection;
  }

  public ProductVariantProjection<FulfillmentOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> variant(
      ) {
     ProductVariantProjection<FulfillmentOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("variant", projection);
     return projection;
  }

  public FulfillmentOrderLineItemWarningProjection<FulfillmentOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> warnings(
      ) {
     FulfillmentOrderLineItemWarningProjection<FulfillmentOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderLineItemWarningProjection<>(this, getRoot());
     getFields().put("warnings", projection);
     return projection;
  }

  public WeightProjection<FulfillmentOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> weight() {
     WeightProjection<FulfillmentOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new WeightProjection<>(this, getRoot());
     getFields().put("weight", projection);
     return projection;
  }

  public FulfillmentOrderLineItemFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public FulfillmentOrderLineItemFragmentProjection<PARENT, ROOT> inventoryItemId() {
    getFields().put("inventoryItemId", null);
    return this;
  }

  public FulfillmentOrderLineItemFragmentProjection<PARENT, ROOT> productTitle() {
    getFields().put("productTitle", null);
    return this;
  }

  public FulfillmentOrderLineItemFragmentProjection<PARENT, ROOT> remainingQuantity() {
    getFields().put("remainingQuantity", null);
    return this;
  }

  public FulfillmentOrderLineItemFragmentProjection<PARENT, ROOT> requiresShipping() {
    getFields().put("requiresShipping", null);
    return this;
  }

  public FulfillmentOrderLineItemFragmentProjection<PARENT, ROOT> sku() {
    getFields().put("sku", null);
    return this;
  }

  public FulfillmentOrderLineItemFragmentProjection<PARENT, ROOT> totalQuantity() {
    getFields().put("totalQuantity", null);
    return this;
  }

  public FulfillmentOrderLineItemFragmentProjection<PARENT, ROOT> variantTitle() {
    getFields().put("variantTitle", null);
    return this;
  }

  public FulfillmentOrderLineItemFragmentProjection<PARENT, ROOT> vendor() {
    getFields().put("vendor", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on FulfillmentOrderLineItem {");
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
