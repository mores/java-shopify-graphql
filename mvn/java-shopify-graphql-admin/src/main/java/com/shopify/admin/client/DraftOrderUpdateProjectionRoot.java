package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrderUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrderUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("DraftOrderUpdatePayload"));
  }

  public DraftOrderUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DraftOrderProjection<DraftOrderUpdateProjectionRoot<PARENT, ROOT>, DraftOrderUpdateProjectionRoot<PARENT, ROOT>> draftOrder(
      ) {
    DraftOrderProjection<DraftOrderUpdateProjectionRoot<PARENT, ROOT>, DraftOrderUpdateProjectionRoot<PARENT, ROOT>> projection = new DraftOrderProjection<>(this, this);    
    getFields().put("draftOrder", projection);
    return projection;
  }

  public UserErrorProjection<DraftOrderUpdateProjectionRoot<PARENT, ROOT>, DraftOrderUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<DraftOrderUpdateProjectionRoot<PARENT, ROOT>, DraftOrderUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
