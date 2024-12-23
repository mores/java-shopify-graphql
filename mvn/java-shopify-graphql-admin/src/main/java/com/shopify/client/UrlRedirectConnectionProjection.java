package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UrlRedirectConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UrlRedirectConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("UrlRedirectConnection"));
  }

  public UrlRedirectConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UrlRedirectEdgeProjection<UrlRedirectConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     UrlRedirectEdgeProjection<UrlRedirectConnectionProjection<PARENT, ROOT>, ROOT> projection = new UrlRedirectEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public UrlRedirectProjection<UrlRedirectConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     UrlRedirectProjection<UrlRedirectConnectionProjection<PARENT, ROOT>, ROOT> projection = new UrlRedirectProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<UrlRedirectConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<UrlRedirectConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
