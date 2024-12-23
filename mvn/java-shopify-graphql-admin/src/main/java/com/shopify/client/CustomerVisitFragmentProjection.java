package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CustomerVisitFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CustomerVisitFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerVisit"));
  }

  public CustomerVisitFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketingEventProjection<CustomerVisitFragmentProjection<PARENT, ROOT>, ROOT> marketingEvent(
      ) {
     MarketingEventProjection<CustomerVisitFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketingEventProjection<>(this, getRoot());
     getFields().put("marketingEvent", projection);
     return projection;
  }

  public MarketingTacticProjection<CustomerVisitFragmentProjection<PARENT, ROOT>, ROOT> sourceType(
      ) {
     MarketingTacticProjection<CustomerVisitFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketingTacticProjection<>(this, getRoot());
     getFields().put("sourceType", projection);
     return projection;
  }

  public UTMParametersProjection<CustomerVisitFragmentProjection<PARENT, ROOT>, ROOT> utmParameters(
      ) {
     UTMParametersProjection<CustomerVisitFragmentProjection<PARENT, ROOT>, ROOT> projection = new UTMParametersProjection<>(this, getRoot());
     getFields().put("utmParameters", projection);
     return projection;
  }

  public CustomerVisitFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CustomerVisitFragmentProjection<PARENT, ROOT> landingPage() {
    getFields().put("landingPage", null);
    return this;
  }

  public CustomerVisitFragmentProjection<PARENT, ROOT> landingPageHtml() {
    getFields().put("landingPageHtml", null);
    return this;
  }

  public CustomerVisitFragmentProjection<PARENT, ROOT> occurredAt() {
    getFields().put("occurredAt", null);
    return this;
  }

  public CustomerVisitFragmentProjection<PARENT, ROOT> referralCode() {
    getFields().put("referralCode", null);
    return this;
  }

  public CustomerVisitFragmentProjection<PARENT, ROOT> referralInfoHtml() {
    getFields().put("referralInfoHtml", null);
    return this;
  }

  public CustomerVisitFragmentProjection<PARENT, ROOT> referrerUrl() {
    getFields().put("referrerUrl", null);
    return this;
  }

  public CustomerVisitFragmentProjection<PARENT, ROOT> source() {
    getFields().put("source", null);
    return this;
  }

  public CustomerVisitFragmentProjection<PARENT, ROOT> sourceDescription() {
    getFields().put("sourceDescription", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CustomerVisit {");
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
