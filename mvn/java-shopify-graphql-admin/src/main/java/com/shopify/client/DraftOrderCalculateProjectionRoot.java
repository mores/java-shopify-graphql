package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrderCalculateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrderCalculateProjectionRoot() {
    super(null, null, java.util.Optional.of("DraftOrderCalculatePayload"));
  }

  public DraftOrderCalculateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CalculatedDraftOrderProjection<DraftOrderCalculateProjectionRoot<PARENT, ROOT>, DraftOrderCalculateProjectionRoot<PARENT, ROOT>> calculatedDraftOrder(
      ) {
    CalculatedDraftOrderProjection<DraftOrderCalculateProjectionRoot<PARENT, ROOT>, DraftOrderCalculateProjectionRoot<PARENT, ROOT>> projection = new CalculatedDraftOrderProjection<>(this, this);    
    getFields().put("calculatedDraftOrder", projection);
    return projection;
  }

  public UserErrorProjection<DraftOrderCalculateProjectionRoot<PARENT, ROOT>, DraftOrderCalculateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<DraftOrderCalculateProjectionRoot<PARENT, ROOT>, DraftOrderCalculateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
