package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductBundleComponentOptionSelectionStatusProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductBundleComponentOptionSelectionStatusProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductBundleComponentOptionSelectionStatus"));
  }

  public ProductBundleComponentOptionSelectionStatusProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
