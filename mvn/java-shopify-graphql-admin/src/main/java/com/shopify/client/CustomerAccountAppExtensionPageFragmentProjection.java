package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CustomerAccountAppExtensionPageFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CustomerAccountAppExtensionPageFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerAccountAppExtensionPage"));
  }

  public CustomerAccountAppExtensionPageFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerAccountAppExtensionPageFragmentProjection<PARENT, ROOT> appExtensionUuid() {
    getFields().put("appExtensionUuid", null);
    return this;
  }

  public CustomerAccountAppExtensionPageFragmentProjection<PARENT, ROOT> defaultCursor() {
    getFields().put("defaultCursor", null);
    return this;
  }

  public CustomerAccountAppExtensionPageFragmentProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public CustomerAccountAppExtensionPageFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CustomerAccountAppExtensionPageFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CustomerAccountAppExtensionPage {");
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
