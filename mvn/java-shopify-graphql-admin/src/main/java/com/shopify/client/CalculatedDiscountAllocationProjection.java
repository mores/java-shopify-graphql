package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CalculatedDiscountAllocationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CalculatedDiscountAllocationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CalculatedDiscountAllocation"));
  }

  public CalculatedDiscountAllocationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<CalculatedDiscountAllocationProjection<PARENT, ROOT>, ROOT> allocatedAmountSet(
      ) {
     MoneyBagProjection<CalculatedDiscountAllocationProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("allocatedAmountSet", projection);
     return projection;
  }

  public CalculatedDiscountApplicationProjection<CalculatedDiscountAllocationProjection<PARENT, ROOT>, ROOT> discountApplication(
      ) {
     CalculatedDiscountApplicationProjection<CalculatedDiscountAllocationProjection<PARENT, ROOT>, ROOT> projection = new CalculatedDiscountApplicationProjection<>(this, getRoot());
     getFields().put("discountApplication", projection);
     return projection;
  }
}
