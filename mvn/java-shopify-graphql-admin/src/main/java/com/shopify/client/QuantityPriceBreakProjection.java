package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class QuantityPriceBreakProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public QuantityPriceBreakProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("QuantityPriceBreak"));
  }

  public QuantityPriceBreakProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<QuantityPriceBreakProjection<PARENT, ROOT>, ROOT> price() {
     MoneyV2Projection<QuantityPriceBreakProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public PriceListProjection<QuantityPriceBreakProjection<PARENT, ROOT>, ROOT> priceList() {
     PriceListProjection<QuantityPriceBreakProjection<PARENT, ROOT>, ROOT> projection = new PriceListProjection<>(this, getRoot());
     getFields().put("priceList", projection);
     return projection;
  }

  public ProductVariantProjection<QuantityPriceBreakProjection<PARENT, ROOT>, ROOT> variant() {
     ProductVariantProjection<QuantityPriceBreakProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("variant", projection);
     return projection;
  }

  public QuantityPriceBreakProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public QuantityPriceBreakProjection<PARENT, ROOT> minimumQuantity() {
    getFields().put("minimumQuantity", null);
    return this;
  }
}
