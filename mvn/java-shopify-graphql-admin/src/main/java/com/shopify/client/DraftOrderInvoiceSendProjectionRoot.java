package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrderInvoiceSendProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrderInvoiceSendProjectionRoot() {
    super(null, null, java.util.Optional.of("DraftOrderInvoiceSendPayload"));
  }

  public DraftOrderInvoiceSendProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DraftOrderProjection<DraftOrderInvoiceSendProjectionRoot<PARENT, ROOT>, DraftOrderInvoiceSendProjectionRoot<PARENT, ROOT>> draftOrder(
      ) {
    DraftOrderProjection<DraftOrderInvoiceSendProjectionRoot<PARENT, ROOT>, DraftOrderInvoiceSendProjectionRoot<PARENT, ROOT>> projection = new DraftOrderProjection<>(this, this);    
    getFields().put("draftOrder", projection);
    return projection;
  }

  public UserErrorProjection<DraftOrderInvoiceSendProjectionRoot<PARENT, ROOT>, DraftOrderInvoiceSendProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<DraftOrderInvoiceSendProjectionRoot<PARENT, ROOT>, DraftOrderInvoiceSendProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
