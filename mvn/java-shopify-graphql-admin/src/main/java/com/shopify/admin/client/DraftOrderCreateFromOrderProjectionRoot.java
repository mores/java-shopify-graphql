package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrderCreateFromOrderProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrderCreateFromOrderProjectionRoot() {
    super(null, null, java.util.Optional.of("DraftOrderCreateFromOrderPayload"));
  }

  public DraftOrderCreateFromOrderProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DraftOrderProjection<DraftOrderCreateFromOrderProjectionRoot<PARENT, ROOT>, DraftOrderCreateFromOrderProjectionRoot<PARENT, ROOT>> draftOrder(
      ) {
    DraftOrderProjection<DraftOrderCreateFromOrderProjectionRoot<PARENT, ROOT>, DraftOrderCreateFromOrderProjectionRoot<PARENT, ROOT>> projection = new DraftOrderProjection<>(this, this);    
    getFields().put("draftOrder", projection);
    return projection;
  }

  public UserErrorProjection<DraftOrderCreateFromOrderProjectionRoot<PARENT, ROOT>, DraftOrderCreateFromOrderProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<DraftOrderCreateFromOrderProjectionRoot<PARENT, ROOT>, DraftOrderCreateFromOrderProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
