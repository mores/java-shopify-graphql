package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AssignedFulfillmentOrdersProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AssignedFulfillmentOrdersProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentOrderConnection"));
  }

  public AssignedFulfillmentOrdersProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderEdgeProjection<AssignedFulfillmentOrdersProjectionRoot<PARENT, ROOT>, AssignedFulfillmentOrdersProjectionRoot<PARENT, ROOT>> edges(
      ) {
    FulfillmentOrderEdgeProjection<AssignedFulfillmentOrdersProjectionRoot<PARENT, ROOT>, AssignedFulfillmentOrdersProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public FulfillmentOrderProjection<AssignedFulfillmentOrdersProjectionRoot<PARENT, ROOT>, AssignedFulfillmentOrdersProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    FulfillmentOrderProjection<AssignedFulfillmentOrdersProjectionRoot<PARENT, ROOT>, AssignedFulfillmentOrdersProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<AssignedFulfillmentOrdersProjectionRoot<PARENT, ROOT>, AssignedFulfillmentOrdersProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<AssignedFulfillmentOrdersProjectionRoot<PARENT, ROOT>, AssignedFulfillmentOrdersProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
