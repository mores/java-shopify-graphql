package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantInventoryPolicyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantInventoryPolicyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductVariantInventoryPolicy"));
  }

  public ProductVariantInventoryPolicyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
