package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class AdditionalFeeFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public AdditionalFeeFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AdditionalFee"));
  }

  public AdditionalFeeFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<AdditionalFeeFragmentProjection<PARENT, ROOT>, ROOT> price() {
     MoneyBagProjection<AdditionalFeeFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public TaxLineProjection<AdditionalFeeFragmentProjection<PARENT, ROOT>, ROOT> taxLines() {
     TaxLineProjection<AdditionalFeeFragmentProjection<PARENT, ROOT>, ROOT> projection = new TaxLineProjection<>(this, getRoot());
     getFields().put("taxLines", projection);
     return projection;
  }

  public AdditionalFeeFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AdditionalFeeFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on AdditionalFee {");
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
