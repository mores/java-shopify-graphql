package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeletionEventSubjectTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeletionEventSubjectTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeletionEventSubjectType"));
  }

  public DeletionEventSubjectTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
