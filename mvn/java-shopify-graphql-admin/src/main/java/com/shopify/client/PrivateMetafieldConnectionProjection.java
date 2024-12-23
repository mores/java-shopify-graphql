package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PrivateMetafieldConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PrivateMetafieldConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PrivateMetafieldConnection"));
  }

  public PrivateMetafieldConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PrivateMetafieldEdgeProjection<PrivateMetafieldConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     PrivateMetafieldEdgeProjection<PrivateMetafieldConnectionProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public PrivateMetafieldProjection<PrivateMetafieldConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     PrivateMetafieldProjection<PrivateMetafieldConnectionProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<PrivateMetafieldConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<PrivateMetafieldConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
