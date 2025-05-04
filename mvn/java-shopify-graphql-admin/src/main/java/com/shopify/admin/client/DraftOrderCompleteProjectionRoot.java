package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrderCompleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrderCompleteProjectionRoot() {
    super(null, null, java.util.Optional.of("DraftOrderCompletePayload"));
  }

  public DraftOrderCompleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DraftOrderProjection<DraftOrderCompleteProjectionRoot<PARENT, ROOT>, DraftOrderCompleteProjectionRoot<PARENT, ROOT>> draftOrder(
      ) {
    DraftOrderProjection<DraftOrderCompleteProjectionRoot<PARENT, ROOT>, DraftOrderCompleteProjectionRoot<PARENT, ROOT>> projection = new DraftOrderProjection<>(this, this);    
    getFields().put("draftOrder", projection);
    return projection;
  }

  public UserErrorProjection<DraftOrderCompleteProjectionRoot<PARENT, ROOT>, DraftOrderCompleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<DraftOrderCompleteProjectionRoot<PARENT, ROOT>, DraftOrderCompleteProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
