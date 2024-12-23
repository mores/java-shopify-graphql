package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductUnpublishProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductUnpublishProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductUnpublishPayload"));
  }

  public ProductUnpublishProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductUnpublishProjectionRoot<PARENT, ROOT>, ProductUnpublishProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductUnpublishProjectionRoot<PARENT, ROOT>, ProductUnpublishProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public ShopProjection<ProductUnpublishProjectionRoot<PARENT, ROOT>, ProductUnpublishProjectionRoot<PARENT, ROOT>> shop(
      ) {
    ShopProjection<ProductUnpublishProjectionRoot<PARENT, ROOT>, ProductUnpublishProjectionRoot<PARENT, ROOT>> projection = new ShopProjection<>(this, this);    
    getFields().put("shop", projection);
    return projection;
  }

  public UserErrorProjection<ProductUnpublishProjectionRoot<PARENT, ROOT>, ProductUnpublishProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<ProductUnpublishProjectionRoot<PARENT, ROOT>, ProductUnpublishProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
