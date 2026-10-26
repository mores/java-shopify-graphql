package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderAttributionDefinitionsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderAttributionDefinitionsProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderAttributionDefinitionConnection"));
  }

  public OrderAttributionDefinitionsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderAttributionDefinitionEdgeProjection<OrderAttributionDefinitionsProjectionRoot<PARENT, ROOT>, OrderAttributionDefinitionsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    OrderAttributionDefinitionEdgeProjection<OrderAttributionDefinitionsProjectionRoot<PARENT, ROOT>, OrderAttributionDefinitionsProjectionRoot<PARENT, ROOT>> projection = new OrderAttributionDefinitionEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public OrderAttributionDefinitionProjection<OrderAttributionDefinitionsProjectionRoot<PARENT, ROOT>, OrderAttributionDefinitionsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    OrderAttributionDefinitionProjection<OrderAttributionDefinitionsProjectionRoot<PARENT, ROOT>, OrderAttributionDefinitionsProjectionRoot<PARENT, ROOT>> projection = new OrderAttributionDefinitionProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<OrderAttributionDefinitionsProjectionRoot<PARENT, ROOT>, OrderAttributionDefinitionsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<OrderAttributionDefinitionsProjectionRoot<PARENT, ROOT>, OrderAttributionDefinitionsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
