package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CalculatedRequestedOrderEditProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CalculatedRequestedOrderEditProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CalculatedRequestedOrderEdit"));
  }

  public CalculatedRequestedOrderEditProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RequestedOrderEditFinancialSummaryProjection<CalculatedRequestedOrderEditProjection<PARENT, ROOT>, ROOT> financialSummary(
      ) {
     RequestedOrderEditFinancialSummaryProjection<CalculatedRequestedOrderEditProjection<PARENT, ROOT>, ROOT> projection = new RequestedOrderEditFinancialSummaryProjection<>(this, getRoot());
     getFields().put("financialSummary", projection);
     return projection;
  }

  public CalculatedRequestedOrderEditLineItemsProjection<CalculatedRequestedOrderEditProjection<PARENT, ROOT>, ROOT> lineItems(
      ) {
     CalculatedRequestedOrderEditLineItemsProjection<CalculatedRequestedOrderEditProjection<PARENT, ROOT>, ROOT> projection = new CalculatedRequestedOrderEditLineItemsProjection<>(this, getRoot());
     getFields().put("lineItems", projection);
     return projection;
  }
}
