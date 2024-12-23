package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.String;
import java.util.ArrayList;

public class SegmentStatisticsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SegmentStatisticsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SegmentStatistics"));
  }

  public SegmentStatisticsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SegmentAttributeStatisticsProjection<SegmentStatisticsProjection<PARENT, ROOT>, ROOT> attributeStatistics(
      ) {
     SegmentAttributeStatisticsProjection<SegmentStatisticsProjection<PARENT, ROOT>, ROOT> projection = new SegmentAttributeStatisticsProjection<>(this, getRoot());
     getFields().put("attributeStatistics", projection);
     return projection;
  }

  public SegmentAttributeStatisticsProjection<SegmentStatisticsProjection<PARENT, ROOT>, ROOT> attributeStatistics(
      String attributeName) {
    SegmentAttributeStatisticsProjection<SegmentStatisticsProjection<PARENT, ROOT>, ROOT> projection = new SegmentAttributeStatisticsProjection<>(this, getRoot());    
    getFields().put("attributeStatistics", projection);
    getInputArguments().computeIfAbsent("attributeStatistics", k -> new ArrayList<>());                      
    InputArgument attributeNameArg = new InputArgument("attributeName", attributeName);
    getInputArguments().get("attributeStatistics").add(attributeNameArg);
    return projection;
  }
}
