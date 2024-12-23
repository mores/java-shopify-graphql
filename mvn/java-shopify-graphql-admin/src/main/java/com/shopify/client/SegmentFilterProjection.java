package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SegmentFilterProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SegmentFilterProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SegmentFilter"));
  }

  public SegmentFilterProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentFilterProjection<PARENT, ROOT> localizedName() {
    getFields().put("localizedName", null);
    return this;
  }

  public SegmentFilterProjection<PARENT, ROOT> multiValue() {
    getFields().put("multiValue", null);
    return this;
  }

  public SegmentFilterProjection<PARENT, ROOT> queryName() {
    getFields().put("queryName", null);
    return this;
  }

  public SegmentAssociationFilterFragmentProjection<SegmentFilterProjection<PARENT, ROOT>, ROOT> onSegmentAssociationFilter(
      ) {
    SegmentAssociationFilterFragmentProjection<SegmentFilterProjection<PARENT, ROOT>, ROOT> fragment = new SegmentAssociationFilterFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SegmentBooleanFilterFragmentProjection<SegmentFilterProjection<PARENT, ROOT>, ROOT> onSegmentBooleanFilter(
      ) {
    SegmentBooleanFilterFragmentProjection<SegmentFilterProjection<PARENT, ROOT>, ROOT> fragment = new SegmentBooleanFilterFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SegmentDateFilterFragmentProjection<SegmentFilterProjection<PARENT, ROOT>, ROOT> onSegmentDateFilter(
      ) {
    SegmentDateFilterFragmentProjection<SegmentFilterProjection<PARENT, ROOT>, ROOT> fragment = new SegmentDateFilterFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SegmentEnumFilterFragmentProjection<SegmentFilterProjection<PARENT, ROOT>, ROOT> onSegmentEnumFilter(
      ) {
    SegmentEnumFilterFragmentProjection<SegmentFilterProjection<PARENT, ROOT>, ROOT> fragment = new SegmentEnumFilterFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SegmentEventFilterFragmentProjection<SegmentFilterProjection<PARENT, ROOT>, ROOT> onSegmentEventFilter(
      ) {
    SegmentEventFilterFragmentProjection<SegmentFilterProjection<PARENT, ROOT>, ROOT> fragment = new SegmentEventFilterFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SegmentFloatFilterFragmentProjection<SegmentFilterProjection<PARENT, ROOT>, ROOT> onSegmentFloatFilter(
      ) {
    SegmentFloatFilterFragmentProjection<SegmentFilterProjection<PARENT, ROOT>, ROOT> fragment = new SegmentFloatFilterFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SegmentIntegerFilterFragmentProjection<SegmentFilterProjection<PARENT, ROOT>, ROOT> onSegmentIntegerFilter(
      ) {
    SegmentIntegerFilterFragmentProjection<SegmentFilterProjection<PARENT, ROOT>, ROOT> fragment = new SegmentIntegerFilterFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SegmentStringFilterFragmentProjection<SegmentFilterProjection<PARENT, ROOT>, ROOT> onSegmentStringFilter(
      ) {
    SegmentStringFilterFragmentProjection<SegmentFilterProjection<PARENT, ROOT>, ROOT> fragment = new SegmentStringFilterFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
