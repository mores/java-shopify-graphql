package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryMethodDefinitionConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryMethodDefinitionConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryMethodDefinitionConnection"));
  }

  public DeliveryMethodDefinitionConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryMethodDefinitionEdgeProjection<DeliveryMethodDefinitionConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     DeliveryMethodDefinitionEdgeProjection<DeliveryMethodDefinitionConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryMethodDefinitionEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public DeliveryMethodDefinitionProjection<DeliveryMethodDefinitionConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     DeliveryMethodDefinitionProjection<DeliveryMethodDefinitionConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryMethodDefinitionProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<DeliveryMethodDefinitionConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<DeliveryMethodDefinitionConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
