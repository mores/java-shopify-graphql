package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductFullSyncProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductFullSyncProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductFullSyncPayload"));
  }

  public ProductFullSyncProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductFullSyncUserErrorProjection<ProductFullSyncProjectionRoot<PARENT, ROOT>, ProductFullSyncProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ProductFullSyncUserErrorProjection<ProductFullSyncProjectionRoot<PARENT, ROOT>, ProductFullSyncProjectionRoot<PARENT, ROOT>> projection = new ProductFullSyncUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
