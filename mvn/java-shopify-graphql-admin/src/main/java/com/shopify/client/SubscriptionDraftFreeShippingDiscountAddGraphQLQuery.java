package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.SubscriptionFreeShippingDiscountInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class SubscriptionDraftFreeShippingDiscountAddGraphQLQuery extends GraphQLQuery {
  public SubscriptionDraftFreeShippingDiscountAddGraphQLQuery(String draftId,
      SubscriptionFreeShippingDiscountInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (draftId != null || fieldsSet.contains("draftId")) {
        getInput().put("draftId", draftId);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public SubscriptionDraftFreeShippingDiscountAddGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionDraftFreeShippingDiscountAdd";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String draftId;

    private SubscriptionFreeShippingDiscountInput input;

    private String queryName;

    public SubscriptionDraftFreeShippingDiscountAddGraphQLQuery build() {
      return new SubscriptionDraftFreeShippingDiscountAddGraphQLQuery(draftId, input, queryName, fieldsSet);
               
    }

    
    public Builder draftId(String draftId) {
      this.draftId = draftId;
      this.fieldsSet.add("draftId");
      return this;
    }

    
    public Builder input(SubscriptionFreeShippingDiscountInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
