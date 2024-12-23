package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CustomerAccountNativePageFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CustomerAccountNativePageFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerAccountNativePage"));
  }

  public CustomerAccountNativePageFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerAccountNativePagePageTypeProjection<CustomerAccountNativePageFragmentProjection<PARENT, ROOT>, ROOT> pageType(
      ) {
     CustomerAccountNativePagePageTypeProjection<CustomerAccountNativePageFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerAccountNativePagePageTypeProjection<>(this, getRoot());
     getFields().put("pageType", projection);
     return projection;
  }

  public CustomerAccountNativePageFragmentProjection<PARENT, ROOT> defaultCursor() {
    getFields().put("defaultCursor", null);
    return this;
  }

  public CustomerAccountNativePageFragmentProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public CustomerAccountNativePageFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CustomerAccountNativePageFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CustomerAccountNativePage {");
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
