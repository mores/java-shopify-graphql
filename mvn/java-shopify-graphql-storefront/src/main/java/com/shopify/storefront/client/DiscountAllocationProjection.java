package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountAllocationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountAllocationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountAllocation"));
  }

  public DiscountAllocationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<DiscountAllocationProjection<PARENT, ROOT>, ROOT> allocatedAmount() {
     MoneyV2Projection<DiscountAllocationProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("allocatedAmount", projection);
     return projection;
  }

  public DiscountApplicationProjection<DiscountAllocationProjection<PARENT, ROOT>, ROOT> discountApplication(
      ) {
     DiscountApplicationProjection<DiscountAllocationProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationProjection<>(this, getRoot());
     getFields().put("discountApplication", projection);
     return projection;
  }
}
