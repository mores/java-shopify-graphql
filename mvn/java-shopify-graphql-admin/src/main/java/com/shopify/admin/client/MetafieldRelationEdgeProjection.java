package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldRelationEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldRelationEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldRelationEdge"));
  }

  public MetafieldRelationEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldRelationProjection<MetafieldRelationEdgeProjection<PARENT, ROOT>, ROOT> node() {
     MetafieldRelationProjection<MetafieldRelationEdgeProjection<PARENT, ROOT>, ROOT> projection = new MetafieldRelationProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public MetafieldRelationEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
