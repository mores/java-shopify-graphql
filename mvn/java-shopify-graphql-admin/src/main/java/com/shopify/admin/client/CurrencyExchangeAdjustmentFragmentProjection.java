package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CurrencyExchangeAdjustmentFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CurrencyExchangeAdjustmentFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CurrencyExchangeAdjustment"));
  }

  public CurrencyExchangeAdjustmentFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<CurrencyExchangeAdjustmentFragmentProjection<PARENT, ROOT>, ROOT> adjustment(
      ) {
     MoneyV2Projection<CurrencyExchangeAdjustmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("adjustment", projection);
     return projection;
  }

  public MoneyV2Projection<CurrencyExchangeAdjustmentFragmentProjection<PARENT, ROOT>, ROOT> finalAmountSet(
      ) {
     MoneyV2Projection<CurrencyExchangeAdjustmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("finalAmountSet", projection);
     return projection;
  }

  public MoneyV2Projection<CurrencyExchangeAdjustmentFragmentProjection<PARENT, ROOT>, ROOT> originalAmountSet(
      ) {
     MoneyV2Projection<CurrencyExchangeAdjustmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("originalAmountSet", projection);
     return projection;
  }

  public CurrencyExchangeAdjustmentFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CurrencyExchangeAdjustment {");
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
