package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderMerchantRequestEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderMerchantRequestEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderMerchantRequestEdge"));
  }

  public FulfillmentOrderMerchantRequestEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderMerchantRequestProjection<FulfillmentOrderMerchantRequestEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     FulfillmentOrderMerchantRequestProjection<FulfillmentOrderMerchantRequestEdgeProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderMerchantRequestProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public FulfillmentOrderMerchantRequestEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
