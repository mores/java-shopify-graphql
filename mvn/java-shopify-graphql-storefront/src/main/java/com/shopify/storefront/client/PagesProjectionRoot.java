package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PagesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PagesProjectionRoot() {
    super(null, null, java.util.Optional.of("PageConnection"));
  }

  public PagesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PageEdgeProjection<PagesProjectionRoot<PARENT, ROOT>, PagesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    PageEdgeProjection<PagesProjectionRoot<PARENT, ROOT>, PagesProjectionRoot<PARENT, ROOT>> projection = new PageEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public PageProjection<PagesProjectionRoot<PARENT, ROOT>, PagesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    PageProjection<PagesProjectionRoot<PARENT, ROOT>, PagesProjectionRoot<PARENT, ROOT>> projection = new PageProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<PagesProjectionRoot<PARENT, ROOT>, PagesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<PagesProjectionRoot<PARENT, ROOT>, PagesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
