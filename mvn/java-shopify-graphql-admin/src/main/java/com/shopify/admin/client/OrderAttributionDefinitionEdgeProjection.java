package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderAttributionDefinitionEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderAttributionDefinitionEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderAttributionDefinitionEdge"));
  }

  public OrderAttributionDefinitionEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderAttributionDefinitionProjection<OrderAttributionDefinitionEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     OrderAttributionDefinitionProjection<OrderAttributionDefinitionEdgeProjection<PARENT, ROOT>, ROOT> projection = new OrderAttributionDefinitionProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public OrderAttributionDefinitionEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
