package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UrlRedirectEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UrlRedirectEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("UrlRedirectEdge"));
  }

  public UrlRedirectEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UrlRedirectProjection<UrlRedirectEdgeProjection<PARENT, ROOT>, ROOT> node() {
     UrlRedirectProjection<UrlRedirectEdgeProjection<PARENT, ROOT>, ROOT> projection = new UrlRedirectProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public UrlRedirectEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
