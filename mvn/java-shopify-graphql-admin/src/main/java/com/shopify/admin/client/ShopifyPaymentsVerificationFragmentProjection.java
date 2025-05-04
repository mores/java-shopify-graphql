package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ShopifyPaymentsVerificationFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ShopifyPaymentsVerificationFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsVerification"));
  }

  public ShopifyPaymentsVerificationFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsVerificationStatusProjection<ShopifyPaymentsVerificationFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     ShopifyPaymentsVerificationStatusProjection<ShopifyPaymentsVerificationFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsVerificationStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public ShopifyPaymentsVerificationSubjectProjection<ShopifyPaymentsVerificationFragmentProjection<PARENT, ROOT>, ROOT> subject(
      ) {
     ShopifyPaymentsVerificationSubjectProjection<ShopifyPaymentsVerificationFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsVerificationSubjectProjection<>(this, getRoot());
     getFields().put("subject", projection);
     return projection;
  }

  public ShopifyPaymentsVerificationFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ShopifyPaymentsVerification {");
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
