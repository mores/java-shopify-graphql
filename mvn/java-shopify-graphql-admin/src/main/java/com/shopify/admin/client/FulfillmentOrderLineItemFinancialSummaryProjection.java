package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderLineItemFinancialSummaryProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderLineItemFinancialSummaryProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderLineItemFinancialSummary"));
  }

  public FulfillmentOrderLineItemFinancialSummaryProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<FulfillmentOrderLineItemFinancialSummaryProjection<PARENT, ROOT>, ROOT> approximateDiscountedUnitPriceSet(
      ) {
     MoneyBagProjection<FulfillmentOrderLineItemFinancialSummaryProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("approximateDiscountedUnitPriceSet", projection);
     return projection;
  }

  public FinancialSummaryDiscountAllocationProjection<FulfillmentOrderLineItemFinancialSummaryProjection<PARENT, ROOT>, ROOT> discountAllocations(
      ) {
     FinancialSummaryDiscountAllocationProjection<FulfillmentOrderLineItemFinancialSummaryProjection<PARENT, ROOT>, ROOT> projection = new FinancialSummaryDiscountAllocationProjection<>(this, getRoot());
     getFields().put("discountAllocations", projection);
     return projection;
  }

  public MoneyBagProjection<FulfillmentOrderLineItemFinancialSummaryProjection<PARENT, ROOT>, ROOT> originalUnitPriceSet(
      ) {
     MoneyBagProjection<FulfillmentOrderLineItemFinancialSummaryProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalUnitPriceSet", projection);
     return projection;
  }

  public FulfillmentOrderLineItemFinancialSummaryProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }
}
