package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppCreditProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppCreditProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppCredit"));
  }

  public AppCreditProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<AppCreditProjection<PARENT, ROOT>, ROOT> amount() {
     MoneyV2Projection<AppCreditProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public AppCreditProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public AppCreditProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public AppCreditProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AppCreditProjection<PARENT, ROOT> test() {
    getFields().put("test", null);
    return this;
  }
}
