package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryCustomizationsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryCustomizationsProjectionRoot() {
    super(null, null, java.util.Optional.of("DeliveryCustomizationConnection"));
  }

  public DeliveryCustomizationsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryCustomizationEdgeProjection<DeliveryCustomizationsProjectionRoot<PARENT, ROOT>, DeliveryCustomizationsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    DeliveryCustomizationEdgeProjection<DeliveryCustomizationsProjectionRoot<PARENT, ROOT>, DeliveryCustomizationsProjectionRoot<PARENT, ROOT>> projection = new DeliveryCustomizationEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public DeliveryCustomizationProjection<DeliveryCustomizationsProjectionRoot<PARENT, ROOT>, DeliveryCustomizationsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    DeliveryCustomizationProjection<DeliveryCustomizationsProjectionRoot<PARENT, ROOT>, DeliveryCustomizationsProjectionRoot<PARENT, ROOT>> projection = new DeliveryCustomizationProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<DeliveryCustomizationsProjectionRoot<PARENT, ROOT>, DeliveryCustomizationsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<DeliveryCustomizationsProjectionRoot<PARENT, ROOT>, DeliveryCustomizationsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
