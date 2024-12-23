package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ManualHoldsFulfillmentOrdersProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ManualHoldsFulfillmentOrdersProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentOrderConnection"));
  }

  public ManualHoldsFulfillmentOrdersProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderEdgeProjection<ManualHoldsFulfillmentOrdersProjectionRoot<PARENT, ROOT>, ManualHoldsFulfillmentOrdersProjectionRoot<PARENT, ROOT>> edges(
      ) {
    FulfillmentOrderEdgeProjection<ManualHoldsFulfillmentOrdersProjectionRoot<PARENT, ROOT>, ManualHoldsFulfillmentOrdersProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public FulfillmentOrderProjection<ManualHoldsFulfillmentOrdersProjectionRoot<PARENT, ROOT>, ManualHoldsFulfillmentOrdersProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    FulfillmentOrderProjection<ManualHoldsFulfillmentOrdersProjectionRoot<PARENT, ROOT>, ManualHoldsFulfillmentOrdersProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<ManualHoldsFulfillmentOrdersProjectionRoot<PARENT, ROOT>, ManualHoldsFulfillmentOrdersProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<ManualHoldsFulfillmentOrdersProjectionRoot<PARENT, ROOT>, ManualHoldsFulfillmentOrdersProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
