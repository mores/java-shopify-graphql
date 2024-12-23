package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldDefinitionConstraintValueEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldDefinitionConstraintValueEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldDefinitionConstraintValueEdge"));
  }

  public MetafieldDefinitionConstraintValueEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionConstraintValueProjection<MetafieldDefinitionConstraintValueEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     MetafieldDefinitionConstraintValueProjection<MetafieldDefinitionConstraintValueEdgeProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConstraintValueProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public MetafieldDefinitionConstraintValueEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
