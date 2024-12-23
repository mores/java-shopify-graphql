package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SegmentAttributeStatisticsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SegmentAttributeStatisticsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SegmentAttributeStatistics"));
  }

  public SegmentAttributeStatisticsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentAttributeStatisticsProjection<PARENT, ROOT> average() {
    getFields().put("average", null);
    return this;
  }

  public SegmentAttributeStatisticsProjection<PARENT, ROOT> sum() {
    getFields().put("sum", null);
    return this;
  }
}
