package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductOptionsReorderUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductOptionsReorderUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductOptionsReorderUserError"));
  }

  public ProductOptionsReorderUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductOptionsReorderUserErrorCodeProjection<ProductOptionsReorderUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     ProductOptionsReorderUserErrorCodeProjection<ProductOptionsReorderUserErrorProjection<PARENT, ROOT>, ROOT> projection = new ProductOptionsReorderUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public ProductOptionsReorderUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public ProductOptionsReorderUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
