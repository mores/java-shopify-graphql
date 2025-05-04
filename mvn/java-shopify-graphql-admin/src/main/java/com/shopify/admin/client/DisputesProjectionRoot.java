package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DisputesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DisputesProjectionRoot() {
    super(null, null, java.util.Optional.of("ShopifyPaymentsDisputeConnection"));
  }

  public DisputesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsDisputeEdgeProjection<DisputesProjectionRoot<PARENT, ROOT>, DisputesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    ShopifyPaymentsDisputeEdgeProjection<DisputesProjectionRoot<PARENT, ROOT>, DisputesProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsDisputeEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public ShopifyPaymentsDisputeProjection<DisputesProjectionRoot<PARENT, ROOT>, DisputesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    ShopifyPaymentsDisputeProjection<DisputesProjectionRoot<PARENT, ROOT>, DisputesProjectionRoot<PARENT, ROOT>> projection = new ShopifyPaymentsDisputeProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<DisputesProjectionRoot<PARENT, ROOT>, DisputesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<DisputesProjectionRoot<PARENT, ROOT>, DisputesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
