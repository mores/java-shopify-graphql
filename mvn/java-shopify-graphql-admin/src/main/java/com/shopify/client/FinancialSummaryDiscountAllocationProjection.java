package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FinancialSummaryDiscountAllocationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FinancialSummaryDiscountAllocationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FinancialSummaryDiscountAllocation"));
  }

  public FinancialSummaryDiscountAllocationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<FinancialSummaryDiscountAllocationProjection<PARENT, ROOT>, ROOT> approximateAllocatedAmountPerItem(
      ) {
     MoneyBagProjection<FinancialSummaryDiscountAllocationProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("approximateAllocatedAmountPerItem", projection);
     return projection;
  }

  public FinancialSummaryDiscountApplicationProjection<FinancialSummaryDiscountAllocationProjection<PARENT, ROOT>, ROOT> discountApplication(
      ) {
     FinancialSummaryDiscountApplicationProjection<FinancialSummaryDiscountAllocationProjection<PARENT, ROOT>, ROOT> projection = new FinancialSummaryDiscountApplicationProjection<>(this, getRoot());
     getFields().put("discountApplication", projection);
     return projection;
  }
}
