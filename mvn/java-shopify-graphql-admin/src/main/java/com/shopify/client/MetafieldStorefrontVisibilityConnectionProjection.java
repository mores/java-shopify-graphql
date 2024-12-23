package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldStorefrontVisibilityConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldStorefrontVisibilityConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldStorefrontVisibilityConnection"));
  }

  public MetafieldStorefrontVisibilityConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldStorefrontVisibilityEdgeProjection<MetafieldStorefrontVisibilityConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     MetafieldStorefrontVisibilityEdgeProjection<MetafieldStorefrontVisibilityConnectionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldStorefrontVisibilityEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public MetafieldStorefrontVisibilityProjection<MetafieldStorefrontVisibilityConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     MetafieldStorefrontVisibilityProjection<MetafieldStorefrontVisibilityConnectionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldStorefrontVisibilityProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<MetafieldStorefrontVisibilityConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<MetafieldStorefrontVisibilityConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
