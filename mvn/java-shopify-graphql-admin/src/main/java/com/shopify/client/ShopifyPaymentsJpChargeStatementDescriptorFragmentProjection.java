package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ShopifyPaymentsJpChargeStatementDescriptorFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ShopifyPaymentsJpChargeStatementDescriptorFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsJpChargeStatementDescriptor"));
  }

  public ShopifyPaymentsJpChargeStatementDescriptorFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsJpChargeStatementDescriptorFragmentProjection<PARENT, ROOT> _default() {
    getFields().put("default", null);
    return this;
  }

  public ShopifyPaymentsJpChargeStatementDescriptorFragmentProjection<PARENT, ROOT> kana() {
    getFields().put("kana", null);
    return this;
  }

  public ShopifyPaymentsJpChargeStatementDescriptorFragmentProjection<PARENT, ROOT> kanji() {
    getFields().put("kanji", null);
    return this;
  }

  public ShopifyPaymentsJpChargeStatementDescriptorFragmentProjection<PARENT, ROOT> prefix() {
    getFields().put("prefix", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ShopifyPaymentsJpChargeStatementDescriptor {");
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
