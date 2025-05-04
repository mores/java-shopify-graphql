package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerJourneyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerJourneyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerJourney"));
  }

  public CustomerJourneyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerVisitProjection<CustomerJourneyProjection<PARENT, ROOT>, ROOT> firstVisit() {
     CustomerVisitProjection<CustomerJourneyProjection<PARENT, ROOT>, ROOT> projection = new CustomerVisitProjection<>(this, getRoot());
     getFields().put("firstVisit", projection);
     return projection;
  }

  public CustomerVisitProjection<CustomerJourneyProjection<PARENT, ROOT>, ROOT> lastVisit() {
     CustomerVisitProjection<CustomerJourneyProjection<PARENT, ROOT>, ROOT> projection = new CustomerVisitProjection<>(this, getRoot());
     getFields().put("lastVisit", projection);
     return projection;
  }

  public CustomerMomentProjection<CustomerJourneyProjection<PARENT, ROOT>, ROOT> moments() {
     CustomerMomentProjection<CustomerJourneyProjection<PARENT, ROOT>, ROOT> projection = new CustomerMomentProjection<>(this, getRoot());
     getFields().put("moments", projection);
     return projection;
  }

  public CustomerJourneyProjection<PARENT, ROOT> customerOrderIndex() {
    getFields().put("customerOrderIndex", null);
    return this;
  }

  public CustomerJourneyProjection<PARENT, ROOT> daysToConversion() {
    getFields().put("daysToConversion", null);
    return this;
  }
}
