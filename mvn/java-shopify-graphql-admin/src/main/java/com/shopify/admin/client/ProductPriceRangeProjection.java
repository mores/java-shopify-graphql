package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductPriceRangeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductPriceRangeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductPriceRange"));
  }

  public ProductPriceRangeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<ProductPriceRangeProjection<PARENT, ROOT>, ROOT> maxVariantPrice() {
     MoneyV2Projection<ProductPriceRangeProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("maxVariantPrice", projection);
     return projection;
  }

  public MoneyV2Projection<ProductPriceRangeProjection<PARENT, ROOT>, ROOT> minVariantPrice() {
     MoneyV2Projection<ProductPriceRangeProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("minVariantPrice", projection);
     return projection;
  }
}
