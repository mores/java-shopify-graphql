package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductBundleComponentQuantityOptionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductBundleComponentQuantityOptionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductBundleComponentQuantityOption"));
  }

  public ProductBundleComponentQuantityOptionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductOptionProjection<ProductBundleComponentQuantityOptionProjection<PARENT, ROOT>, ROOT> parentOption(
      ) {
     ProductOptionProjection<ProductBundleComponentQuantityOptionProjection<PARENT, ROOT>, ROOT> projection = new ProductOptionProjection<>(this, getRoot());
     getFields().put("parentOption", projection);
     return projection;
  }

  public ProductBundleComponentQuantityOptionValueProjection<ProductBundleComponentQuantityOptionProjection<PARENT, ROOT>, ROOT> values(
      ) {
     ProductBundleComponentQuantityOptionValueProjection<ProductBundleComponentQuantityOptionProjection<PARENT, ROOT>, ROOT> projection = new ProductBundleComponentQuantityOptionValueProjection<>(this, getRoot());
     getFields().put("values", projection);
     return projection;
  }

  public ProductBundleComponentQuantityOptionProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
