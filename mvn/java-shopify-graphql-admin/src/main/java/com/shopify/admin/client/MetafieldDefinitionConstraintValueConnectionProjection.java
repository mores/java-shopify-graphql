package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldDefinitionConstraintValueConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldDefinitionConstraintValueConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldDefinitionConstraintValueConnection"));
  }

  public MetafieldDefinitionConstraintValueConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionConstraintValueEdgeProjection<MetafieldDefinitionConstraintValueConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     MetafieldDefinitionConstraintValueEdgeProjection<MetafieldDefinitionConstraintValueConnectionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConstraintValueEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public MetafieldDefinitionConstraintValueProjection<MetafieldDefinitionConstraintValueConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     MetafieldDefinitionConstraintValueProjection<MetafieldDefinitionConstraintValueConnectionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConstraintValueProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<MetafieldDefinitionConstraintValueConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<MetafieldDefinitionConstraintValueConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
