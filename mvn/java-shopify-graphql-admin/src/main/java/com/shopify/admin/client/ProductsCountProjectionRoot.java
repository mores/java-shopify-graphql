package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductsCountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductsCountProjectionRoot() {
    super(null, null, java.util.Optional.of("Count"));
  }

  public ProductsCountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountPrecisionProjection<ProductsCountProjectionRoot<PARENT, ROOT>, ProductsCountProjectionRoot<PARENT, ROOT>> precision(
      ) {
    CountPrecisionProjection<ProductsCountProjectionRoot<PARENT, ROOT>, ProductsCountProjectionRoot<PARENT, ROOT>> projection = new CountPrecisionProjection<>(this, this);    
    getFields().put("precision", projection);
    return projection;
  }

  public ProductsCountProjectionRoot<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }
}
