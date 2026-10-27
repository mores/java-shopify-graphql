package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RequestedOrderEditCalculateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RequestedOrderEditCalculateProjectionRoot() {
    super(null, null, java.util.Optional.of("CalculatedRequestedOrderEdit"));
  }

  public RequestedOrderEditCalculateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RequestedOrderEditFinancialSummaryProjection<RequestedOrderEditCalculateProjectionRoot<PARENT, ROOT>, RequestedOrderEditCalculateProjectionRoot<PARENT, ROOT>> financialSummary(
      ) {
    RequestedOrderEditFinancialSummaryProjection<RequestedOrderEditCalculateProjectionRoot<PARENT, ROOT>, RequestedOrderEditCalculateProjectionRoot<PARENT, ROOT>> projection = new RequestedOrderEditFinancialSummaryProjection<>(this, this);    
    getFields().put("financialSummary", projection);
    return projection;
  }

  public CalculatedRequestedOrderEditLineItemsProjection<RequestedOrderEditCalculateProjectionRoot<PARENT, ROOT>, RequestedOrderEditCalculateProjectionRoot<PARENT, ROOT>> lineItems(
      ) {
    CalculatedRequestedOrderEditLineItemsProjection<RequestedOrderEditCalculateProjectionRoot<PARENT, ROOT>, RequestedOrderEditCalculateProjectionRoot<PARENT, ROOT>> projection = new CalculatedRequestedOrderEditLineItemsProjection<>(this, this);    
    getFields().put("lineItems", projection);
    return projection;
  }
}
