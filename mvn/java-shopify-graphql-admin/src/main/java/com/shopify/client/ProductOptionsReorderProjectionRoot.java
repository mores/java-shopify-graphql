package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductOptionsReorderProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductOptionsReorderProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductOptionsReorderPayload"));
  }

  public ProductOptionsReorderProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductProjection<ProductOptionsReorderProjectionRoot<PARENT, ROOT>, ProductOptionsReorderProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductOptionsReorderProjectionRoot<PARENT, ROOT>, ProductOptionsReorderProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public ProductOptionsReorderUserErrorProjection<ProductOptionsReorderProjectionRoot<PARENT, ROOT>, ProductOptionsReorderProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ProductOptionsReorderUserErrorProjection<ProductOptionsReorderProjectionRoot<PARENT, ROOT>, ProductOptionsReorderProjectionRoot<PARENT, ROOT>> projection = new ProductOptionsReorderUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
