package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductBundleComponentQuantityOptionValueProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductBundleComponentQuantityOptionValueProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductBundleComponentQuantityOptionValue"));
  }

  public ProductBundleComponentQuantityOptionValueProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductBundleComponentQuantityOptionValueProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public ProductBundleComponentQuantityOptionValueProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }
}
