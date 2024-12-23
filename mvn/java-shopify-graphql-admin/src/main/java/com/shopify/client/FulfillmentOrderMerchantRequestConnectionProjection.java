package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderMerchantRequestConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderMerchantRequestConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderMerchantRequestConnection"));
  }

  public FulfillmentOrderMerchantRequestConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderMerchantRequestEdgeProjection<FulfillmentOrderMerchantRequestConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     FulfillmentOrderMerchantRequestEdgeProjection<FulfillmentOrderMerchantRequestConnectionProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderMerchantRequestEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public FulfillmentOrderMerchantRequestProjection<FulfillmentOrderMerchantRequestConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     FulfillmentOrderMerchantRequestProjection<FulfillmentOrderMerchantRequestConnectionProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderMerchantRequestProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<FulfillmentOrderMerchantRequestConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<FulfillmentOrderMerchantRequestConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
