package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderAttributionDefinitionConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderAttributionDefinitionConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderAttributionDefinitionConnection"));
  }

  public OrderAttributionDefinitionConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderAttributionDefinitionEdgeProjection<OrderAttributionDefinitionConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     OrderAttributionDefinitionEdgeProjection<OrderAttributionDefinitionConnectionProjection<PARENT, ROOT>, ROOT> projection = new OrderAttributionDefinitionEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public OrderAttributionDefinitionProjection<OrderAttributionDefinitionConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     OrderAttributionDefinitionProjection<OrderAttributionDefinitionConnectionProjection<PARENT, ROOT>, ROOT> projection = new OrderAttributionDefinitionProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<OrderAttributionDefinitionConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<OrderAttributionDefinitionConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
