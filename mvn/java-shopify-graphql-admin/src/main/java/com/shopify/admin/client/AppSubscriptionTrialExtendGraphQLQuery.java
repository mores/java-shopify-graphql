package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Extends the trial period for an existing app subscription. Trial extensions
 * give merchants additional time to use the app before committing to paid billing.
 *   
 * Requires the subscription ID and the number of days to extend (between one and
 * 1000). The extension modifies the existing trial end date, allowing continued
 * access to subscription features without immediate billing. Returns the updated [`AppSubscription`](https://shopify.dev/docs/api/admin-graphql/latest/objects/AppSubscription).
 *   
 * Learn more about [offering free trials](https://shopify.dev/docs/apps/launch/billing/offer-free-trials).
 */
public class AppSubscriptionTrialExtendGraphQLQuery extends GraphQLQuery {
  public AppSubscriptionTrialExtendGraphQLQuery(String id, int days, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }getInput().put("days", days);                   
  }

  public AppSubscriptionTrialExtendGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "appSubscriptionTrialExtend";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private int days;

    private String queryName;

    public AppSubscriptionTrialExtendGraphQLQuery build() {
      return new AppSubscriptionTrialExtendGraphQLQuery(id, days, queryName, fieldsSet);
               
    }

    /**
     * The ID of the app subscription to extend the trial for.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The number of days to extend the trial. The value must be greater than 0 and less than or equal to 1000.
     */
    public Builder days(int days) {
      this.days = days;
      this.fieldsSet.add("days");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
