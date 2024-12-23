package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceListFixedPricesByProductBulkUpdateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceListFixedPricesByProductBulkUpdateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceListFixedPricesByProductBulkUpdateUserError"));
  }

  public PriceListFixedPricesByProductBulkUpdateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceListFixedPricesByProductBulkUpdateUserErrorCodeProjection<PriceListFixedPricesByProductBulkUpdateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     PriceListFixedPricesByProductBulkUpdateUserErrorCodeProjection<PriceListFixedPricesByProductBulkUpdateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new PriceListFixedPricesByProductBulkUpdateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public PriceListFixedPricesByProductBulkUpdateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public PriceListFixedPricesByProductBulkUpdateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
