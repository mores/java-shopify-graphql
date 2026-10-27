package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryOptionDefinitionConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryOptionDefinitionConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryOptionDefinitionConnection"));
  }

  public DeliveryOptionDefinitionConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryOptionDefinitionEdgeProjection<DeliveryOptionDefinitionConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     DeliveryOptionDefinitionEdgeProjection<DeliveryOptionDefinitionConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryOptionDefinitionEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public DeliveryOptionDefinitionProjection<DeliveryOptionDefinitionConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     DeliveryOptionDefinitionProjection<DeliveryOptionDefinitionConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryOptionDefinitionProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<DeliveryOptionDefinitionConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<DeliveryOptionDefinitionConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
