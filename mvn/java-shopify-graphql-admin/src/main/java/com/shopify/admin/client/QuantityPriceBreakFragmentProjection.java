package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class QuantityPriceBreakFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public QuantityPriceBreakFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("QuantityPriceBreak"));
  }

  public QuantityPriceBreakFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<QuantityPriceBreakFragmentProjection<PARENT, ROOT>, ROOT> price() {
     MoneyV2Projection<QuantityPriceBreakFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public PriceListProjection<QuantityPriceBreakFragmentProjection<PARENT, ROOT>, ROOT> priceList() {
     PriceListProjection<QuantityPriceBreakFragmentProjection<PARENT, ROOT>, ROOT> projection = new PriceListProjection<>(this, getRoot());
     getFields().put("priceList", projection);
     return projection;
  }

  public ProductVariantProjection<QuantityPriceBreakFragmentProjection<PARENT, ROOT>, ROOT> variant(
      ) {
     ProductVariantProjection<QuantityPriceBreakFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("variant", projection);
     return projection;
  }

  public QuantityPriceBreakFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public QuantityPriceBreakFragmentProjection<PARENT, ROOT> minimumQuantity() {
    getFields().put("minimumQuantity", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on QuantityPriceBreak {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
