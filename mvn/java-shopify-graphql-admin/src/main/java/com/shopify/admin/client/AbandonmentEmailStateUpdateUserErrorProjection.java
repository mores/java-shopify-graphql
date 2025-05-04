package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AbandonmentEmailStateUpdateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AbandonmentEmailStateUpdateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AbandonmentEmailStateUpdateUserError"));
  }

  public AbandonmentEmailStateUpdateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AbandonmentEmailStateUpdateUserErrorCodeProjection<AbandonmentEmailStateUpdateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     AbandonmentEmailStateUpdateUserErrorCodeProjection<AbandonmentEmailStateUpdateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new AbandonmentEmailStateUpdateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public AbandonmentEmailStateUpdateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public AbandonmentEmailStateUpdateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
