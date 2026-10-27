package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class RolloutCheckoutAndAccountsConfigurationPublishChangeFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public RolloutCheckoutAndAccountsConfigurationPublishChangeFragmentProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("RolloutCheckoutAndAccountsConfigurationPublishChange"));
  }

  public RolloutCheckoutAndAccountsConfigurationPublishChangeFragmentProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationProjection<RolloutCheckoutAndAccountsConfigurationPublishChangeFragmentProjection<PARENT, ROOT>, ROOT> checkoutAndAccountsConfiguration(
      ) {
     CheckoutAndAccountsConfigurationProjection<RolloutCheckoutAndAccountsConfigurationPublishChangeFragmentProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationProjection<>(this, getRoot());
     getFields().put("checkoutAndAccountsConfiguration", projection);
     return projection;
  }

  public RolloutCheckoutAndAccountsConfigurationPublishChangeFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on RolloutCheckoutAndAccountsConfigurationPublishChange {");
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
