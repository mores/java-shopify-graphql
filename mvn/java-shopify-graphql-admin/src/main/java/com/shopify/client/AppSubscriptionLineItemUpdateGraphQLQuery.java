package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MoneyInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates the capped amount on the usage pricing plan of an app subscription line item.
 */
public class AppSubscriptionLineItemUpdateGraphQLQuery extends GraphQLQuery {
  public AppSubscriptionLineItemUpdateGraphQLQuery(String id, MoneyInput cappedAmount,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (cappedAmount != null || fieldsSet.contains("cappedAmount")) {
        getInput().put("cappedAmount", cappedAmount);
    }
  }

  public AppSubscriptionLineItemUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "appSubscriptionLineItemUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private MoneyInput cappedAmount;

    private String queryName;

    public AppSubscriptionLineItemUpdateGraphQLQuery build() {
      return new AppSubscriptionLineItemUpdateGraphQLQuery(id, cappedAmount, queryName, fieldsSet);
               
    }

    /**
     * The ID of the app subscription line item to be updated.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The new maximum amount of usage charges that can be incurred within a subscription billing interval.
     */
    public Builder cappedAmount(MoneyInput cappedAmount) {
      this.cappedAmount = cappedAmount;
      this.fieldsSet.add("cappedAmount");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
