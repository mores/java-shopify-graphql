package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductBundleComponentOptionSelectionValueProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductBundleComponentOptionSelectionValueProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductBundleComponentOptionSelectionValue"));
  }

  public ProductBundleComponentOptionSelectionValueProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductBundleComponentOptionSelectionStatusProjection<ProductBundleComponentOptionSelectionValueProjection<PARENT, ROOT>, ROOT> selectionStatus(
      ) {
     ProductBundleComponentOptionSelectionStatusProjection<ProductBundleComponentOptionSelectionValueProjection<PARENT, ROOT>, ROOT> projection = new ProductBundleComponentOptionSelectionStatusProjection<>(this, getRoot());
     getFields().put("selectionStatus", projection);
     return projection;
  }

  public ProductBundleComponentOptionSelectionValueProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
