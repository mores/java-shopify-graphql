package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CustomerSmsMarketingConsentUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a [customer](https://shopify.dev/docs/api/admin-graphql/latest/objects/Customer)'s SMS marketing consent information. The customer must have a phone number on
 * their account to receive SMS marketing.
 *   
 * You can set whether the customer subscribes or unsubscribes to SMS marketing
 * and specify the [opt-in level](https://shopify.dev/docs/api/admin-graphql/latest/mutations/customerSmsMarketingConsentUpdate#arguments-input.fields.smsMarketingConsent.marketingOptInLevel).
 * Optionally include when the consent was collected and which [location](https://shopify.dev/docs/api/admin-graphql/latest/mutations/customerSmsMarketingConsentUpdate#arguments-input.fields.smsMarketingConsent.sourceLocationId) collected it.
 */
public class CustomerSmsMarketingConsentUpdateGraphQLQuery extends GraphQLQuery {
  public CustomerSmsMarketingConsentUpdateGraphQLQuery(CustomerSmsMarketingConsentUpdateInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CustomerSmsMarketingConsentUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerSmsMarketingConsentUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private CustomerSmsMarketingConsentUpdateInput input;

    private String queryName;

    public CustomerSmsMarketingConsentUpdateGraphQLQuery build() {
      return new CustomerSmsMarketingConsentUpdateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * Specifies the input fields to update a customer's SMS marketing consent information.
     */
    public Builder input(CustomerSmsMarketingConsentUpdateInput input) {
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
