package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ShopifyPaymentsDefaultChargeStatementDescriptorFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ShopifyPaymentsDefaultChargeStatementDescriptorFragmentProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsDefaultChargeStatementDescriptor"));
  }

  public ShopifyPaymentsDefaultChargeStatementDescriptorFragmentProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsDefaultChargeStatementDescriptorFragmentProjection<PARENT, ROOT> _default(
      ) {
    getFields().put("default", null);
    return this;
  }

  public ShopifyPaymentsDefaultChargeStatementDescriptorFragmentProjection<PARENT, ROOT> prefix() {
    getFields().put("prefix", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ShopifyPaymentsDefaultChargeStatementDescriptor {");
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
