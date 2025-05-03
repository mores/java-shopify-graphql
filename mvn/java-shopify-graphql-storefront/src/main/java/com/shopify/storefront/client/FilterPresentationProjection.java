package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FilterPresentationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FilterPresentationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FilterPresentation"));
  }

  public FilterPresentationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
