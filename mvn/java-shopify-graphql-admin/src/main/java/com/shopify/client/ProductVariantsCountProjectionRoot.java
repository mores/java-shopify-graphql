package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantsCountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantsCountProjectionRoot() {
    super(null, null, java.util.Optional.of("Count"));
  }

  public ProductVariantsCountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountPrecisionProjection<ProductVariantsCountProjectionRoot<PARENT, ROOT>, ProductVariantsCountProjectionRoot<PARENT, ROOT>> precision(
      ) {
    CountPrecisionProjection<ProductVariantsCountProjectionRoot<PARENT, ROOT>, ProductVariantsCountProjectionRoot<PARENT, ROOT>> projection = new CountPrecisionProjection<>(this, this);    
    getFields().put("precision", projection);
    return projection;
  }

  public ProductVariantsCountProjectionRoot<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }
}
