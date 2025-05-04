package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class PriceRuleDiscountCodeFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public PriceRuleDiscountCodeFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceRuleDiscountCode"));
  }

  public PriceRuleDiscountCodeFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<PriceRuleDiscountCodeFragmentProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<PriceRuleDiscountCodeFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public PriceRuleDiscountCodeFragmentProjection<PARENT, ROOT> code() {
    getFields().put("code", null);
    return this;
  }

  public PriceRuleDiscountCodeFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public PriceRuleDiscountCodeFragmentProjection<PARENT, ROOT> usageCount() {
    getFields().put("usageCount", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on PriceRuleDiscountCode {");
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
