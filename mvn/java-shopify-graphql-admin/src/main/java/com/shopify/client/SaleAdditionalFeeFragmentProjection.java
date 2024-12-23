package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SaleAdditionalFeeFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SaleAdditionalFeeFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SaleAdditionalFee"));
  }

  public SaleAdditionalFeeFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<SaleAdditionalFeeFragmentProjection<PARENT, ROOT>, ROOT> price() {
     MoneyBagProjection<SaleAdditionalFeeFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public TaxLineProjection<SaleAdditionalFeeFragmentProjection<PARENT, ROOT>, ROOT> taxLines() {
     TaxLineProjection<SaleAdditionalFeeFragmentProjection<PARENT, ROOT>, ROOT> projection = new TaxLineProjection<>(this, getRoot());
     getFields().put("taxLines", projection);
     return projection;
  }

  public SaleAdditionalFeeFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SaleAdditionalFeeFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SaleAdditionalFee {");
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
