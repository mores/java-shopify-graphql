package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class AppCreditFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public AppCreditFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppCredit"));
  }

  public AppCreditFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<AppCreditFragmentProjection<PARENT, ROOT>, ROOT> amount() {
     MoneyV2Projection<AppCreditFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public AppCreditFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public AppCreditFragmentProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public AppCreditFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AppCreditFragmentProjection<PARENT, ROOT> test() {
    getFields().put("test", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on AppCredit {");
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
