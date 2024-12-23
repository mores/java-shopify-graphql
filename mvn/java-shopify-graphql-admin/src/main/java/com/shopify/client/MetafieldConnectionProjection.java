package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldConnection"));
  }

  public MetafieldConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldEdgeProjection<MetafieldConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     MetafieldEdgeProjection<MetafieldConnectionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public MetafieldProjection<MetafieldConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     MetafieldProjection<MetafieldConnectionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<MetafieldConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<MetafieldConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
