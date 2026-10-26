package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RequestedOrderEditFinancialSummaryProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RequestedOrderEditFinancialSummaryProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RequestedOrderEditFinancialSummary"));
  }

  public RequestedOrderEditFinancialSummaryProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<RequestedOrderEditFinancialSummaryProjection<PARENT, ROOT>, ROOT> editOrderLevelDiscountSubtotalSet(
      ) {
     MoneyBagProjection<RequestedOrderEditFinancialSummaryProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("editOrderLevelDiscountSubtotalSet", projection);
     return projection;
  }

  public MoneyBagProjection<RequestedOrderEditFinancialSummaryProjection<PARENT, ROOT>, ROOT> editSubtotalBeforeTargetAllDiscountsSet(
      ) {
     MoneyBagProjection<RequestedOrderEditFinancialSummaryProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("editSubtotalBeforeTargetAllDiscountsSet", projection);
     return projection;
  }

  public MoneyBagProjection<RequestedOrderEditFinancialSummaryProjection<PARENT, ROOT>, ROOT> editSubtotalSet(
      ) {
     MoneyBagProjection<RequestedOrderEditFinancialSummaryProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("editSubtotalSet", projection);
     return projection;
  }

  public MoneyBagProjection<RequestedOrderEditFinancialSummaryProjection<PARENT, ROOT>, ROOT> editSubtotalWithCartDiscountSet(
      ) {
     MoneyBagProjection<RequestedOrderEditFinancialSummaryProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("editSubtotalWithCartDiscountSet", projection);
     return projection;
  }

  public MoneyBagProjection<RequestedOrderEditFinancialSummaryProjection<PARENT, ROOT>, ROOT> editTotalSet(
      ) {
     MoneyBagProjection<RequestedOrderEditFinancialSummaryProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("editTotalSet", projection);
     return projection;
  }

  public MoneyBagProjection<RequestedOrderEditFinancialSummaryProjection<PARENT, ROOT>, ROOT> editTotalTaxSet(
      ) {
     MoneyBagProjection<RequestedOrderEditFinancialSummaryProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("editTotalTaxSet", projection);
     return projection;
  }
}
