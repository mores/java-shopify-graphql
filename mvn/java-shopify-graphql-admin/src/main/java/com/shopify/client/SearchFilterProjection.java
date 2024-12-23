package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SearchFilterProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SearchFilterProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SearchFilter"));
  }

  public SearchFilterProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SearchFilterProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public SearchFilterProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
