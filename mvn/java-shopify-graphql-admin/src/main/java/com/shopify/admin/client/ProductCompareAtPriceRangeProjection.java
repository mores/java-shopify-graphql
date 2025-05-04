package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductCompareAtPriceRangeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductCompareAtPriceRangeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductCompareAtPriceRange"));
  }

  public ProductCompareAtPriceRangeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<ProductCompareAtPriceRangeProjection<PARENT, ROOT>, ROOT> maxVariantCompareAtPrice(
      ) {
     MoneyV2Projection<ProductCompareAtPriceRangeProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("maxVariantCompareAtPrice", projection);
     return projection;
  }

  public MoneyV2Projection<ProductCompareAtPriceRangeProjection<PARENT, ROOT>, ROOT> minVariantCompareAtPrice(
      ) {
     MoneyV2Projection<ProductCompareAtPriceRangeProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("minVariantCompareAtPrice", projection);
     return projection;
  }
}
