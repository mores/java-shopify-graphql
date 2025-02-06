package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AbandonedCheckoutLineItemComponentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AbandonedCheckoutLineItemComponentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AbandonedCheckoutLineItemComponent"));
  }

  public AbandonedCheckoutLineItemComponentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ImageProjection<AbandonedCheckoutLineItemComponentProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<AbandonedCheckoutLineItemComponentProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public AbandonedCheckoutLineItemComponentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AbandonedCheckoutLineItemComponentProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public AbandonedCheckoutLineItemComponentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public AbandonedCheckoutLineItemComponentProjection<PARENT, ROOT> variantTitle() {
    getFields().put("variantTitle", null);
    return this;
  }
}
