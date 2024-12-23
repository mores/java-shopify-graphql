package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldStorefrontVisibilityEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldStorefrontVisibilityEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldStorefrontVisibilityEdge"));
  }

  public MetafieldStorefrontVisibilityEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldStorefrontVisibilityProjection<MetafieldStorefrontVisibilityEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     MetafieldStorefrontVisibilityProjection<MetafieldStorefrontVisibilityEdgeProjection<PARENT, ROOT>, ROOT> projection = new MetafieldStorefrontVisibilityProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public MetafieldStorefrontVisibilityEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
