package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DayOfTheWeekProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DayOfTheWeekProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DayOfTheWeek"));
  }

  public DayOfTheWeekProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
