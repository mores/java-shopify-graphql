package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductContextualPricingProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductContextualPricingProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductContextualPricing"));
  }

  public ProductContextualPricingProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantContextualPricingProjection<ProductContextualPricingProjection<PARENT, ROOT>, ROOT> maxVariantPricing(
      ) {
     ProductVariantContextualPricingProjection<ProductContextualPricingProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantContextualPricingProjection<>(this, getRoot());
     getFields().put("maxVariantPricing", projection);
     return projection;
  }

  public ProductVariantContextualPricingProjection<ProductContextualPricingProjection<PARENT, ROOT>, ROOT> minVariantPricing(
      ) {
     ProductVariantContextualPricingProjection<ProductContextualPricingProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantContextualPricingProjection<>(this, getRoot());
     getFields().put("minVariantPricing", projection);
     return projection;
  }

  public ProductPriceRangeV2Projection<ProductContextualPricingProjection<PARENT, ROOT>, ROOT> priceRange(
      ) {
     ProductPriceRangeV2Projection<ProductContextualPricingProjection<PARENT, ROOT>, ROOT> projection = new ProductPriceRangeV2Projection<>(this, getRoot());
     getFields().put("priceRange", projection);
     return projection;
  }

  public ProductContextualPricingProjection<PARENT, ROOT> fixedQuantityRulesCount() {
    getFields().put("fixedQuantityRulesCount", null);
    return this;
  }
}
