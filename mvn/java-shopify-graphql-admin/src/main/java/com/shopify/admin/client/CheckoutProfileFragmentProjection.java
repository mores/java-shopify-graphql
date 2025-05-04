package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CheckoutProfileFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CheckoutProfileFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutProfile"));
  }

  public CheckoutProfileFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutProfileFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CheckoutProfileFragmentProjection<PARENT, ROOT> editedAt() {
    getFields().put("editedAt", null);
    return this;
  }

  public CheckoutProfileFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CheckoutProfileFragmentProjection<PARENT, ROOT> isPublished() {
    getFields().put("isPublished", null);
    return this;
  }

  public CheckoutProfileFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CheckoutProfileFragmentProjection<PARENT, ROOT> typOspPagesActive() {
    getFields().put("typOspPagesActive", null);
    return this;
  }

  public CheckoutProfileFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CheckoutProfile {");
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
