package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FilterTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FilterTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FilterType"));
  }

  public FilterTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
