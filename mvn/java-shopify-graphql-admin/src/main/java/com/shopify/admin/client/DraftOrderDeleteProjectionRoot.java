package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrderDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrderDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("DraftOrderDeletePayload"));
  }

  public DraftOrderDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<DraftOrderDeleteProjectionRoot<PARENT, ROOT>, DraftOrderDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<DraftOrderDeleteProjectionRoot<PARENT, ROOT>, DraftOrderDeleteProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public DraftOrderDeleteProjectionRoot<PARENT, ROOT> deletedId() {
    getFields().put("deletedId", null);
    return this;
  }
}
