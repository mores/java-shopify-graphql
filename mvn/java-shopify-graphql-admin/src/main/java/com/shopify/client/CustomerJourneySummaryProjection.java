package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class CustomerJourneySummaryProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerJourneySummaryProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerJourneySummary"));
  }

  public CustomerJourneySummaryProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerVisitProjection<CustomerJourneySummaryProjection<PARENT, ROOT>, ROOT> firstVisit(
      ) {
     CustomerVisitProjection<CustomerJourneySummaryProjection<PARENT, ROOT>, ROOT> projection = new CustomerVisitProjection<>(this, getRoot());
     getFields().put("firstVisit", projection);
     return projection;
  }

  public CustomerVisitProjection<CustomerJourneySummaryProjection<PARENT, ROOT>, ROOT> lastVisit() {
     CustomerVisitProjection<CustomerJourneySummaryProjection<PARENT, ROOT>, ROOT> projection = new CustomerVisitProjection<>(this, getRoot());
     getFields().put("lastVisit", projection);
     return projection;
  }

  public CustomerMomentConnectionProjection<CustomerJourneySummaryProjection<PARENT, ROOT>, ROOT> moments(
      ) {
     CustomerMomentConnectionProjection<CustomerJourneySummaryProjection<PARENT, ROOT>, ROOT> projection = new CustomerMomentConnectionProjection<>(this, getRoot());
     getFields().put("moments", projection);
     return projection;
  }

  public CustomerMomentConnectionProjection<CustomerJourneySummaryProjection<PARENT, ROOT>, ROOT> moments(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CustomerMomentConnectionProjection<CustomerJourneySummaryProjection<PARENT, ROOT>, ROOT> projection = new CustomerMomentConnectionProjection<>(this, getRoot());    
    getFields().put("moments", projection);
    getInputArguments().computeIfAbsent("moments", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("moments").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("moments").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("moments").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("moments").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("moments").add(reverseArg);
    return projection;
  }

  public CountProjection<CustomerJourneySummaryProjection<PARENT, ROOT>, ROOT> momentsCount() {
     CountProjection<CustomerJourneySummaryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("momentsCount", projection);
     return projection;
  }

  public CustomerJourneySummaryProjection<PARENT, ROOT> customerOrderIndex() {
    getFields().put("customerOrderIndex", null);
    return this;
  }

  public CustomerJourneySummaryProjection<PARENT, ROOT> daysToConversion() {
    getFields().put("daysToConversion", null);
    return this;
  }

  public CustomerJourneySummaryProjection<PARENT, ROOT> ready() {
    getFields().put("ready", null);
    return this;
  }
}
