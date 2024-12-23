package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrderDuplicateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrderDuplicateProjectionRoot() {
    super(null, null, java.util.Optional.of("DraftOrderDuplicatePayload"));
  }

  public DraftOrderDuplicateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DraftOrderProjection<DraftOrderDuplicateProjectionRoot<PARENT, ROOT>, DraftOrderDuplicateProjectionRoot<PARENT, ROOT>> draftOrder(
      ) {
    DraftOrderProjection<DraftOrderDuplicateProjectionRoot<PARENT, ROOT>, DraftOrderDuplicateProjectionRoot<PARENT, ROOT>> projection = new DraftOrderProjection<>(this, this);    
    getFields().put("draftOrder", projection);
    return projection;
  }

  public UserErrorProjection<DraftOrderDuplicateProjectionRoot<PARENT, ROOT>, DraftOrderDuplicateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<DraftOrderDuplicateProjectionRoot<PARENT, ROOT>, DraftOrderDuplicateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
