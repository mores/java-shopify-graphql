package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SubscriptionParentLineFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SubscriptionParentLineFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionParentLine"));
  }

  public SubscriptionParentLineFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<SubscriptionParentLineFragmentProjection<PARENT, ROOT>, ROOT> bundledBy() {
     AppProjection<SubscriptionParentLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("bundledBy", projection);
     return projection;
  }

  public SubscriptionLineProjection<SubscriptionParentLineFragmentProjection<PARENT, ROOT>, ROOT> components(
      ) {
     SubscriptionLineProjection<SubscriptionParentLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionLineProjection<>(this, getRoot());
     getFields().put("components", projection);
     return projection;
  }

  public AttributeProjection<SubscriptionParentLineFragmentProjection<PARENT, ROOT>, ROOT> customAttributes(
      ) {
     AttributeProjection<SubscriptionParentLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public SubscriptionParentLineFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SubscriptionParentLineFragmentProjection<PARENT, ROOT> presentmentTitle() {
    getFields().put("presentmentTitle", null);
    return this;
  }

  public SubscriptionParentLineFragmentProjection<PARENT, ROOT> productId() {
    getFields().put("productId", null);
    return this;
  }

  public SubscriptionParentLineFragmentProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public SubscriptionParentLineFragmentProjection<PARENT, ROOT> sourceType() {
    getFields().put("sourceType", null);
    return this;
  }

  public SubscriptionParentLineFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public SubscriptionParentLineFragmentProjection<PARENT, ROOT> variantId() {
    getFields().put("variantId", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SubscriptionParentLine {");
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
