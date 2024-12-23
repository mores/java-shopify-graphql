package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryCustomizationConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryCustomizationConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryCustomizationConnection"));
  }

  public DeliveryCustomizationConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryCustomizationEdgeProjection<DeliveryCustomizationConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     DeliveryCustomizationEdgeProjection<DeliveryCustomizationConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCustomizationEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public DeliveryCustomizationProjection<DeliveryCustomizationConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     DeliveryCustomizationProjection<DeliveryCustomizationConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCustomizationProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<DeliveryCustomizationConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<DeliveryCustomizationConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
