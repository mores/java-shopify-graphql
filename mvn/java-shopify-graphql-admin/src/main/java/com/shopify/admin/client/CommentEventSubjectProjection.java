package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CommentEventSubjectProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CommentEventSubjectProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CommentEventSubject"));
  }

  public CommentEventSubjectProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CommentEventSubjectProjection<PARENT, ROOT> hasTimelineComment() {
    getFields().put("hasTimelineComment", null);
    return this;
  }

  public CommentEventSubjectProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CompanyFragmentProjection<CommentEventSubjectProjection<PARENT, ROOT>, ROOT> onCompany() {
    CompanyFragmentProjection<CommentEventSubjectProjection<PARENT, ROOT>, ROOT> fragment = new CompanyFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyLocationFragmentProjection<CommentEventSubjectProjection<PARENT, ROOT>, ROOT> onCompanyLocation(
      ) {
    CompanyLocationFragmentProjection<CommentEventSubjectProjection<PARENT, ROOT>, ROOT> fragment = new CompanyLocationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerFragmentProjection<CommentEventSubjectProjection<PARENT, ROOT>, ROOT> onCustomer(
      ) {
    CustomerFragmentProjection<CommentEventSubjectProjection<PARENT, ROOT>, ROOT> fragment = new CustomerFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DraftOrderFragmentProjection<CommentEventSubjectProjection<PARENT, ROOT>, ROOT> onDraftOrder(
      ) {
    DraftOrderFragmentProjection<CommentEventSubjectProjection<PARENT, ROOT>, ROOT> fragment = new DraftOrderFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public OrderFragmentProjection<CommentEventSubjectProjection<PARENT, ROOT>, ROOT> onOrder() {
    OrderFragmentProjection<CommentEventSubjectProjection<PARENT, ROOT>, ROOT> fragment = new OrderFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public PriceRuleFragmentProjection<CommentEventSubjectProjection<PARENT, ROOT>, ROOT> onPriceRule(
      ) {
    PriceRuleFragmentProjection<CommentEventSubjectProjection<PARENT, ROOT>, ROOT> fragment = new PriceRuleFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
