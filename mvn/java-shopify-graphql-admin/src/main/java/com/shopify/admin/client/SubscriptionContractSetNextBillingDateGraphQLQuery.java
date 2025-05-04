package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * Sets the next billing date of a Subscription Contract. This field is managed by the apps.
 *         Alternatively you can utilize our
 *         [Billing Cycles APIs](https://shopify.dev/docs/apps/selling-strategies/subscriptions/billing-cycles),
 *         which provide auto-computed billing dates and additional functionalities.
 */
public class SubscriptionContractSetNextBillingDateGraphQLQuery extends GraphQLQuery {
  public SubscriptionContractSetNextBillingDateGraphQLQuery(String contractId, OffsetDateTime date,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (contractId != null || fieldsSet.contains("contractId")) {
        getInput().put("contractId", contractId);
    }if (date != null || fieldsSet.contains("date")) {
        getInput().put("date", date);
    }
  }

  public SubscriptionContractSetNextBillingDateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionContractSetNextBillingDate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String contractId;

    private OffsetDateTime date;

    private String queryName;

    public SubscriptionContractSetNextBillingDateGraphQLQuery build() {
      return new SubscriptionContractSetNextBillingDateGraphQLQuery(contractId, date, queryName, fieldsSet);
               
    }

    /**
     * The gid of the Subscription Contract to set the next billing date for.
     */
    public Builder contractId(String contractId) {
      this.contractId = contractId;
      this.fieldsSet.add("contractId");
      return this;
    }

    /**
     * The next billing date.
     */
    public Builder date(OffsetDateTime date) {
      this.date = date;
      this.fieldsSet.add("date");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
