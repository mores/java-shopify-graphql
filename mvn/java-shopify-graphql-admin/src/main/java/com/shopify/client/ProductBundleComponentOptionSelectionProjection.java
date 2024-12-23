package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductBundleComponentOptionSelectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductBundleComponentOptionSelectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductBundleComponentOptionSelection"));
  }

  public ProductBundleComponentOptionSelectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductOptionProjection<ProductBundleComponentOptionSelectionProjection<PARENT, ROOT>, ROOT> componentOption(
      ) {
     ProductOptionProjection<ProductBundleComponentOptionSelectionProjection<PARENT, ROOT>, ROOT> projection = new ProductOptionProjection<>(this, getRoot());
     getFields().put("componentOption", projection);
     return projection;
  }

  public ProductOptionProjection<ProductBundleComponentOptionSelectionProjection<PARENT, ROOT>, ROOT> parentOption(
      ) {
     ProductOptionProjection<ProductBundleComponentOptionSelectionProjection<PARENT, ROOT>, ROOT> projection = new ProductOptionProjection<>(this, getRoot());
     getFields().put("parentOption", projection);
     return projection;
  }

  public ProductBundleComponentOptionSelectionValueProjection<ProductBundleComponentOptionSelectionProjection<PARENT, ROOT>, ROOT> values(
      ) {
     ProductBundleComponentOptionSelectionValueProjection<ProductBundleComponentOptionSelectionProjection<PARENT, ROOT>, ROOT> projection = new ProductBundleComponentOptionSelectionValueProjection<>(this, getRoot());
     getFields().put("values", projection);
     return projection;
  }
}
