package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductCategoryProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductCategoryProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductCategory"));
  }

  public ProductCategoryProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductTaxonomyNodeProjection<ProductCategoryProjection<PARENT, ROOT>, ROOT> productTaxonomyNode(
      ) {
     ProductTaxonomyNodeProjection<ProductCategoryProjection<PARENT, ROOT>, ROOT> projection = new ProductTaxonomyNodeProjection<>(this, getRoot());
     getFields().put("productTaxonomyNode", projection);
     return projection;
  }
}
