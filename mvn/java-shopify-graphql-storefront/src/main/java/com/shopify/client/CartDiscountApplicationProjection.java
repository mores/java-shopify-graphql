package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartDiscountApplicationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartDiscountApplicationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartDiscountApplication"));
  }

  public CartDiscountApplicationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountApplicationAllocationMethodProjection<CartDiscountApplicationProjection<PARENT, ROOT>, ROOT> allocationMethod(
      ) {
     DiscountApplicationAllocationMethodProjection<CartDiscountApplicationProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationAllocationMethodProjection<>(this, getRoot());
     getFields().put("allocationMethod", projection);
     return projection;
  }

  public DiscountApplicationTargetSelectionProjection<CartDiscountApplicationProjection<PARENT, ROOT>, ROOT> targetSelection(
      ) {
     DiscountApplicationTargetSelectionProjection<CartDiscountApplicationProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationTargetSelectionProjection<>(this, getRoot());
     getFields().put("targetSelection", projection);
     return projection;
  }

  public DiscountApplicationTargetTypeProjection<CartDiscountApplicationProjection<PARENT, ROOT>, ROOT> targetType(
      ) {
     DiscountApplicationTargetTypeProjection<CartDiscountApplicationProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationTargetTypeProjection<>(this, getRoot());
     getFields().put("targetType", projection);
     return projection;
  }

  public PricingValueProjection<CartDiscountApplicationProjection<PARENT, ROOT>, ROOT> value() {
     PricingValueProjection<CartDiscountApplicationProjection<PARENT, ROOT>, ROOT> projection = new PricingValueProjection<>(this, getRoot());
     getFields().put("value", projection);
     return projection;
  }
}
