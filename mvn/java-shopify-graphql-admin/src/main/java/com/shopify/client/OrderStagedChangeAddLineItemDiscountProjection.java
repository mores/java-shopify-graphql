package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderStagedChangeAddLineItemDiscountProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderStagedChangeAddLineItemDiscountProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderStagedChangeAddLineItemDiscount"));
  }

  public OrderStagedChangeAddLineItemDiscountProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PricingValueProjection<OrderStagedChangeAddLineItemDiscountProjection<PARENT, ROOT>, ROOT> value(
      ) {
     PricingValueProjection<OrderStagedChangeAddLineItemDiscountProjection<PARENT, ROOT>, ROOT> projection = new PricingValueProjection<>(this, getRoot());
     getFields().put("value", projection);
     return projection;
  }

  public OrderStagedChangeAddLineItemDiscountProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public OrderStagedChangeAddLineItemDiscountProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
