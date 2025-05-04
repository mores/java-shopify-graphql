package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductVariantPricePairProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantPricePairProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductVariantPricePair"));
  }

  public ProductVariantPricePairProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<ProductVariantPricePairProjection<PARENT, ROOT>, ROOT> compareAtPrice() {
     MoneyV2Projection<ProductVariantPricePairProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("compareAtPrice", projection);
     return projection;
  }

  public MoneyV2Projection<ProductVariantPricePairProjection<PARENT, ROOT>, ROOT> price() {
     MoneyV2Projection<ProductVariantPricePairProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }
}
