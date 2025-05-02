package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class MoneyV2FragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public MoneyV2FragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MoneyV2"));
  }

  public MoneyV2FragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CurrencyCodeProjection<MoneyV2FragmentProjection<PARENT, ROOT>, ROOT> currencyCode() {
     CurrencyCodeProjection<MoneyV2FragmentProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("currencyCode", projection);
     return projection;
  }

  public MoneyV2FragmentProjection<PARENT, ROOT> amount() {
    getFields().put("amount", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on MoneyV2 {");
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
