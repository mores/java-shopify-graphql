package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerProductSubscriberStatusProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerProductSubscriberStatusProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerProductSubscriberStatus"));
  }

  public CustomerProductSubscriberStatusProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}