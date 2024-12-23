package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionRuleColumnProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionRuleColumnProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionRuleColumn"));
  }

  public CollectionRuleColumnProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
