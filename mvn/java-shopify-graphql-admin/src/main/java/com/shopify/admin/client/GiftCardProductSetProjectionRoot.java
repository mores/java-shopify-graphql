package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardProductSetProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardProductSetProjectionRoot() {
    super(null, null, java.util.Optional.of("GiftCardProductSetPayload"));
  }

  public GiftCardProductSetProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<GiftCardProductSetProjectionRoot<PARENT, ROOT>, GiftCardProductSetProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<GiftCardProductSetProjectionRoot<PARENT, ROOT>, GiftCardProductSetProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public ProductSetOperationProjection<GiftCardProductSetProjectionRoot<PARENT, ROOT>, GiftCardProductSetProjectionRoot<PARENT, ROOT>> productSetOperation(
      ) {
    ProductSetOperationProjection<GiftCardProductSetProjectionRoot<PARENT, ROOT>, GiftCardProductSetProjectionRoot<PARENT, ROOT>> projection = new ProductSetOperationProjection<>(this, this);    
    getFields().put("productSetOperation", projection);
    return projection;
  }

  public GiftCardProductSetUserErrorProjection<GiftCardProductSetProjectionRoot<PARENT, ROOT>, GiftCardProductSetProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    GiftCardProductSetUserErrorProjection<GiftCardProductSetProjectionRoot<PARENT, ROOT>, GiftCardProductSetProjectionRoot<PARENT, ROOT>> projection = new GiftCardProductSetUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
