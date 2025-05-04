package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class AppPurchaseOneTimeFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public AppPurchaseOneTimeFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppPurchaseOneTime"));
  }

  public AppPurchaseOneTimeFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<AppPurchaseOneTimeFragmentProjection<PARENT, ROOT>, ROOT> price() {
     MoneyV2Projection<AppPurchaseOneTimeFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public AppPurchaseStatusProjection<AppPurchaseOneTimeFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     AppPurchaseStatusProjection<AppPurchaseOneTimeFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppPurchaseStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public AppPurchaseOneTimeFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public AppPurchaseOneTimeFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AppPurchaseOneTimeFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public AppPurchaseOneTimeFragmentProjection<PARENT, ROOT> test() {
    getFields().put("test", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on AppPurchaseOneTime {");
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
