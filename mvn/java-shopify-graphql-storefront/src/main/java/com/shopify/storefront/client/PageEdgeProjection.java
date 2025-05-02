package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PageEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PageEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PageEdge"));
  }

  public PageEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PageProjection<PageEdgeProjection<PARENT, ROOT>, ROOT> node() {
     PageProjection<PageEdgeProjection<PARENT, ROOT>, ROOT> projection = new PageProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public PageEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
