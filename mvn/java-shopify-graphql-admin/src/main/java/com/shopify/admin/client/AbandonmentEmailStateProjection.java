package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AbandonmentEmailStateProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AbandonmentEmailStateProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AbandonmentEmailState"));
  }

  public AbandonmentEmailStateProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
