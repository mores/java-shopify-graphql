package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerVisitProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerVisitProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerVisit"));
  }

  public CustomerVisitProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketingEventProjection<CustomerVisitProjection<PARENT, ROOT>, ROOT> marketingEvent() {
     MarketingEventProjection<CustomerVisitProjection<PARENT, ROOT>, ROOT> projection = new MarketingEventProjection<>(this, getRoot());
     getFields().put("marketingEvent", projection);
     return projection;
  }

  public MarketingTacticProjection<CustomerVisitProjection<PARENT, ROOT>, ROOT> sourceType() {
     MarketingTacticProjection<CustomerVisitProjection<PARENT, ROOT>, ROOT> projection = new MarketingTacticProjection<>(this, getRoot());
     getFields().put("sourceType", projection);
     return projection;
  }

  public UTMParametersProjection<CustomerVisitProjection<PARENT, ROOT>, ROOT> utmParameters() {
     UTMParametersProjection<CustomerVisitProjection<PARENT, ROOT>, ROOT> projection = new UTMParametersProjection<>(this, getRoot());
     getFields().put("utmParameters", projection);
     return projection;
  }

  public CustomerVisitProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CustomerVisitProjection<PARENT, ROOT> landingPage() {
    getFields().put("landingPage", null);
    return this;
  }

  public CustomerVisitProjection<PARENT, ROOT> landingPageHtml() {
    getFields().put("landingPageHtml", null);
    return this;
  }

  public CustomerVisitProjection<PARENT, ROOT> occurredAt() {
    getFields().put("occurredAt", null);
    return this;
  }

  public CustomerVisitProjection<PARENT, ROOT> referralCode() {
    getFields().put("referralCode", null);
    return this;
  }

  public CustomerVisitProjection<PARENT, ROOT> referralInfoHtml() {
    getFields().put("referralInfoHtml", null);
    return this;
  }

  public CustomerVisitProjection<PARENT, ROOT> referrerUrl() {
    getFields().put("referrerUrl", null);
    return this;
  }

  public CustomerVisitProjection<PARENT, ROOT> source() {
    getFields().put("source", null);
    return this;
  }

  public CustomerVisitProjection<PARENT, ROOT> sourceDescription() {
    getFields().put("sourceDescription", null);
    return this;
  }
}
