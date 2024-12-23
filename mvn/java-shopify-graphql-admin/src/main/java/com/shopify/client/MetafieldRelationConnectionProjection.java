package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldRelationConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldRelationConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldRelationConnection"));
  }

  public MetafieldRelationConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldRelationEdgeProjection<MetafieldRelationConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     MetafieldRelationEdgeProjection<MetafieldRelationConnectionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldRelationEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public MetafieldRelationProjection<MetafieldRelationConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     MetafieldRelationProjection<MetafieldRelationConnectionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldRelationProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<MetafieldRelationConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<MetafieldRelationConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
