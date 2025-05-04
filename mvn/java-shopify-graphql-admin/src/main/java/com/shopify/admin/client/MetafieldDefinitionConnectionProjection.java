package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldDefinitionConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldDefinitionConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldDefinitionConnection"));
  }

  public MetafieldDefinitionConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionEdgeProjection<MetafieldDefinitionConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     MetafieldDefinitionEdgeProjection<MetafieldDefinitionConnectionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public MetafieldDefinitionProjection<MetafieldDefinitionConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     MetafieldDefinitionProjection<MetafieldDefinitionConnectionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<MetafieldDefinitionConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<MetafieldDefinitionConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
