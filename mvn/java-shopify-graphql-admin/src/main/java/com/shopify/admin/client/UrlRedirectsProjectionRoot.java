package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UrlRedirectsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UrlRedirectsProjectionRoot() {
    super(null, null, java.util.Optional.of("UrlRedirectConnection"));
  }

  public UrlRedirectsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UrlRedirectEdgeProjection<UrlRedirectsProjectionRoot<PARENT, ROOT>, UrlRedirectsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    UrlRedirectEdgeProjection<UrlRedirectsProjectionRoot<PARENT, ROOT>, UrlRedirectsProjectionRoot<PARENT, ROOT>> projection = new UrlRedirectEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public UrlRedirectProjection<UrlRedirectsProjectionRoot<PARENT, ROOT>, UrlRedirectsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    UrlRedirectProjection<UrlRedirectsProjectionRoot<PARENT, ROOT>, UrlRedirectsProjectionRoot<PARENT, ROOT>> projection = new UrlRedirectProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<UrlRedirectsProjectionRoot<PARENT, ROOT>, UrlRedirectsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<UrlRedirectsProjectionRoot<PARENT, ROOT>, UrlRedirectsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
