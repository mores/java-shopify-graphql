package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Cancels an app subscription on a store.
 */
public class AppSubscriptionCancelGraphQLQuery extends GraphQLQuery {
  public AppSubscriptionCancelGraphQLQuery(String id, Boolean prorate, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (prorate != null || fieldsSet.contains("prorate")) {
        getInput().put("prorate", prorate);
    }
  }

  public AppSubscriptionCancelGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "appSubscriptionCancel";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private Boolean prorate;

    private String queryName;

    public AppSubscriptionCancelGraphQLQuery build() {
      return new AppSubscriptionCancelGraphQLQuery(id, prorate, queryName, fieldsSet);
               
    }

    /**
     * The ID of the app subscription to be cancelled.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * Whether to issue prorated credits for the unused portion of the app subscription.  There will
     * be a corresponding deduction (based on revenue share) to your Partner account.
     * For example, if a $10.00 app subscription (with 0% revenue share) is cancelled and prorated half way
     * through the billing cycle, then the merchant will be credited $5.00 and that amount will be deducted
     * from your Partner account.
     */
    public Builder prorate(Boolean prorate) {
      this.prorate = prorate;
      this.fieldsSet.add("prorate");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
