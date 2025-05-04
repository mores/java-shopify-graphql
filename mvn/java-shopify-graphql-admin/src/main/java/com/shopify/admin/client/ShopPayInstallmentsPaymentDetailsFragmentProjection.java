package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ShopPayInstallmentsPaymentDetailsFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ShopPayInstallmentsPaymentDetailsFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPayInstallmentsPaymentDetails"));
  }

  public ShopPayInstallmentsPaymentDetailsFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopPayInstallmentsPaymentDetailsFragmentProjection<PARENT, ROOT> paymentMethodName() {
    getFields().put("paymentMethodName", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ShopPayInstallmentsPaymentDetails {");
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
