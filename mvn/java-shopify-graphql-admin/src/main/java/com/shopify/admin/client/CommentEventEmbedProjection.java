package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CommentEventEmbedProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CommentEventEmbedProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CommentEventEmbed"));
  }

  public CommentEventEmbedProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerFragmentProjection<CommentEventEmbedProjection<PARENT, ROOT>, ROOT> onCustomer() {
    CustomerFragmentProjection<CommentEventEmbedProjection<PARENT, ROOT>, ROOT> fragment = new CustomerFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DraftOrderFragmentProjection<CommentEventEmbedProjection<PARENT, ROOT>, ROOT> onDraftOrder(
      ) {
    DraftOrderFragmentProjection<CommentEventEmbedProjection<PARENT, ROOT>, ROOT> fragment = new DraftOrderFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public OrderFragmentProjection<CommentEventEmbedProjection<PARENT, ROOT>, ROOT> onOrder() {
    OrderFragmentProjection<CommentEventEmbedProjection<PARENT, ROOT>, ROOT> fragment = new OrderFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductFragmentProjection<CommentEventEmbedProjection<PARENT, ROOT>, ROOT> onProduct() {
    ProductFragmentProjection<CommentEventEmbedProjection<PARENT, ROOT>, ROOT> fragment = new ProductFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductVariantFragmentProjection<CommentEventEmbedProjection<PARENT, ROOT>, ROOT> onProductVariant(
      ) {
    ProductVariantFragmentProjection<CommentEventEmbedProjection<PARENT, ROOT>, ROOT> fragment = new ProductVariantFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
